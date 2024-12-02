-module(series).

-export([slices/2]).

slices(N, _) when N =< 0 -> 
    error(badarg);
slices(N, L) when length(L) < N -> 
    error(badarg);
slices(N, L) ->
    [string:slice(L, X, N) || X <- lists:seq(0, length(L) - N)].
