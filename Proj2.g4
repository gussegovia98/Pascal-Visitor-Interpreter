grammar Proj2;

//This will import libraries as needed
@parser::header {

import java.util.*;
import java.util.HashMap;
import java.util.Map;

}

//This allows you to create member variables and functions
@parser::members {

Map<String, Boolean> bool_table = new HashMap<>();
Map<String, String> real_table = new HashMap<>();


Boolean glo = true;
}

//parser rules:

//program includes head, block and dot
program: programHeading block DOT # progExpr;
programHeading: PROGRAM identifier SEMI;
//identifier can be any letter followed by alphanumeric symbols
identifier: IDENT;

block: (variableDeclarationPart | procedureAndFunctionDeclarationPart)* compoundStatement;

compoundStatement: 'begin' statements 'end';

statements: statement (SEMI statement)*;
//different types of statements
statement:
	varDef
	| methodCall
	| sExpr
    | whileStatement
    | forStatement
	| compoundStatement
	| breakStatement
	| continueStatement
	| ifStatement
	| empty
	| expr
	| specialExpr
	| logicExpr;

procedureAndFunctionDeclarationPart: procedureOrFunctionDeclaration '.' ;

procedureOrFunctionDeclaration
                               : procedureDeclaration
                               | functionDeclaration
;

procedureDeclaration : PROCEDURE identifier (formalParameterList)? SEMI block;

formalParameterList : LPAREN formalParameterSection (SEMI formalParameterSection)* RPAREN ;


breakStatement:'break;' #breakStatementVisit
;
continueStatement:'continue' #continueStatementVisit
;



formalParameterSection
   : parameterGroup
   | VAR parameterGroup
   | FUNCTION parameterGroup
   | PROCEDURE parameterGroup
   ;

parameterGroup
   : identifierList COLON typeIdentifier
   ;

functionDeclaration
   : FUNCTION identifier (formalParameterList)? COLON resultType SEMI block
   ;

resultType
   : typeIdentifier
   ;

typeIdentifier
   : identifier
   | ('real' | 'boolean') ;

variableDeclarationPart:
	'var' variableDeclaration (SEMI variableDeclaration)* SEMI;

variableDeclaration:
	identifierList COLON a = ('boolean' | 'real') {

    //System.out.println("Here be more specific variable: " + $identifierList.text);
    //System.out.println("And here be its type: " + $a.text);

    if($a.text == "boolean"){
        bool_table.put($identifierList.text, false);
        //System.out.println("It's a boolean.");
    }
    else if($a.text == "real"){
        real_table.put($identifierList.text, "0");
    }

};

identifierList: identifier (COMMA identifier)*;

methodCall:identifier LPAREN methodArguments RPAREN
 ;

methodArguments:
    | expr (',' expr)*
;

varDef:
	identifier ':=' expr #varDefVisit
	|identifier ':=' 'true' #varTrueVisit
	|identifier ':=' 'false' #varFalseVisit
	|identifier ':=' methodCall #methodCalling
	|identifier ':=' specialExpr #varSpecial
	;

sExpr: expr { };

expr
	returns[double i]:
	'(' expr ')'  #exprParenthesis
	//| methodCall #methodCalling
	| expr '*' expr #exprMultiplication
	| expr '+' expr  #exprAddition
	| expr '-' expr #exprSubtraction
	| expr '/' expr  #exprDivision
	| identifier {} #nothig
	| INT #readDouble
	;


logicExpr
	returns[String s]:
	'('* expr '=' expr ')'* #logicEqualExprVisit
	|'('* expr '>' expr ')'* #logicGTExprVisit
	|'('* expr '>=' expr ')'* #logicGEExprVisit
	|'('* expr '<' expr ')'* #logicLTExprVisit
	|'('* expr '<=' expr ')'* #logicLEExprVisit
	|'('* expr '<>' expr ')'* #logicNotEqualExprVisit
	;

variable: (AT identifier | identifier) (
		LBRACK expr (COMMA expr)* RBRACK
		| LBRACK2 expr (COMMA expr)* RBRACK2
		| DOT identifier
		| POINTER
	)*;

empty:;

