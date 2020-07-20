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
        return rand.nextInt(high - low) + low;
    }
}
