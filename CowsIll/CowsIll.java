package MATCodeNewbies2020.CowsIll;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import MATCodeNewbies2020._utils.TestGenUtils;

public class CowsIll {
    public static void main(String[] args) {

        int[][] sickDay = {
            {},
            {0},
            {1, 2},
            {},
            {}
        };

        int[] cow = {2, 3, 1};

        // printTest(cow, sickDay, cowsIll(cow, sickDay));

        // generateTest(10, 10, 0, 5);
        // generateTest(50, 20, 10, 50);
        // generateTest(100, 100, 0, 100);
        // generateTest(100, 100, 1000, 10000);
        generateTest(1000, 100, 10, 100);
        generateTest(10000, 100, 10, 100);
        generateTest(100, 100, 10000, 100000);
        generateTest(100, 100, 10000, 100000);
        generateTest(100, 100, 10000, 100000);
    }

    private static void generateTest(int nbCows, int nbDays, int cowMinMilk, int cowMaxMilk) {

        int[][] sickDay = TestGenUtils.generateInt2DArray(nbDays, 0, nbCows, 0, nbCows - 1);

        int[] cow = TestGenUtils.generateIntArray(nbCows, cowMinMilk, cowMaxMilk);

        printTest(cow, sickDay, cowsIll(cow, sickDay));

    }

    static int t = 5;

    private static void printTest(int[] cow, int[][] sickday, long result) {

        ++t;

        FileWriter writer;
        try {
            writer = new FileWriter(new File("MATCodeNewbies2020/CowsIll/tests/test_" + t + ".txt"));
            writer.append("case_" + t + ":\n");
            writer.append("cow : " + Arrays.toString(cow) + "\n\n\n\n\n");
            writer.append("sickday : " + Arrays.deepToString(sickday) + "\n\n\n\n\n");
            writer.append("EO : " + result);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static long cowsIll(int[] cow, int[][] sickDay) {
        List<Cow> allCows = buildCows(cow);

        long totalMilk = 0;

        for (int[] sick : sickDay) {
            for (int index : sick) {
                Cow sickCow = allCows.get(index);
                sickCow.sickRecov = 3;
            }

            for (Cow co : allCows) {
                if (co.sickRecov > 0) {
                    co.sickRecov--;
                    continue;
                }

                totalMilk += co.milkPerDay;
            }
        }

        return totalMilk;
    }

    static List<Cow> buildCows(int[] cow) {
        List<Cow> allCows = new ArrayList<>();

        for (int m : cow) {
            allCows.add(new Cow(m));
        }

        return allCows;
    }
}

class Cow {
    int sickRecov;
    int milkPerDay;

    public Cow(int milkPerDay) {
        this.sickRecov = 0;
        this.milkPerDay = milkPerDay;
    }
}
