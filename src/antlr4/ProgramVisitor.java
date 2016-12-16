// Generated from C:/Users/Mariusz/Downloads/speech2/src/antlr4\Program.g4 by ANTLR 4.5.3
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProgramParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProgramVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ProgramParser#someText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSomeText(ProgramParser.SomeTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(ProgramParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ProgramParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(ProgramParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(ProgramParser.CommandContext ctx);
}