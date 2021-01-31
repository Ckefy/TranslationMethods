// Generated from Hello.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(HelloParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(HelloParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(HelloParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(HelloParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#func_def}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def(HelloParser.Func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#func_def}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def(HelloParser.Func_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(HelloParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(HelloParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#without}.
	 * @param ctx the parse tree
	 */
	void enterWithout(HelloParser.WithoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#without}.
	 * @param ctx the parse tree
	 */
	void exitWithout(HelloParser.WithoutContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#with}.
	 * @param ctx the parse tree
	 */
	void enterWith(HelloParser.WithContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#with}.
	 * @param ctx the parse tree
	 */
	void exitWith(HelloParser.WithContext ctx);
}