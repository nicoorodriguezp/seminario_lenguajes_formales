grammar Calculadora;

start: calculadora;

calculadora: defstmt;

defstmt: 'def' NAME '(' ID ',' ID ',' NAME ')' ':' matchstmt;

matchstmt: 'match' '(' NAME ')' ':' (case_suma | case_resta | case_mult | case_div | case_avrg | case_error)+;

case_suma:  'case' ('"' PLUSOP '"'   | '\'' PLUSOP   '\'') ':' 'return' plus_op;
case_resta: 'case' ('"' MINUSOP '"'  | '\'' MINUSOP  '\'') ':' 'return' minus_op;
case_mult:  'case' ('"' MULTOP '"'   | '\'' MULTOP   '\'') ':' 'return' multiply_op;
case_avrg:  'case' ('"' PERCENOP '"' | '\'' PERCENOP '\'') ':' 'return' avrg_op;
case_div:   'case' ('"' DIVIDEOP '"' | '\'' DIVIDEOP '\'') ':' divisionstmt;
case_error: 'case' '_' ':' 'raise' exception_stmt;

divisionstmt: 'if' '(' ID COMPOP INT ')' ':' 'return' divide_op 'else' ':' whilestmt;
whilestmt: 'while' '(' ID COMPOP INT ')' ':' ID IQOP int_parser 'return' divide_op;



int_parser: 'int' '(' input_stmt ')';
input_stmt: 'input' '(' MSG ')';
exception_stmt: 'Exception' '(' MSG ')';

plus_op: ID PLUSOP exp;
minus_op: ID MINUSOP exp;
multiply_op: ID MULTOP exp;
divide_op: ID DIVIDEOP exp;
avrg_op: ID MULTOP '(' divide_op ')';

term: plus_op | minus_op | multiply_op | divide_op;
exp: factor | term;
factor: ID | INT;


ID: [a-z];
NAME: (CHAR+);
MSG: '"' ((CHAR|INT)|' ')* '"' | '\''   ((CHAR|INT)|' ')*   '\'';

CHAR: [a-zA-ZáéíóúÁÉÍÓÚñÑüÜ¡¿]+;
INT: [0-9]+;

COMPOP: '==' | '!=';
IQOP: '=';

PLUSOP: '+';
MINUSOP: '-';
MULTOP: '*';
DIVIDEOP: '/';
PERCENOP: '%';

WS: [ \t\r\n]+ -> skip;