specialExpr:
	  'readln' LPAREN identifier RPAREN #specialExprReadln
	| 'writeln' LPAREN ('\'')? (INT | identifier)+ ('\'')? RPAREN #specialExprWriteln
	| 'sqrt' LPAREN expr RPAREN #specialExprSqrt
	| 'sin' LPAREN expr RPAREN #specialExprSin
	| 'cos' LPAREN expr RPAREN #specialExprCos
	| 'ln' LPAREN expr RPAREN #specialExprLn
	| 'exp' LPAREN expr RPAREN #specialExprExp
    ;
/*specialExpr[return double s]: 'writeln' LPAREN identifier identifier RPAREN
 {System.out.println(identifier);};
 */
term: factor ((MUL | DIV | FLOAT_DIV) factor)*;

factor:
	PLUS factor
	| MINUS factor
	| INTEGER_CONST
	| REAL_CONST
	| LPAREN expr RPAREN
	| variable
	| INT
	| DOUBLE
	| bool
	| BOOL;

bool: TRUE | FALSE;

ifStatement:
	'if' logicExpr 'then'  statement (
		';' 'else'  statement
	)? #ifElseBlock;

whileStatement:
    'while' logicExpr 'do' compoundStatement
    #whileStateBlock
   ;

/* if_statement: IF condition THEN ... { if( $condition.b ) //return the result of the first block
 else //return the result of the second block };
 */

forStatement:
    'for' varDef 'to' INT 'do' compoundStatement
    #forStateBlock
    ;

//lexer rules:
PROGRAM: P R O G R A M;
BEGIN: B E G I N;
END: E N D;
STATEMENT: S T A T E M E N T;
FUNCTION: F U N C T I O N;
PROCEDURE: P R O C E D U R E;
INT: [0-9]+;

DOUBLE: INT+ DOT INT+ | DOT INT+ | INT+;

COMMENT_1: '(*' .*? '*)' -> skip;
COMMENT_2: '{' .*? '}' -> skip;

//token time
fragment A: ('a' | 'A');
fragment B: ('b' | 'B');
fragment C: ('c' | 'C');
fragment D: ('d' | 'D');
fragment E: ('e' | 'E');
fragment F: ('f' | 'F');
fragment G: ('g' | 'G');
fragment H: ('h' | 'H');
fragment I: ('i' | 'I');
fragment J: ('j' | 'J');
fragment K: ('k' | 'K');
fragment L: ('l' | 'L');
fragment M: ('m' | 'M');
fragment N: ('n' | 'N');
fragment O: ('o' | 'O');
fragment P: ('p' | 'P');
fragment Q: ('q' | 'Q');
fragment R: ('r' | 'R');
fragment S: ('s' | 'S');
fragment T: ('t' | 'T');
fragment U: ('u' | 'U');
fragment V: ('v' | 'V');
fragment W: ('w' | 'W');
fragment X: ('x' | 'X');
fragment Y: ('y' | 'Y');
fragment Z: ('z' | 'Z');

IDENT: ('a' .. 'z' | 'A' .. 'Z') (
		'a' .. 'z'
		| 'A' .. 'Z'
		| '0' .. '9'
		| '_'
	)*;

VAR: V A R;
INTEGER: I N T E G E R;
REAL: R E A L;
INTEGER_CONST: I N T E G E R C O N S T;
REAL_CONST: R E A L C O N S T;
INTEGER_DIV: I N T E G E R D I V;
FLOAT_DIV: F L O A T D I V;

TRUE: T R U E;
FALSE: F A L S E;

PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
//STAR: '*'; SLASH: '/';
ASSIGN: ':=';
COMMA: ',';
SEMI: ';';
COLON: ':';
EQUAL: '=';
NOT_EQUAL: '<>';
LT: '<';
LE: '<=';
GE: '>=';
GT: '>';
LPAREN: '(';
RPAREN: ')';
LBRACK: '[';
LBRACK2: '(.';
RBRACK: ']';
RBRACK2: '.)';
POINTER: '^';
AT: '@';
DOT: '.';
DOTDOT: '..';
LCURLY: '{';
RCURLY: '}';
UNIT: U N I T;
BOOL: B O O L E A N;
ID: I D;
BLOCK: B L O C K;
IF: I F;
THEN: T H E N;
ELSE: E L S E;
WS: [ \t\r\n]+ -> channel(HIDDEN);