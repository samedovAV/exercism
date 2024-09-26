-module(leap).

-import(calendar, [is_leap_year/1]).

-export([leap_year/1]).


leap_year(_Year) -> is_leap_year(_Year).
