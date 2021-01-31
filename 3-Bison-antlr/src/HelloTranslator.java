import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class HelloTranslator extends HelloBaseListener {

    boolean without = false;
    boolean withoutAfter = false;
    int withoutC = 0;
    boolean guard = false;

    boolean nameFunc = false;
    boolean nameArg = false;
    boolean funcDef = false;
    boolean with = false;
    List<String> args = new ArrayList<>();
    boolean withoutAfter1 = false;
    boolean withAfter = false;
    boolean withAfter1 = false;


    StringBuilder answer = new StringBuilder();
    String margin = "         ";
    String margin1 = "    ";

    public String translate() {
        return answer.toString();
    }

    @Override
    public void enterRoot(HelloParser.RootContext ctx) {
        super.enterRoot(ctx);
    }

    @Override
    public void exitRoot(HelloParser.RootContext ctx) {
        answer.append(System.lineSeparator());
        super.exitRoot(ctx);
    }

    @Override
    public void enterStatement(HelloParser.StatementContext ctx) {
        super.enterStatement(ctx);
    }

    @Override
    public void exitStatement(HelloParser.StatementContext ctx) {
        super.exitStatement(ctx);
    }


    @Override
    public void enterFunc_def(HelloParser.Func_defContext ctx) {
        args = new ArrayList<>();
        answer.append("def ");
        nameFunc = true;
        super.enterFunc_def(ctx);
    }

    @Override
    public void exitFunc_def(HelloParser.Func_defContext ctx) {
        answer.append("(arg1");
        for (int i = 1; i < args.size() - 1; i++) {
            answer.append(", ").append("arg").append(Integer.toString(i + 1));
        }
        answer.append("): ");
        nameArg = false;
        funcDef = false;
        answer.append(System.lineSeparator());
        super.exitFunc_def(ctx);
    }

    @Override
    public void enterFunc(HelloParser.FuncContext ctx) {
        super.enterFunc(ctx);
    }

    @Override
    public void exitFunc(HelloParser.FuncContext ctx) {
        super.exitFunc(ctx);
    }

    @Override
    public void enterWithout(HelloParser.WithoutContext ctx) {
        without = true;
        super.enterWithout(ctx);
    }

    @Override
    public void exitWithout(HelloParser.WithoutContext ctx) {
        without = false;
        withoutC = 0;
        withoutAfter = false;
        withoutAfter1 = false;
        super.exitWithout(ctx);
    }


    boolean needBracket = false;

    @Override
    public void enterWith(HelloParser.WithContext ctx) {
        with = true;
        super.exitWith(ctx);
    }

    @Override
    public void exitWith(HelloParser.WithContext ctx) {
        with = false;
        withAfter = false;
        withAfter1 = false;
        guard = false;
        super.exitWith(ctx);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        throw new IllegalArgumentException("Unexpected symbol: " + node.getText());
    }



    boolean bracket = false;
    //if without guards then it should contain only numbers
    @Override
    public void visitTerminal(TerminalNode node) {

        if (nameFunc) {
            answer.append(node.getText());
            nameFunc = false;
        }
        if (node.getText().equals("::")) {
            nameArg = true;
        } else if (nameArg) {
            if (!(node.getText().contains("->") || node.getText().contains(System.lineSeparator()))) {
                args.add(node.getText());
            }
        }
        if (without) {
            if (withoutAfter) {
                answer.append(margin1).append("if (");
                int i = 0;
                for (String str : args){
                    i++;
                    answer.append("arg").append(Integer.toString(i)).append(" == ").append(args.get(i - 1));
                    if (i != args.size()){
                        answer.append(" && ");
                    } else {
                        answer.append(") then:\n");
                    }
                }
                answer.append(margin).append("return ").append(node.getText());
                withoutAfter = false;
                withoutAfter1 = true;
            } else if (withoutAfter1){
                answer.append(node.getText());
            } else {
                withoutC++;
                if (withoutC > 1) {
                    if (node.getText().equals("=")) {
                        withoutAfter = true;
                    } else if (!withoutAfter) {
                        args.add(node.getText());
                    }
                } else {
                    args = new ArrayList<>();
                }
            }
        }

        if (with){

            if (node.getText().equals("|")) {

                guard = true;
                answer.append(margin1).append("if (");
            } else if (guard){

                if (!(node.getText().equals("="))) {
                    answer.append(node.getText());
                } else {
                    withAfter = true;
                    answer.append("):\n");
                    guard = false;

                    needBracket = true;
                }
            } else if (withAfter){

                answer.append(margin).append("return ").append(node.getText());
                withAfter = false;
                withAfter1 = true;
            } else if (withAfter1) {
                answer.append(node.getText());
            }
        }
        //node.getText() + " ";
    }

}

