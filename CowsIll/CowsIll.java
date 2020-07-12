package MATCodeNewbies2020.CowsIll;

import java.util.ArrayList;
import java.util.List;

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

        print("" + cowsIll(cow, sickDay));
    }

    static void print(String text) {
        System.out.println(text);
    }

    static long cowsIll(int[] cow, int[][] sickDay) {
        List<Cow> allCows = buildCows(cow);

        long totalMilk = 0;

        for(int[] sick : sickDay) {
            for(int index : sick) {
                Cow sickCow = allCows.get(index);
                sickCow.sickRecov = 3;
            }

            for(Cow co : allCows) {
                if(co.sickRecov > 0) {
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

        for(int m : cow) {
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
