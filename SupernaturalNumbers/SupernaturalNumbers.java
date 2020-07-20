package MATCodeNewbies2020.SupernaturalNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class SupernaturalNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 5, 6, 0, -9, 8, -14, 25, -5, 5));

        for (List<Integer> ans : supernaturalNumbers(numbers)) {
            System.out.println(ans);
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
