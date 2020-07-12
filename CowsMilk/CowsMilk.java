package MATCodeNewbies2020.CowsMilk;

public class CowsMilk {

    public static void main(String[] args) {
        print("" + cowsMilk(3, new int[] { 2, 3, 1 }, 5));
    }

    static void print(String text) {
        System.out.println(text);
    }

    static long cowsMilk(int n, int[] cow, int d) {
        long sumForADay = 0;

        for (int c : cow) {
            sumForADay += c;
        }

        return sumForADay * d;
    }
}
