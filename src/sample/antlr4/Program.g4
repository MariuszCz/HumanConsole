grammar Program;

// Parser Rules

someText: (TEXT)* ;

action : someText RUN | someText CLOSE ;

type: action (TYPE)*;

name: type TEXT someText ;

connector: name (CONNECTOR_AND)* (name)* | name (CONNECTOR_OR)* (name)* ;

command: (connector)*;

CONNECTOR_OR : 'or' | 'either' ;

CONNECTOR_AND : 'and' | 'next' | 'also' ;

RUN : 'run' | 'open' | 'launch' | 'start' | 'go' ;

CLOSE : 'close' | 'exit' | 'shut' ;

TYPE : 'application' | 'file' | 'document' | 'app' | 'browser' ;

TEXT : ('a'..'z')+ ;

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;
