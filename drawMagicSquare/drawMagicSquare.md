**DrawMagicSquare**

*[Easy]: Geometry, Mathematics*

The drawMagicSquare is a square that we can draw from its bottom left point and its top right point. Given two points, bottom left and top right of the square, 
return the missing top left and bottom right points, where the 4 points can form a square. If the bottom left and top right is not valid or you can't draw a square from the two points, return an empty array.

__Input__

- `bottomLeft`: An array of integer, which contains the `horizontal axis x` and `vertical axis y`.
- `topRight`: An array of integer, which contains the `horizontal axis x` and `vertical axis y`.

__Output__

An *array of array of integers* which contains, respectively, the top left and bottom right points if the square exists.

__Example__

- For `bottomLeft=[0,0]` and `topRight=[2,2]`, the result should be : `[[2,0], [0,2]]`
  *Explanation:*
  - `[2,0]` is the `topleft`coordinate of the square.
  - `[0,2]` is the `bottomRight`coordinate of the square.

- For `bottomLeft=[0,0]` and `topRight=[-1,-1]`, the result should be : `[]`
  *Explanation:*
  - The `topRight` is not a valid `topRight` coordinate to form a square.

© [ramamj](https://app.codesignal.com/profile/ramamj)
