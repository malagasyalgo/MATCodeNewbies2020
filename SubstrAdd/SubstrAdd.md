**sAuDbDsItTrIaOcNt**

*[Medium]: Loops, Conditions, List*

You finished teaching addition and subtraction to your child. You gave him many exercises to do, most of the results he gave are correct, but the last ones are "wrong" in a weird way. You asked him why didn't he get the correct answers for the last operations, which are fairly easy compared to the ones he answered correctly. He laughed and told: "I did a sAuDbDsItTrIaOcNt dad!", then he explained to you what he meant by that:

- Take two numbers `a` and `b`
- For every digits of `a` and `b`, taken *from the end*:
  - do a **substration** of the last digit of `a` and the last digits of `b`
  - move to the *second to last* digits of `a` and `b`
  - do an **addition** of those digits
  - move to *the next digits*
  - do a **subtraction**, then an **addition** and *so on...* until we reach the **first** digit of the *bigger number*

Your mind was so blown by this that you decided to create a program to verify it.

__Inputs__
You are given two ingeters, `a` and `b`, which your program should do a *sAuDbDsItTrIaOcNt* on. Watch the example for more clarity.

__Output__
The result of the *sAuDbDsItTrIaOcNt* of `a` and `b`

__Rules__
Following are the rules *sAuDbDsItTrIaOcNt* and how to do *borrowing*:
- 1. Alternate **substraction** and **addition** for every couple of digits of `a` and `b` from the last digits to the first digit of the greater number
- 2. Start with *substraction*
- 3. When **substracting** digit `x` and digit `y` (`x - y`):
  - 3.1. if `x < y`, do a substraction of `y - x + borrowed` instead and borrow `-1` to the next digit.
  - 3.2. else do `x - y + borrowed` and borrow `0`.
- 4. When **adding** digit `x` and digit `y`, if `x + y + borrowed > 9`, borrow `1` else borrow `0`
- 5. Multiply the result with the *last borrowed number* **if it is `-1`**

__Examples__
- For `a = 6` and `b = 3`, the answer should be `3` => We did a simple substraction here.
- For `a = 3` and `b = 9`, the answer should be `-6` => We did `9 - 3` and borrowed `-1`, then we multipiled the result with `-1`
- For `a = 653` and `b = 17805`, the answer should be `-16242`:
  *Explanation*:
  1. We do a substraction of the last digits of `a` and `b`, which are `3` and `5`, so we do `5 - 3 + 0 = 2` and we borrow `-1` => result so far = `2`
  2. We do an addition of the next digits, which are `5` and `0`, we do `5 + 0 + (-1) = 4`, `4 <= 9` so we borrow `0` => result so far = `42`
  3. We do a substraction of the next digits, `6` and `8` => `8 - 6 + 0 = 2`, borrowed `-1` => result so far = `242`
  4. Addition of the next digits, `0` and `7` => `0 + 7 + (-1) = 6`, borrowed `0` => result so far = `6242`
  5. Lastly, substraction of `0` and `1` => `1 - 0 + 0 = 1`, borrowed `-1` => result so far = `16242`
  6. We found that `borrowed = -1`, so we multiply the result with `-1` => final result `-16242`
- For `a = 15565` and `b = 117805`, the result should be `111360`, can you tell how?

© [lucoram](https://app.codesignal.com/profile/lucoram)
