package MATCodeNewbies2020.SupernaturalNumbers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import MATCodeNewbies2020._utils.TestGenUtils;

public class SupernaturalNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 5, 6, 0, -9, 8, -14, 25, -5, 5));

        printTest(numbers, supernaturalNumbers(numbers));

        generateTest(20, -100, 100);
        generateTest(100, -30, 30);
        generateTest(1000, -1000, 10000);
        generateTest(1000, -10000, 10000);
        generateTest(1000, -10, 10);
        generateTest(10, 0, 0);
        generateTest(10000, -50000, -5000);
        generateTest(10000, -50000, 50000);
        generateTest(100, Integer.MIN_VALUE + 10, Integer.MAX_VALUE - 10);
    }

    private static void generateTest(int arrSize, int min, int max) {

        List<Integer> numbers = Arrays.stream(TestGenUtils.generateIntArray(arrSize, min, max)).boxed()
                .collect(Collectors.toList());

        printTest(numbers, supernaturalNumbers(numbers));
    }

    static int t;

    private static void printTest(List<Integer> numbers, List<List<Integer>> supernaturalNumbers) {

        ++t;

        FileWriter writer;
        try {
            writer = new FileWriter(new File("MATCodeNewbies2020/SupernaturalNumbers/tests/test_" + t + ".txt"));
            writer.append("case_" + t + ":\n");
            writer.append("number : " + numbers + "\n\n\n\n\n");
            writer.append("EO : [");

            for (int i = 0; i < supernaturalNumbers.size(); i++) {

                String line = supernaturalNumbers.get(i).toString();

                if (i < supernaturalNumbers.size() - 1) {
                    line += ", ";
                }

                line += "\n";

                writer.append(line);
            }
            writer.append("]");

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static List<List<Integer>> supernaturalNumbers(List<Integer> numbers) {

        // remove duplicates
        numbers = new ArrayList<>(new HashSet<>(numbers));

        List<Integer> natural = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        List<Integer> supernatural = new ArrayList<>();

        for (int n : numbers) {
            if (n > 0) {
                natural.add(n);
            }
            integers.add(n);
            supernatural.add(n);
        }

        Collections.sort(natural);
        Collections.sort(integers);

        Collections.sort(supernatural, new Comparator<Integer>() {

            @Override
            public int compare(Integer a, Integer b) {

                int ar = a % 2;
                int br = b % 2;

                boolean aEven = ar == 0;
                boolean bEven = br == 0;

                if (a == 0) {
                    return bEven ? 1 : -1;
                }

                if (b == 0) {
                    return aEven ? -1 : 1;
                }

                if (aEven && bEven) {
                    return a - b;
                }

                if (!aEven && !bEven) {
                    return a < 0 && b > 0 ? 1 : a > 0 && b < 0 ? -1 : Math.abs(a) - Math.abs(b);
                }

                return Math.abs(ar) - Math.abs(br);
            }
        });

        return new ArrayList<>(Arrays.asList(natural, integers, supernatural));
    }
}
