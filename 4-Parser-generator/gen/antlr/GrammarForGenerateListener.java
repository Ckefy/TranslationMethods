// Generated from /home/polinb/IdeaProjects/MPP/ParserGenerator/src/main/java/antlr/GrammarForGenerate.g4 by ANTLR 4.7.2
package antlr;

import generator.Grammar;
import generator.subclasses.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarForGenerateParser}.
 */
public interface GrammarForGenerateListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarForGenerateParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(GrammarForGenerateParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGenerateParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(GrammarForGenerateParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGenerateParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GrammarForGenerateParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGenerateParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GrammarForGenerateParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGenerateParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(GrammarForGenerateParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGenerateParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(GrammarForGenerateParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGenerateParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImports(GrammarForGenerateParser.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGenerateParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImports(GrammarForGenerateParser.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGenerateParser#import_line}.
	 * @param ctx the parse tree
	 */
	void enterImport_line(GrammarForGenerateParser.Import_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGenerateParser#import_line}.
	 * @param ctx the parse tree
	 */
	void exitImport_line(GrammarForGenerateParser.Import_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGenerateParser#import_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_name(GrammarForGenerateParser.Import_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGenerateParser#import_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_name(GrammarForGenerateParser.Import_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGenerateParser#tokens}.
	 * @param ctx the parse tree
	 */
	void enterTokens(GrammarForGenerateParser.TokensContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGenerateParser#tokens}.
	 * @param ctx the parse tree
	 */
	void exitTokens(GrammarForGenerateParser.TokensContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGenerateParser#token_line}.
	 * @param ctx the parse tree
	 */
	void enterToken_line(GrammarForGenerateParser.Token_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGenerateParser#token_line}.
	 * @param ctx the parse tree
	 */
	void exitToken_line(GrammarForGenerateParser.Token_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGenerateParser#startState}.
	 * @param ctx the parse tree
	 */
	void enterStartState(GrammarForGenerateParser.StartStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGenerateParser#startState}.
	 * @param ctx the parse tree
	 */
	void exitStartState(GrammarForGenerateParser.StartStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGenerateParser#skip_attr}.
	 * @param ctx the parse tree
	 */
	void enterSkip_attr(GrammarForGenerateParser.Skip_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGenerateParser#skip_attr}.
	 * @param ctx the parse tree
	 */
	void exitSkip_attr(GrammarForGenerateParser.Skip_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGenerateParser#states}.
	 * @param ctx the parse tree
	 */
	void enterStates(GrammarForGenerateParser.StatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGenerateParser#states}.
	 * @param ctx the parse tree
	 */
	void exitStates(GrammarForGenerateParser.StatesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGenerateParser#state_line}.
	 * @param ctx the parse tree
	 */
	void enterState_line(GrammarForGenerateParser.State_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGenerateParser#state_line}.
	 * @param ctx the parse tree
	 */
	void exitState_line(GrammarForGenerateParser.State_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGenerateParser#parameters_state}.
	 * @param ctx the parse tree
	 */
	void enterParameters_state(GrammarForGenerateParser.Parameters_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGenerateParser#parameters_state}.
	 * @param ctx the parse tree
	 */
	void exitParameters_state(GrammarForGenerateParser.Parameters_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGenerateParser#returns_state}.
	 * @param ctx the parse tree
	 */
	void enterReturns_state(GrammarForGenerateParser.Returns_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGenerateParser#returns_state}.
	 * @param ctx the parse tree
	 */
	void exitReturns_state(GrammarForGenerateParser.Returns_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGenerateParser#rule_line}.
	 * @param ctx the parse tree
	 */
	void enterRule_line(GrammarForGenerateParser.Rule_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGenerateParser#rule_line}.
	 * @param ctx the parse tree
	 */
	void exitRule_line(GrammarForGenerateParser.Rule_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGenerateParser#parameters_rule}.
	 * @param ctx the parse tree
	 */
	void enterParameters_rule(GrammarForGenerateParser.Parameters_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGenerateParser#parameters_rule}.
	 * @param ctx the parse tree
	 */
	void exitParameters_rule(GrammarForGenerateParser.Parameters_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGenerateParser#code_block}.
	 * @param ctx the parse tree
	 */
	void enterCode_block(GrammarForGenerateParser.Code_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGenerateParser#code_block}.
	 * @param ctx the parse tree
	 */
	void exitCode_block(GrammarForGenerateParser.Code_blockContext ctx);
}