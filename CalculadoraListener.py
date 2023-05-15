# Generated from Calculadora.g4 by ANTLR 4.12.0
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .CalculadoraParser import CalculadoraParser
else:
    from CalculadoraParser import CalculadoraParser

# This class defines a complete listener for a parse tree produced by CalculadoraParser.
class CalculadoraListener(ParseTreeListener):

    # Enter a parse tree produced by CalculadoraParser#start.
    def enterStart(self, ctx:CalculadoraParser.StartContext):
        pass

    # Exit a parse tree produced by CalculadoraParser#start.
    def exitStart(self, ctx:CalculadoraParser.StartContext):
        pass


    # Enter a parse tree produced by CalculadoraParser#calculadora.
    def enterCalculadora(self, ctx:CalculadoraParser.CalculadoraContext):
        pass

    # Exit a parse tree produced by CalculadoraParser#calculadora.
    def exitCalculadora(self, ctx:CalculadoraParser.CalculadoraContext):
        pass


    # Enter a parse tree produced by CalculadoraParser#defstmt.
    def enterDefstmt(self, ctx:CalculadoraParser.DefstmtContext):
        pass

    # Exit a parse tree produced by CalculadoraParser#defstmt.
    def exitDefstmt(self, ctx:CalculadoraParser.DefstmtContext):
        pass


    # Enter a parse tree produced by CalculadoraParser#matchstmt.
    def enterMatchstmt(self, ctx:CalculadoraParser.MatchstmtContext):
        pass

    # Exit a parse tree produced by CalculadoraParser#matchstmt.
    def exitMatchstmt(self, ctx:CalculadoraParser.MatchstmtContext):
        pass


    # Enter a parse tree produced by CalculadoraParser#case_suma.
    def enterCase_suma(self, ctx:CalculadoraParser.Case_sumaContext):
        pass

    # Exit a parse tree produced by CalculadoraParser#case_suma.
    def exitCase_suma(self, ctx:CalculadoraParser.Case_sumaContext):
        pass


    # Enter a parse tree produced by CalculadoraParser#case_resta.
    def enterCase_resta(self, ctx:CalculadoraParser.Case_restaContext):
        pass

    # Exit a parse tree produced by CalculadoraParser#case_resta.
    def exitCase_resta(self, ctx:CalculadoraParser.Case_restaContext):
        pass


    # Enter a parse tree produced by CalculadoraParser#case_mult.
    def enterCase_mult(self, ctx:CalculadoraParser.Case_multContext):
        pass

    # Exit a parse tree produced by CalculadoraParser#case_mult.
    def exitCase_mult(self, ctx:CalculadoraParser.Case_multContext):
        pass


    # Enter a parse tree produced by CalculadoraParser#case_avrg.
    def enterCase_avrg(self, ctx:CalculadoraParser.Case_avrgContext):
        pass

    # Exit a parse tree produced by CalculadoraParser#case_avrg.
    def exitCase_avrg(self, ctx:CalculadoraParser.Case_avrgContext):
        pass


    # Enter a parse tree produced by CalculadoraParser#case_div.
    def enterCase_div(self, ctx:CalculadoraParser.Case_divContext):
        pass

    # Exit a parse tree produced by CalculadoraParser#case_div.
    def exitCase_div(self, ctx:CalculadoraParser.Case_divContext):
        pass


    # Enter a parse tree produced by CalculadoraParser#case_error.
    def enterCase_error(self, ctx:CalculadoraParser.Case_errorContext):
        pass

    # Exit a parse tree produced by CalculadoraParser#case_error.
    def exitCase_error(self, ctx:CalculadoraParser.Case_errorContext):
        pass


    # Enter a parse tree produced by CalculadoraParser#divisionstmt.
    def enterDivisionstmt(self, ctx:CalculadoraParser.DivisionstmtContext):
        pass

    # Exit a parse tree produced by CalculadoraParser#divisionstmt.
    def exitDivisionstmt(self, ctx:CalculadoraParser.DivisionstmtContext):
        pass


    # Enter a parse tree produced by CalculadoraParser#whilestmt.
    def enterWhilestmt(self, ctx:CalculadoraParser.WhilestmtContext):
        pass

    # Exit a parse tree produced by CalculadoraParser#whilestmt.
    def exitWhilestmt(self, ctx:CalculadoraParser.WhilestmtContext):
        pass


    # Enter a parse tree produced by CalculadoraParser#int_parser.
    def enterInt_parser(self, ctx:CalculadoraParser.Int_parserContext):
        pass

    # Exit a parse tree produced by CalculadoraParser#int_parser.
    def exitInt_parser(self, ctx:CalculadoraParser.Int_parserContext):
        pass


    # Enter a parse tree produced by CalculadoraParser#input_stmt.
    def enterInput_stmt(self, ctx:CalculadoraParser.Input_stmtContext):
        pass

    # Exit a parse tree produced by CalculadoraParser#input_stmt.
    def exitInput_stmt(self, ctx:CalculadoraParser.Input_stmtContext):
        pass


    # Enter a parse tree produced by CalculadoraParser#exception_stmt.
    def enterException_stmt(self, ctx:CalculadoraParser.Exception_stmtContext):
        pass

    # Exit a parse tree produced by CalculadoraParser#exception_stmt.
    def exitException_stmt(self, ctx:CalculadoraParser.Exception_stmtContext):
        pass


    # Enter a parse tree produced by CalculadoraParser#plus_op.
    def enterPlus_op(self, ctx:CalculadoraParser.Plus_opContext):
        pass

    # Exit a parse tree produced by CalculadoraParser#plus_op.
    def exitPlus_op(self, ctx:CalculadoraParser.Plus_opContext):
        pass


    # Enter a parse tree produced by CalculadoraParser#minus_op.
    def enterMinus_op(self, ctx:CalculadoraParser.Minus_opContext):
        pass

    # Exit a parse tree produced by CalculadoraParser#minus_op.
    def exitMinus_op(self, ctx:CalculadoraParser.Minus_opContext):
        pass


    # Enter a parse tree produced by CalculadoraParser#multiply_op.
    def enterMultiply_op(self, ctx:CalculadoraParser.Multiply_opContext):
        pass

    # Exit a parse tree produced by CalculadoraParser#multiply_op.
    def exitMultiply_op(self, ctx:CalculadoraParser.Multiply_opContext):
        pass


    # Enter a parse tree produced by CalculadoraParser#divide_op.
    def enterDivide_op(self, ctx:CalculadoraParser.Divide_opContext):
        pass

    # Exit a parse tree produced by CalculadoraParser#divide_op.
    def exitDivide_op(self, ctx:CalculadoraParser.Divide_opContext):
        pass


    # Enter a parse tree produced by CalculadoraParser#avrg_op.
    def enterAvrg_op(self, ctx:CalculadoraParser.Avrg_opContext):
        pass

    # Exit a parse tree produced by CalculadoraParser#avrg_op.
    def exitAvrg_op(self, ctx:CalculadoraParser.Avrg_opContext):
        pass


    # Enter a parse tree produced by CalculadoraParser#term.
    def enterTerm(self, ctx:CalculadoraParser.TermContext):
        pass

    # Exit a parse tree produced by CalculadoraParser#term.
    def exitTerm(self, ctx:CalculadoraParser.TermContext):
        pass


    # Enter a parse tree produced by CalculadoraParser#exp.
    def enterExp(self, ctx:CalculadoraParser.ExpContext):
        pass

    # Exit a parse tree produced by CalculadoraParser#exp.
    def exitExp(self, ctx:CalculadoraParser.ExpContext):
        pass


    # Enter a parse tree produced by CalculadoraParser#factor.
    def enterFactor(self, ctx:CalculadoraParser.FactorContext):
        pass

    # Exit a parse tree produced by CalculadoraParser#factor.
    def exitFactor(self, ctx:CalculadoraParser.FactorContext):
        pass



del CalculadoraParser