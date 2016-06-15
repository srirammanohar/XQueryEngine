/**
 * Define a grammar called xml
 */
grammar xml;


query 			: xquery
				;

absolute_path 	: document openBracket fileName closeBracket '/' relative_path 		#apchild
				| document openBracket fileName closeBracket '//' relative_path		#apdesc
				;

document		: 'doc'|'document'|'DOC'|'DOCUMENT'			#docu
				;

fileName		: (headerString)			#file_header
				| (nameString) 				#file_name
				;

relative_path	: tagName 									#rp_tag	
				| '*' 										#rp_anychild
				| '.' 										#rp_dot
				| '..'										#rp_dotdot
				| 'text()'									#rp_text
				| '@'attName								#rp_attribute
				| '('relative_path')' 						#rp_simple
				| relative_path'/'relative_path				#rp_rp
				| relative_path'//'relative_path 			#rp_descrp
				| relative_path'['filter']' 				#rp_filter
				| relative_path ','relative_path			#rp_comma
				;
tagName			: nameString								#tag_name
				;
attName			: nameString								#att_name
				;
filter			: relative_path 							#filter_rp
				| relative_path '=' relative_path			#filter_equal 
				| relative_path 'eq' relative_path			#filter_eq
				| relative_path '==' relative_path			#filter_eqeq
				| relative_path 'is' relative_path			#filter_is
				| '('filter')'								#filter_simple
				| filter 'and' filter						#filter_and
				| filter 'or' filter						#filter_or
				| 'not' filter								#filter_not
				;

headerString	:	AlphaNumeric ('.' AlphaNumeric)*
				;
nameString		:	AlphaNumeric
				;
AlphaNumeric	: [a-zA-Z_] [a-zA-Z_0-9!-]*   //('a'..'z')|'A'..'Z'|'0'..'9'|'.'
				;
openBracket		:	'('
				;
closeBracket	:	')'
				;


xquery 			: var   																#x_var
			   	| String_literal   													 	#x_str
			   	| absolute_path     													#x_ap
			   	| '(' xquery ')'     													#x_simple
			   	| xquery ',' xquery      												#xInd
			   	| xquery '/' relative_path      										#x_slash
			   	| xquery '//' relative_path   											#x_desc
			   	| '<' lt=nameString'>' '{' xquery '}' '</' rt=nameString '>'    		#x_node
			   	| forClause (letClause)? (whereClause)? returnClause 					#x_state
			   	| letClause xquery   													#xLet
			   	| 'join' '(' left=xquery ',' right=xquery ',' leftlist=joinattr ',' rightlist=joinattr ')' #xJoin
			   	;
joinattr		: '[' ( id (',' id)*)* ']';


id 				: AlphaNumeric 
				;


forClause 		: 'for' var 'in' xquery (',' var 'in' xquery)* 
				; 
letClause 		: 'let' var ':=' xquery (',' var ':=' xquery)*
 				;
whereClause 	: 'where' cond 
				;
returnClause 	: 'return' xquery 
				;

cond 			: left=xquery '=' right=xquery             						 	#condEq
			    | left=xquery 'eq' right=xquery             						#condEq
			    | left=xquery '==' right=xquery             						#condIs
			    | left=xquery 'is' right=xquery             						#condIs
			    | 'empty''(' xquery ')'      										#condEmp
			    | 'some' var 'in' xquery (',' var 'in' xquery)* 'satisfies' cond  	#condSome
			    | '(' cond ')'           											#condPlain
			    | left=cond 'and' right=cond        								#condAnd
			    | left=cond 'or' right=cond         								#condOr
			    | 'not' cond                       				 					#condNot
			    ;



var 			: '$'AlphaNumeric
				;
String_literal 	: [^"][_A-Za-z0-9-.!;, ]*["$]
				;
WHITESPACE		: [\t\n\r ]+ -> skip
				;







