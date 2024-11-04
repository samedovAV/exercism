-module(collatz_conjecture).

-export([steps/1]).


steps(N) ->
    steps(N, 0).

steps(0, _Acc) ->
    erlang:error(badarg);
steps(N, _Acc) when N < 0 ->
    erlang:error(badarg);
steps(1, Acc) ->
    Acc;
steps(N, Acc) when N rem 2 == 0 -> 
    steps(N div 2, Acc + 1);
steps(N, Acc) when N rem 2 /= 0 ->
    steps(N * 3 + 1, Acc + 1).
