-module(difference_of_squares).

-export([difference_of_squares/1, square_of_sum/1, sum_of_squares/1]).

difference_of_squares(Number) -> 
    square_of_sum(Number) - sum_of_squares(Number).

square_of_sum(Number) ->
    Sum = lists:sum(lists:seq(1, Number)), 
    Sum * Sum.

sum_of_squares(Number) ->
    lists:sum([X * X || X <- lists:seq(1, Number)]).
