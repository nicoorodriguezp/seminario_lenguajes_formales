// Generated from Calculadora.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculadoraParser}.
 */
public interface CalculadoraListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(CalculadoraParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(CalculadoraParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#calculadora}.
	 * @param ctx the parse tree
	 */
	void enterCalculadora(CalculadoraParser.CalculadoraContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#calculadora}.
	 * @param ctx the parse tree
	 */
	void exitCalculadora(CalculadoraParser.CalculadoraContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#defstmt}.
	 * @param ctx the parse tree
	 */
	void enterDefstmt(CalculadoraParser.DefstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#defstmt}.
	 * @param ctx the parse tree
	 */
	void exitDefstmt(CalculadoraParser.DefstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#matchstmt}.
	 * @param ctx the parse tree
	 */
	void enterMatchstmt(CalculadoraParser.MatchstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#matchstmt}.
	 * @param ctx the parse tree
	 */
	void exitMatchstmt(CalculadoraParser.MatchstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#case_suma}.
	 * @param ctx the parse tree
	 */
	void enterCase_suma(CalculadoraParser.Case_sumaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#case_suma}.
	 * @param ctx the parse tree
	 */
	void exitCase_suma(CalculadoraParser.Case_sumaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#case_resta}.
	 * @param ctx the parse tree
	 */
	void enterCase_resta(CalculadoraParser.Case_restaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#case_resta}.
	 * @param ctx the parse tree
	 */
	void exitCase_resta(CalculadoraParser.Case_restaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#case_mult}.
	 * @param ctx the parse tree
	 */
	void enterCase_mult(CalculadoraParser.Case_multContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#case_mult}.
	 * @param ctx the parse tree
	 */
	void exitCase_mult(CalculadoraParser.Case_multContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#case_avrg}.
	 * @param ctx the parse tree
	 */
	void enterCase_avrg(CalculadoraParser.Case_avrgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#case_avrg}.
	 * @param ctx the parse tree
	 */
	void exitCase_avrg(CalculadoraParser.Case_avrgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#case_div}.
	 * @param ctx the parse tree
	 */
	void enterCase_div(CalculadoraParser.Case_divContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#case_div}.
	 * @param ctx the parse tree
	 */
	void exitCase_div(CalculadoraParser.Case_divContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#case_error}.
	 * @param ctx the parse tree
	 */
	void enterCase_error(CalculadoraParser.Case_errorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#case_error}.
	 * @param ctx the parse tree
	 */
	void exitCase_error(CalculadoraParser.Case_errorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#divisionstmt}.
	 * @param ctx the parse tree
	 */
	void enterDivisionstmt(CalculadoraParser.DivisionstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#divisionstmt}.
	 * @param ctx the parse tree
	 */
	void exitDivisionstmt(CalculadoraParser.DivisionstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void enterWhilestmt(CalculadoraParser.WhilestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void exitWhilestmt(CalculadoraParser.WhilestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#int_parser}.
	 * @param ctx the parse tree
	 */
	void enterInt_parser(CalculadoraParser.Int_parserContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#int_parser}.
	 * @param ctx the parse tree
	 */
	void exitInt_parser(CalculadoraParser.Int_parserContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#input_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInput_stmt(CalculadoraParser.Input_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#input_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInput_stmt(CalculadoraParser.Input_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#exception_stmt}.
	 * @param ctx the parse tree
	 */
	void enterException_stmt(CalculadoraParser.Exception_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#exception_stmt}.
	 * @param ctx the parse tree
	 */
	void exitException_stmt(CalculadoraParser.Exception_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#plus_op}.
	 * @param ctx the parse tree
	 */
	void enterPlus_op(CalculadoraParser.Plus_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#plus_op}.
	 * @param ctx the parse tree
	 */
	void exitPlus_op(CalculadoraParser.Plus_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#minus_op}.
	 * @param ctx the parse tree
	 */
	void enterMinus_op(CalculadoraParser.Minus_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#minus_op}.
	 * @param ctx the parse tree
	 */
	void exitMinus_op(CalculadoraParser.Minus_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#multiply_op}.
	 * @param ctx the parse tree
	 */
	void enterMultiply_op(CalculadoraParser.Multiply_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#multiply_op}.
	 * @param ctx the parse tree
	 */
	void exitMultiply_op(CalculadoraParser.Multiply_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#divide_op}.
	 * @param ctx the parse tree
	 */
	void enterDivide_op(CalculadoraParser.Divide_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#divide_op}.
	 * @param ctx the parse tree
	 */
	void exitDivide_op(CalculadoraParser.Divide_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#avrg_op}.
	 * @param ctx the parse tree
	 */
	void enterAvrg_op(CalculadoraParser.Avrg_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#avrg_op}.
	 * @param ctx the parse tree
	 */
	void exitAvrg_op(CalculadoraParser.Avrg_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(CalculadoraParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(CalculadoraParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(CalculadoraParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(CalculadoraParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(CalculadoraParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(CalculadoraParser.FactorContext ctx);
}