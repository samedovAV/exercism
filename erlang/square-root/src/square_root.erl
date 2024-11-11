-module(square_root).

-export([square_root/1]).


square_root(_Radicand) -> round(math:sqrt(_Radicand)).
