grammar Program;

// Parser Rules

sentence : program EOF
         ;

program : TEXT* RUN TEXT;



// Lexer Rules

ARTICLE : 'the' | 'an' | 'a' ;

OF : 'of' ;

RUN : 'run' | 'open' | 'launch' | 'start' | 'go' ;

CLOSE : 'close' | 'exit' | 'shut' ;

TYPE : 'application' | 'file' | 'document' | 'app' | 'browser' ;

DRINKING_VESSEL : 'cup' | 'pint' | 'shot' | 'mug' | 'glass' ;

TEXT : ('a'..'z')+ ;

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;
//command: expr EOF;
//
//expr
//:
//|RUN
//|CLOSE
//;
//
//RUN: 'run' | 'open';
//CLOSE: 'close' | 'dismiss';
//WS: [ \t\r\n]+ -> skip;