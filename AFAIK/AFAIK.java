package MATCodeNewbies2020.AFAIK;

import java.util.Arrays;

public class AFAIK {
    public static void main(String[] args) {
        System.out.println(Arrays
                .toString(afaik(new String[] { "LMAO", "AFAIK", "LOL", "TLDR" }, new String[] { "As Far As I Know",
                        "Rolling Laughing Out Loud", "Laughing Out Loud", "Be Right Back", "Before Anything Else" })));
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
