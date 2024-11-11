-module(bob).

-export([response/1]).


response(String) ->
    S = string:trim(String, trailing),
    case S of
      [] -> "Fine. Be that way!";
      _ -> response(is_question(S), is_yelling(S))
    end.

response(true, true) ->
    "Calm down, I know what I'm doing!";
response(true, _) -> "Sure.";
response(_, true) -> "Whoa, chill out!";
response(_, _) -> "Whatever.".

is_question(S) -> $? =:= lists:last(S).

is_yelling(S) ->
    string:uppercase(S) =:= S andalso
      not (string:lowercase(S) =:= S).
