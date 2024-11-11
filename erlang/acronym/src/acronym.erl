-module(acronym).

-export([abbreviate/1]).


abbreviate(_Phrase) -> 
    [H || [H | _T] <- string:lexemes(string:uppercase(_Phrase), " -_")].
