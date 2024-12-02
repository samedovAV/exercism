-module(diamond).

-export([rows/1]).


rows([Letter]) -> rows(Letter, $A, (Letter - $A) * 2 + 1, []).
rows(Letter, Letter, Width, List) -> lists:reverse(List) ++ [line(Letter, Width)] ++ List;
rows(Letter, Current, Width, List) -> rows(Letter, Current + 1, Width, [line(Current, Width)|List]).

line(Letter, Width) -> lists:append(string:pad(letter(Letter), Width, both)).

letter($A) -> "A";
letter(L) -> [L] ++ lists:duplicate((L - $A) * 2 - 1, $\s) ++ [L].
