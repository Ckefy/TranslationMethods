package generated;// Generated from GramParseGrams.g4 by ANTLR 4.8

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramParseGramsParser}.
 */
public interface GramParseGramsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramParseGramsParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(GramParseGramsParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParseGramsParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(GramParseGramsParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParseGramsParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GramParseGramsParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParseGramsParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GramParseGramsParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParseGramsParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(GramParseGramsParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParseGramsParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(GramParseGramsParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParseGramsParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImports(GramParseGramsParser.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParseGramsParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImports(GramParseGramsParser.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParseGramsParser#importExpr}.
	 * @param ctx the parse tree
	 */
	void enterImportExpr(GramParseGramsParser.ImportExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParseGramsParser#importExpr}.
	 * @param ctx the parse tree
	 */
	void exitImportExpr(GramParseGramsParser.ImportExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParseGramsParser#importName}.
	 * @param ctx the parse tree
	 */
	void enterImportName(GramParseGramsParser.ImportNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParseGramsParser#importName}.
	 * @param ctx the parse tree
	 */
	void exitImportName(GramParseGramsParser.ImportNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParseGramsParser#tokens}.
	 * @param ctx the parse tree
	 */
	void enterTokens(GramParseGramsParser.TokensContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParseGramsParser#tokens}.
	 * @param ctx the parse tree
	 */
	void exitTokens(GramParseGramsParser.TokensContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParseGramsParser#tokenExpr}.
	 * @param ctx the parse tree
	 */
	void enterTokenExpr(GramParseGramsParser.TokenExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParseGramsParser#tokenExpr}.
	 * @param ctx the parse tree
	 */
	void exitTokenExpr(GramParseGramsParser.TokenExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParseGramsParser#startState}.
	 * @param ctx the parse tree
	 */
	void enterStartState(GramParseGramsParser.StartStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParseGramsParser#startState}.
	 * @param ctx the parse tree
	 */
	void exitStartState(GramParseGramsParser.StartStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParseGramsParser#skipAttr}.
	 * @param ctx the parse tree
	 */
	void enterSkipAttr(GramParseGramsParser.SkipAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParseGramsParser#skipAttr}.
	 * @param ctx the parse tree
	 */
	void exitSkipAttr(GramParseGramsParser.SkipAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParseGramsParser#states}.
	 * @param ctx the parse tree
	 */
	void enterStates(GramParseGramsParser.StatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParseGramsParser#states}.
	 * @param ctx the parse tree
	 */
	void exitStates(GramParseGramsParser.StatesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParseGramsParser#stateExpr}.
	 * @param ctx the parse tree
	 */
	void enterStateExpr(GramParseGramsParser.StateExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParseGramsParser#stateExpr}.
	 * @param ctx the parse tree
	 */
	void exitStateExpr(GramParseGramsParser.StateExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParseGramsParser#inheritState}.
	 * @param ctx the parse tree
	 */
	void enterInheritState(GramParseGramsParser.InheritStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParseGramsParser#inheritState}.
	 * @param ctx the parse tree
	 */
	void exitInheritState(GramParseGramsParser.InheritStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParseGramsParser#synthState}.
	 * @param ctx the parse tree
	 */
	void enterSynthState(GramParseGramsParser.SynthStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParseGramsParser#synthState}.
	 * @param ctx the parse tree
	 */
	void exitSynthState(GramParseGramsParser.SynthStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParseGramsParser#ruleExpr}.
	 * @param ctx the parse tree
	 */
	void enterRuleExpr(GramParseGramsParser.RuleExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParseGramsParser#ruleExpr}.
	 * @param ctx the parse tree
	 */
	void exitRuleExpr(GramParseGramsParser.RuleExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParseGramsParser#inheritRule}.
	 * @param ctx the parse tree
	 */
	void enterInheritRule(GramParseGramsParser.InheritRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParseGramsParser#inheritRule}.
	 * @param ctx the parse tree
	 */
	void exitInheritRule(GramParseGramsParser.InheritRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParseGramsParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(GramParseGramsParser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParseGramsParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(GramParseGramsParser.CodeBlockContext ctx);
}