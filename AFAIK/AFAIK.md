*[Very Easy]: Strings, Arrays, Loops, Conditions*

As a person of an old generation, you are lost in the ocean of abbreviations that young people use on the internet nowadays, like LMAO, AFAIK, BRB, BAE, etc. You want to converse with your grandchildren with their language though. So you decided to write a program that quickly checks the meaning of any abbreviation they will throw you. One of your grandson gave you the list of all known abbreviations in `abbrList`, and a list of `expressions` that may match *one or none* of these abbreviations.

__Input__
- `abbrList`: An array of single word strings that contains a list of abbreviations, `abbrList[i]` consists of a single word with *uppercase letters only*
- `expressions`: An array of strings that contains a list of expressions, `expressions[i]` consists of *space-separated capitalized words only*.

*It's guaranteed that an abbreviation matches only one or no expression*

__Output__
An *array of integers* of **size equal** to `abbrList.length` where `output[i]` contains the **index** of the expression that matches the **`i`-th** abbreviation **OR** `-1` if **none** of the expressions match it. Watch the example for more clarity.

__Example__
- For `abbrList = ["LMAO", "AFAIK", "LOL", "TLDR"]` and `expressions = ["As Far As I Know", "Rolling Laughing Out Loud", "Laughing Out Loud", "Be Right Back", "Before Anything Else"]`, then the answer should be `[-1, 0, 2, -1]`:
  - `"LMAO"` doesn't match any of the expressions
  - `"AFAIK"` matches the expression at index `0`, which is `"As Far As I Know"`
  - `"LOL"` matches the expression at index `2`
  - `"TLDR"` doesn't match any expression

© [lucoram](https://app.codesignal.com/profile/lucoram)
