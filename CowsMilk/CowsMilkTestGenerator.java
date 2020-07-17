package MATCodeNewbies2020.CowsMilk;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CowsMilkTestGenerator {

    static int nbTest = 10;
    static int maxSize = 100000;
    static String testFolder = "MATCodeNewbies2020/CowsMilk/tests/test_";
    static String EOFolder = "MATCodeNewbies2020/CowsMilk/tests/exp_out_";
    static Random rand = new Random();

    public static void main(String[] args) throws IOException {

        // for (int i = 0; i < nbTest; i++) {

        // int arrSize = numberBetween((int) Math.pow(i, 2), (int) Math.pow(Math.pow(2,
        // i), 2)) % maxSize;
        // int[] boundaries = calcBoundaries(arrSize);

        // generateTest(arrSize, boundaries, i + 1);
        // }

        for (int i = 1; i <= nbTest; i++) {
            solve(i);
        }
    }

    private static void solve(int t) throws IOException {

        Scanner reader = new Scanner(new File(testFolder + t + ".txt"));
        List<Integer> cow = new ArrayList<>();
        int day = 0;

        while (reader.hasNextLine()) {
            String line = reader.nextLine();

            if (line.startsWith("cow")) {
                line = line.replaceAll("[^0-9,]", "");

                for (String val : line.split(",")) {
                    if (val.isEmpty()) {
                        continue;
                    }
                    cow.add(Integer.parseInt(val));
                }
            }

            if (line.startsWith("day")) {
                line = line.replaceAll("[^0-9]", "");
                day = Integer.parseInt(line);
            }
        }

        long result = CowsMilk.cowsMilk(cow.stream().mapToInt(i -> i).toArray(), day);

        print(result, t);
    }

    private static void print(long result, int t) throws IOException {

        FileWriter writer = new FileWriter(new File(EOFolder + t + ".txt"));
        writer.append("case_" + t + ": " + result);
        writer.close();
    }

    private static void generateTest(int arrSize, int[] boundaries, int t) throws IOException {

        StringBuilder sb = new StringBuilder();

        sb.append("cow : [");

        for (int i = 1; i <= arrSize; i++) {

            int current = numberBetween(boundaries[0], boundaries[1]);
            sb.append(current);

            if (i < arrSize) {
                sb.append(", ");
            }
        }

        sb.append("]\nday : " + boundaries[2]);

        FileWriter writer = new FileWriter(new File(testFolder + t + ".txt"));
        writer.write(sb.toString());
        writer.close();
    }

    private static int[] calcBoundaries(int arrSize) {

        int[] boundaries = new int[3];

        if (maxSize - arrSize > 60000) {
            boundaries[0] = numberBetween(0, 50000);
            boundaries[1] = numberBetween(boundaries[0], 100000);
            boundaries[2] = numberBetween(1, 100000);
        } else if (maxSize - arrSize > 10000) {
            boundaries[0] = numberBetween(0, 10000);
            boundaries[1] = numberBetween(boundaries[0], 20000);
            boundaries[2] = numberBetween(1, 1000);
        } else {
            boundaries[0] = numberBetween(0, 100);
            boundaries[1] = numberBetween(boundaries[0], 200);
            boundaries[2] = numberBetween(1, 1000);
        }

        return boundaries;
    }

    public static int numberBetween(int low, int high) {
        return rand.nextInt(high - low) + low;
    }
}
