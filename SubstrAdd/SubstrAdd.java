package MATCodeNewbies2020.SubstrAdd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubstrAdd {
    public static void main(String[] args) {
        System.out.println(substrAdd(8, 9));
        System.out.println(substrAdd(3, 9));
        System.out.println(substrAdd(6, 10));
        System.out.println(substrAdd(7, 4));
        System.out.println(substrAdd(10, 4));
        System.out.println(substrAdd(60, 20));
        System.out.println(substrAdd(60, 60));
        System.out.println(substrAdd(40, 60));
        System.out.println(substrAdd(400, 60));
        System.out.println(substrAdd(400, 600));
        System.out.println(substrAdd(453, 629));
        System.out.println(substrAdd(600, 400));
        System.out.println(substrAdd(65, 17805));
        System.out.println(substrAdd(653, 17805));
        System.out.println(substrAdd(15565, 117805));
        System.out.println(substrAdd(115565, 117805));
        System.out.println(substrAdd(115565, 997805));
    }

    static int substrAdd(int a, int b) {
        boolean sub = true;
        List<String> resDigits = new ArrayList<>();

        int rest = 0;

        while (a > 0 || b > 0) {
            int ad = a % 10;
            int bd = b % 10;

            int r;

            if (sub) {

                if (ad < bd) {
                    int t = ad;
                    ad = bd;
                    bd = t;
                    rest = -1;
                } else {
                    rest = 0;
                }

                r = ad - bd;

            } else {
                r = ad + bd + rest;

                if (r < 10) {
                    rest = 0;
                } else {
                    r = r % 10;
                    rest = 1;
                }
            }

            resDigits.add(String.valueOf(r));
            sub = !sub;
            a /= 10;
            b /= 10;
        }

        Collections.reverse(resDigits);

        int result = Integer.parseInt((rest == 1 ? "1" : "") + String.join("", resDigits));

        if(rest < 0) {
            result *= -1;
        }

        return result;
    }
}
