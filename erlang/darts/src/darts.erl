-module(darts).

-export([score/2]).

score(X, Y) ->
    Distance = math:sqrt(X*X + Y*Y),
    case Distance of
        Distance when Distance =< 1 -> 10;
        Distance when Distance =< 5 -> 5;
        Distance when Distance =< 10 -> 1;
        _ -> 0
    end.
