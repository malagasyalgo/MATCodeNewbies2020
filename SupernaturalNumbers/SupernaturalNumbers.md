*[Bonus]: Arrays, Comparator, Sorting*

Natural numbers (N) are a set of whole numbers starting from 1 upwards (1, 2, 3, ..., +Infinity).

Integers (Z) are a set of *signed* whole numbers and including `0` (-Infinity, ..., -3, -2, -1, 0, 1, 2, 3, ..., +Infinity)

Supernatural numbers (S) are a set of whole numbers where:
 - **all even** numbers are considered **smaller than `0`**, and
 - **all odd** numbers are considered **greater than `0`**, and
 - **The smallest** number is a **negative even** number (-Infinity % 2 == 0),
 - **The greatest** number is a **NEGATIVE odd** number (+Infinity % 2 == -1)

Given a *list* of `numbers`, return **three (3) sets** of numbers where:
- The first set contains the *found* Natural numbers from the list
- The second set contains the *found* Integers
- The last set contains the *found* supernatural numbers

Watch the examples for better understanding

__Examples__
- For `numbers = [2, 5, 6, 0, -9, 8, -14, 25, -5, 5]`, the answer should be
  ```
  [
    [2, 5, 6, 8, 25],
    [-14, -9, -5, 0, 2, 5, 6, 8, 25],
    [-14, 2, 6, 8, 0, 5, 25, -5, -9]
  ]
  ```
