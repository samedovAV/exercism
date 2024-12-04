-module(triangle).

-export([kind/3]).

kind(A, B, C) when (A =< 0) or (B =< 0) or (C =< 0) -> {error, "all side lengths must be positive"};
kind(A, B, C) when (A + B < C) or (B + C < A) or (C + A < B) -> {error, "side lengths violate triangle inequality"};
kind(A, B, C) when A == B, B == C -> equilateral;
kind(A, B, C) when (A == B) or (B == C) or (C == A) -> isosceles;
kind(_, _, _) -> scalene.