package MATCodeNewbies2020._utils;

import java.util.Random;

public class TestGenUtils {

    static Random rand = new Random();

    public static int[][] generateInt2DArray(int size, int rowMin, int rowMax, int min, int max) {
        int[][] two2Array = new int[size][];

        for(int i = 0; i < size; i++) {
            two2Array[i] = generateIntArray(numberBetween(rowMin, rowMax), min, max);
        }

        return two2Array;
    }

    public static int[] generateIntArray(int size, int min, int max) {
        int[] array = new int[size];

        for(int i = 0; i < size; i++) {
            array[i] = numberBetween(min, max);
        }

        return array;
    }

    public static int numberBetween(int low, int high) {

        if(low == high) {
            return low;
        }

        if(low < 0 && high < 0) {
            high *= -1;
            low *= -1; 
            return -1 * rand.nextInt(low - high) + high;
        }

        if(low < 0 && high > 0) {
            boolean takeLow = rand.nextInt(2) == 1;

            if(takeLow) {
                low *= -1;
                return -1 * rand.nextInt(low);
            }

            return rand.nextInt(high);
        }

        return rand.nextInt(high - low) + low;
    }
}
