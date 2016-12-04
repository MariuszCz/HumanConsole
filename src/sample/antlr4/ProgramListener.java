// Generated from C:/Users/Mariusz/Documents/HumanConsole/src/sample/antlr4\Program.g4 by ANTLR 4.5.3
package sample.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProgramParser}.
 */
public interface ProgramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProgramParser#someText}.
	 * @param ctx the parse tree
	 */
	void enterSomeText(ProgramParser.SomeTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#someText}.
	 * @param ctx the parse tree
	 */
	void exitSomeText(ProgramParser.SomeTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(ProgramParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(ProgramParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ProgramParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ProgramParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(ProgramParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(ProgramParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#connector}.
	 * @param ctx the parse tree
	 */
	void enterConnector(ProgramParser.ConnectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#connector}.
	 * @param ctx the parse tree
	 */
	void exitConnector(ProgramParser.ConnectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(ProgramParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(ProgramParser.CommandContext ctx);
}