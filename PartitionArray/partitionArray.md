**PartitionArray**

*[Very Easy]: Arrays, Loops, Conditions*

Given an array of integer, write a program which returns, in ascending order, a partition array for numbers mulitple of 2 or 3 or neither of them.
If the number is both a multiple of 2 and 3, consider it to be a multiple of 2.

__Input__
- `nums`: An array of integer to partition.The array may be empty.

__Output__
An *array of array of integers* which contains the partition of mulitple of 2 (or 2 and 3), or 3 or neither of them.

__Example__
- For `nums=[1, 2, 3, 4, 5, 6, 7, 8]`, the result should be : `[[2, 4, 6, 8], [3], [1, 5, 7]]]`
  *Explanation:*
  - `2`, `4`, and `8` are multiple of `2`
  - `6`, is a multiple of both `2` and `3`, so we consider it to be a multiple of `2`
  - `1`, `5`, `7` is not a multiple of neither `2` nor `3`

- For `nums=[2, 2, 3, 3]`, the result should be : `[[2, 2], [3, 3], []]]`

© [ramamj](https://app.codesignal.com/profile/ramamj)


