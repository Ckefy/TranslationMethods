grammar GramParseGrams;

@header {
import generator.Grammar;
import generator.atoms.*;
}

start returns [Grammar gram]
@init {
    $gram = new Grammar();
}: program[$gram] EOF;

program[Grammar gram]: header[$gram] imports[$gram] tokens[$gram] startState[$gram] states[$gram];



header[Grammar gram]: 'grammar' NAME ';' {
    $gram.setName($NAME.text);
};



imports[Grammar gram]: '@imp' '{' importExpr[$gram]* '}';

importExpr[Grammar gram]: ('import' importName {$gram.addImport($importName.name.toString());} ';');

importName returns[StringBuilder name]
@init {
    $name = new StringBuilder();
}: n1=NAME {$name.append($n1.text);} ('.' n2=NAME {$name.append('.').append($n2.text);})*;



tokens[Grammar gram]: '@tokens' '{' tokenExpr[$gram]* '}';

tokenExpr[Grammar gram] locals [boolean skipTokens]
@init {
    $skipTokens = false;
}: NAME ':' REGEX (skipAttr {$skipTokens = true;})? ';' {
    if ($skipTokens) {
        $gram.addSkipToken($NAME.text, $REGEX.text);
    } else {
        $gram.addToken($NAME.text, $REGEX.text);
    }
};





startState[Grammar gram]: '@start' '=' NAME ';' {
    $gram.setStartState($NAME.text);
};

skipAttr : '->' 'skip';



states[Grammar gram]: '@states' '{' (stateExpr {$gram.addState($stateExpr.state);})+ '}';

stateExpr returns [State state]
@init {
    $state = new State();
}: NAME {$state.setName($NAME.text);}
          ('[' inheritState[$state] ']')? ('returns' '[' synthState[$state] ']')?
           ':' r1=ruleExpr {$state.addRule($r1.r);} ('|' r2=ruleExpr {$state.addRule($r2.r);})* ';';

inheritState[State state] : type1=NAME name1=NAME {$state.addParameter($type1.text, $name1.text);}
                               (',' type2=NAME name2=NAME {$state.addParameter($type2.text, $name2.text);})*;

synthState[State state] : type1=NAME name1=NAME {$state.addReturn($type1.text, $name1.text);}
                               (',' type2=NAME name2=NAME {$state.addReturn($type2.text, $name2.text);})*;

ruleExpr returns [Rule r] locals [StringBuilder parameters, StringBuilder code]
@init {
    $r = new Rule();
    $parameters = new StringBuilder();
    $code = new StringBuilder();
}: (NAME (inheritRule[$parameters])? (codeBlock[$code])?
    {$r.addItem($NAME.text, $parameters.toString(), $code.toString());
    $parameters = new StringBuilder();
    $code = new StringBuilder();})+;

inheritRule[StringBuilder s] : '[' n1=NAME {$s.append($n1.text);} (',' n2=NAME {$s.append(", ").append($n2.text);})* ']';

codeBlock[StringBuilder s] : CODETEXT {
        $s.append($CODETEXT.text);
        $s.deleteCharAt(0);
        $s.deleteCharAt($s.length() - 1);
    };

WS: [ \t\n]+ -> skip;
NAME : [a-zA-Z][a-zA-Z0-9_]*;
REGEX : '"' (~('"'))* '"';
CODETEXT: '`' (~('`'))+ '`';
