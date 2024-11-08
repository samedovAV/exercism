-module(rna_transcription).

-export([to_rna/1]).


to_rna(_Strand) -> 
    to_rna(_Strand, []).

to_rna([], Acc) ->
    lists:reverse(Acc);
to_rna([X | Xs], Acc) ->
    Converted = convert(X),
    to_rna(Xs, [Converted | Acc]).

convert($G) -> $C;
convert($C) -> $G;
convert($T) -> $A;
convert($A) -> $U.