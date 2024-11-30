-module(queen_attack).

-export([can_attack/2]).

can_attack(_WhiteQueen, _BlackQueen) -> 
    can_attack_tuples(_WhiteQueen, _BlackQueen).

can_attack_tuples({X, _}, {X, _}) -> 
    true;
can_attack_tuples({_, Y}, {_, Y}) -> 
    true;
can_attack_tuples({X1, Y1}, {X2, Y2}) -> 
    abs(X1 - X2) == abs(Y1 - Y2).
