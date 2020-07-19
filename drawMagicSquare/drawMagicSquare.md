**DrawMagicSquare**

*[Easy]: Geometry, Mathematics*

The drawMagicSquare is a square where we can draw it from its bottom left point and its top right point. Given two points, bottom left and top right of the square, 
return the missing top left and bottom right points, where the 4 points can form a square. If the bottom left and top right is not valid or you can't draw a square from the two points , return an empty array.

__Input__

- `bottomLeft`: An array of integer, which contains the `horizontal axis x` and `vertical axis y`.
- `topRight`: An array of integer, which contains the `horizontal axis x` and `vertical axis y`.

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
