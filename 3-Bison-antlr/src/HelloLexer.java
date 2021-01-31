// Generated from Hello.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, COMPARE=8, OPS=9, 
		NAME=10, LETTER=11, INT=12, NEWLINE=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "COMPARE", "OPS", 
			"NAME", "LETTER", "INT", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'::'", "'->'", "'='", "'|'", "'('", "')'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "COMPARE", "OPS", "NAME", 
			"LETTER", "INT", "NEWLINE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public HelloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20a\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t:\n\t\3\n\3\n\3\13\3\13\5\13@\n\13\3\13\3\13\3\13\7\13E\n\13\f"+
		"\13\16\13H\13\13\3\f\3\f\3\r\6\rM\n\r\r\r\16\rN\3\16\5\16R\n\16\3\16\3"+
		"\16\7\16V\n\16\f\16\16\16Y\13\16\3\17\6\17\\\n\17\r\17\16\17]\3\17\3\17"+
		"\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\3\2\4\5\2\'\',-//\4\2C\\c|\2m\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\3\37\3\2\2\2\5\"\3\2\2\2\7%\3\2\2\2\t\'\3\2\2\2\13)\3\2\2\2\r+\3"+
		"\2\2\2\17-\3\2\2\2\219\3\2\2\2\23;\3\2\2\2\25?\3\2\2\2\27I\3\2\2\2\31"+
		"L\3\2\2\2\33Q\3\2\2\2\35[\3\2\2\2\37 \7<\2\2 !\7<\2\2!\4\3\2\2\2\"#\7"+
		"/\2\2#$\7@\2\2$\6\3\2\2\2%&\7?\2\2&\b\3\2\2\2\'(\7~\2\2(\n\3\2\2\2)*\7"+
		"*\2\2*\f\3\2\2\2+,\7+\2\2,\16\3\2\2\2-.\7.\2\2.\20\3\2\2\2/\60\7?\2\2"+
		"\60:\7?\2\2\61\62\7#\2\2\62:\7?\2\2\63:\7>\2\2\64\65\7>\2\2\65:\7?\2\2"+
		"\66:\7@\2\2\678\7@\2\28:\7?\2\29/\3\2\2\29\61\3\2\2\29\63\3\2\2\29\64"+
		"\3\2\2\29\66\3\2\2\29\67\3\2\2\2:\22\3\2\2\2;<\t\2\2\2<\24\3\2\2\2=@\5"+
		"\27\f\2>@\7a\2\2?=\3\2\2\2?>\3\2\2\2@F\3\2\2\2AE\5\27\f\2BE\7a\2\2CE\5"+
		"\31\r\2DA\3\2\2\2DB\3\2\2\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\26"+
		"\3\2\2\2HF\3\2\2\2IJ\t\3\2\2J\30\3\2\2\2KM\4\62;\2LK\3\2\2\2MN\3\2\2\2"+
		"NL\3\2\2\2NO\3\2\2\2O\32\3\2\2\2PR\7\17\2\2QP\3\2\2\2QR\3\2\2\2RS\3\2"+
		"\2\2SW\7\f\2\2TV\7\"\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\34\3"+
		"\2\2\2YW\3\2\2\2Z\\\7\"\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^"+
		"_\3\2\2\2_`\b\17\2\2`\36\3\2\2\2\13\29?DFNQW]\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}