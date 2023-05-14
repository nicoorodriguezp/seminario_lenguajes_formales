grammar Calculadora;

start: calculadora;

calculadora: defstmt;

defstmt: 'def' NAME '(' ID ',' ID ',' NAME ')' ':' matchstmt;

matchstmt: 'match' '(' NAME ')' ':' case_suma case_resta case_mult case_div case_avrg case_error;

case_suma:  'case' ('"' '+' '"' | '\'' '+' '\'') ':' 'return' ID '+' ID;
case_resta: 'case' ('"' '-' '"' | '\'' '-' '\'') ':' 'return' ID '-' ID;
case_mult:  'case' ('"' '*' '"' | '\'' '*' '\'') ':' 'return' ID '*' ID;
case_avrg:  'case' ('"' '%' '"' | '\'' '%' '\'') ':' 'return' ID '*' '(' ID '/' '100' ')';
case_div:   'case' ('"' '/' '"' | '\'' '/' '\'') ':' divisionstmt;

divisionstmt: 'if' '(' ID COMPOP INT ')' ':' 'return' ID '/' ID 'else' ':' whilestmt;

whilestmt: 'while' '(' ID COMPOP INT ')' ':' ID OPERATOR int_parser 'return' ID '/' ID;

case_error: 'case' '_' ':' 'raise' exception_stmt;

int_parser: 'int' '(' input_stmt ')';
input_stmt: 'input' '(' MSG ')';
exception_stmt: 'Exception' '(' MSG ')';

ID: [a-z];
NAME: (CHAR+);
MSG: '"' ((CHAR|INT)|' ')* '"' | '\''   ((CHAR|INT)|' ')*   '\'';
CHAR: [a-zA-ZáéíóúÁÉÍÓÚñÑüÜ¡¿]+;
INT: [0-9]+;
COMPOP: '==' | '!=';
OPERATOR: '+' | '-' | '*' | '/' | '='|;


WS: [ \t\r\n]+ -> skip;