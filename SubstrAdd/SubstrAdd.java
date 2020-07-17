package MATCodeNewbies2020.SubstrAdd;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubstrAdd {
    public static void main(String[] args) {
        System.out.println(sAuDbDsItTrIaOcNt(8, 9));
        System.out.println(sAuDbDsItTrIaOcNt(3, 9));
        System.out.println(sAuDbDsItTrIaOcNt(653, 17805));
        System.out.println(sAuDbDsItTrIaOcNt(6, 10));
        System.out.println(sAuDbDsItTrIaOcNt(7, 4));
        System.out.println(sAuDbDsItTrIaOcNt(10, 4));
        System.out.println(sAuDbDsItTrIaOcNt(60, 20));
        System.out.println(sAuDbDsItTrIaOcNt(60, 60));
        System.out.println(sAuDbDsItTrIaOcNt(15565, 117805));
        System.out.println(sAuDbDsItTrIaOcNt(40, 60));
        System.out.println(sAuDbDsItTrIaOcNt(400, 60));
        System.out.println(sAuDbDsItTrIaOcNt(400, 600));
        System.out.println(sAuDbDsItTrIaOcNt(453, 629));
        System.out.println(sAuDbDsItTrIaOcNt(600, 400));
        System.out.println(sAuDbDsItTrIaOcNt(65, 17805));
        System.out.println(sAuDbDsItTrIaOcNt(115565, 117805));
        System.out.println(sAuDbDsItTrIaOcNt(56868764, 997805));
        System.out.println(sAuDbDsItTrIaOcNt(897893155, 233564866));
        System.out.println(sAuDbDsItTrIaOcNt(233564866, 897893155));
        System.out.println(sAuDbDsItTrIaOcNt(58897865, 4454));
        System.out.println(sAuDbDsItTrIaOcNt(0, 999999999));
        System.out.println(sAuDbDsItTrIaOcNt(999999999, 0));
        System.out.println(sAuDbDsItTrIaOcNt(1000000, 999999));
    }

    static int sAuDbDsItTrIaOcNt(int a, int b) {

        // Delete
        int x = a, y = b;

        boolean sub = true;
        List<String> resDigits = new ArrayList<>();

        int rest = 0;

        while (a > 0 || b > 0) {
            int ad = a % 10;
            int bd = b % 10;

            int r;

            if (sub) {

                boolean borrow = ad < bd;

                if (ad < bd) {
                    int t = ad;
                    ad = bd;
                    bd = t;
                }

                r = ad - bd + rest;

                if (borrow) {
                    rest = -1;
                } else {
                    rest = 0;
                }

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

        if (rest < 0) {
            result *= -1;
        }

        // Delete
        printTest(x, y, result);

        return result;
    }

    static int t;

    private static void printTest(int a, int b, int result) {

        ++t;

        FileWriter writer;
        try {
            writer = new FileWriter(new File("MATCodeNewbies2020/SubstrAdd/tests/test_" + t + ".txt"));
            writer.append("case_" + t + ": a = " + a + ", b = " + b + ", EO = " + result);
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
