package MATCodeNewbies2020.AFAIK;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class AFAIK {
    public static void main(String[] args) {
        generateTest(arr("LMAO", "AFAIK", "LOL", "TLDR"), arr("As Far As I Know", "Rolling Laughing Out Loud",
                "Laughing Out Loud", "Be Right Back", "Before Anything Else"));

        generateTest(arr("BRB", "WTF", "NVM", "MOM"), arr("Minute Of Meeting", "Rolling Laughing Out Loud",
                "Be Right Back", "In My Humble Opinion", "Before Anything Else"));

        generateTest(arr("PM", "AMA", "BTAIM", "IDK", "DYK"), arr("Military Police", "Private Message",
                "Ask Me Anything", "Nevermind", "Be That As It May", "I Dont Know"));

        generateTest(arr("DEAK", "ELIF", "FTFY", "GG", "IDC", "LOL", "TLDR"), arr("As Far As I Know", "Good Game",
                "Does Anyone Else Know", "Explain Like Im Five", "Fixed That For You"));

        generateTest(arr("ILY", "IDC", "IRL", "JK", "LMS", "ROFLMAO"),
                arr("Like My Status", "In Real Life", "Just Kidding", "Be Right Back", "I Love You", "I Dont Care"));

        generateTest(arr("SMH", "TBH", "TGIF", "ICYMI"),
                arr("To Be Brutally Honest", "Shaking My Head", "Just Kidding", "I Love You", "In Case You Missed It"));

        generateTest(arr("YOLO"), arr());
        
        generateTest(arr(), arr("You Only Live Once"));
    }

    private static void generateTest(String[] abr, String[] exp) {
        printTest(abr, exp, afaik(abr, exp));
    }

    static int t;

    static void printTest(String[] abr, String[] exp, int[] ans) {
        ++t;

        FileWriter writer;
        try {
            writer = new FileWriter(new File("MATCodeNewbies2020/AFAIK/tests/test_" + t + ".txt"));
            writer.append("case_" + t + ":\n");
            writer.append("abbrList : " + format(abr) + "\n\n");
            writer.append("expressions : " + format(exp) + "\n\n");
            writer.append("EO : " + Arrays.toString(ans));
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static String format(String[] abr) {
        String res = "[";

        for (int i = 0; i < abr.length; i++) {

            res += "\"" + abr[i] + "\"";

            if (i < abr.length - 1) {
                res += ", ";
            }
        }

        res += "]";

        return res;
    }

    static String[] arr(String... varArgString) {
        return varArgString;
    }

    static int[] afaik(String[] abbrList, String[] expressions) {

        int len = abbrList.length;
        int[] result = new int[len];

        for (int i = 0; i < len; i++) {

            int matchIndex = -1;

            for (int j = 0; j < expressions.length; j++) {

                if (matched(abbrList[i], expressions[j])) {
                    matchIndex = j;
                    break;
                }
            }

            result[i] = matchIndex;
        }

        return result;
    }

    private static boolean matched(String abbr, String expr) {

        String[] abbrLetters = abbr.split("|");
        String[] exprTokens = expr.split(" ");

        if (abbrLetters.length != exprTokens.length) {
            return false;
        }

        for (int i = 0; i < abbrLetters.length; i++) {
            if (!exprTokens[i].startsWith(abbrLetters[i])) {
                return false;
            }
        }

        return true;
    }
}
