grammar Program;

// Parser Rules

someText: (TEXT)* ;

action : someText RUN | someText CLOSE ;

type: action TYPE;

name: type TEXT someText ;

//connector: name (CONNECTOR_AND)* (name)* | name (CONNECTOR_OR)* (name)* ;

command: (name)*;

CONNECTOR_OR : 'or' | 'either' ;

CONNECTOR_AND : 'and' | 'next' | 'also' ;

RUN : 'run' | 'open' | 'launch' | 'start' | 'go' | 'search' ;

CLOSE : 'close' | 'exit' | 'shut' | 'stop' | 'break';

TYPE : 'application' | 'file' | 'document' | 'app' | 'browser' | 'page' |'www' | 'video' | 'film' | 'article' | 'program';

TEXT : ('A'..'Z'|'a'..'z'|[.])+ ;

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;
