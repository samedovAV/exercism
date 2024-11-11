-module(hamming).

-export([distance/2]).


distance(X, X) when length(X) > 0 -> 0;
distance(X, Y) ->
    distance(X, Y, 0).

distance([], [], Acc) -> Acc;
distance([], _, _) -> {error, badarg};
distance(_, [], _) -> {error, badarg};
distance([X | Xs], [X | Ys], Acc) -> distance(Xs, Ys, Acc);
distance([_ | Xs], [_ | Ys], Acc) -> distance(Xs, Ys, Acc + 1).
