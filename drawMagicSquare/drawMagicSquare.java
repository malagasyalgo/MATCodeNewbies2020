public int [][] drawMagicSquare(int [] bottomLeft, int [] topRight) {
    //Validate the two points
    int x1 = bottomLeft[0], x2 = topRight[0];
    int y1 = topRight[1], y2 = topRight[1];
    if(x2 <= x1 || y2 <= y1) return new int[][] {};
    	
    int [] bottomRight = new int [2], topLeft = new int[2];
    	
    	
    //Compute the missing two points
    bottomRight[0] = topRight[0];
    bottomRight[1] = bottomLeft[1];
    	
    topLeft[0] = bottomLeft[0];
    topLeft[1] = topRight[1];
    	
    //Check if the four points form a square
    double a = getDistanceEuclidian(bottomLeft, bottomRight),
    	b = getDistanceEuclidian(bottomRight, topRight),
    	c = getDistanceEuclidian(topRight, topLeft),
    	d = getDistanceEuclidian(topLeft, bottomLeft);
    	
    return  round(4 * a) == round(a + b + c + d) ? new int [][] {bottomRight, topLeft} : new int[][] {};
}
public double getDistanceEuclidian(int [] point1, int [] point2) {
    double a = Math.sqrt(Math.pow(point2[0] - point1[0], 2) + Math.pow(point2[1] - point1[1], 2));
    return round(a);
}
public double round(double number) {
    return Math.round(number * 100.0) / 100.0;
}
