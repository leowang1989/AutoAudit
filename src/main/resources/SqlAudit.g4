grammar SqlAudit;

auditRule: expr EOF;

expr returns [boolean result]
	: function '(' funcParamList? ')'	#functionCall
	| '(' expr ')'						#bracketExpr
	| left=expr operator=AND right=expr	#logicalBinary
	| left=expr operator=OR right=expr	#logicalBinary
	;
	
// definitions of functions
function
	: CONDITIONIS
	| EXISTLIMIT
	;

// arguments list
funcParamList: params+=funcParam (',' params+=funcParam)* ;

funcParam
	: compOperator
	| predicate
	| ID
	;

predicate
	: BETWEEN
	| IN
	;

compOperator	
	: EQ
	| NSEQ
	| NEQ
	| NEQJ
	| LT
	| LTE
	| GT
	| GTE
	;

// keywords list
CONDITIONIS: 'CONDITIONIS';
EXISTLIMIT: 'EXISTLIMIT';
AND: 'AND';
OR: 'OR';
BETWEEN: 'BETWEEN';
IN: 'IN';
EQ: '=' | '==';
NSEQ: '<=>';
NEQ: '<>';
NEQJ: '!=';
LT: '<';
LTE: '<=' | '!>';
GT: '>';
GTE: '>=' | '!<';

ID: LETTER (LETTER | [0-9])* ;
fragment
LETTER: [a-zA-Z] ;

LINE_COMMENT
	: '//' .*? '\n' -> skip
	;
	
WS: [ \t\n\r]+ -> skip ;
