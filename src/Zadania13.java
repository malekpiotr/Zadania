import java.util.Arrays;
import java.util.Random;

public class Zadania13 {
//    Napisać program, który utworzy tablicę 20 liczb
//    całkowitych z przedziału 1 . . . 10, a następnie wypisze na ekranie ile
//    razy każda z liczb z tego przedziału powtarza się w tablicy.
//            Przykład:
//    Wylosowane liczby: 6 5 4 5 10 5 8 3 10 6 6 6 4 3 2 8 1 3 4 7
//    Wystąpienia:
//            1-1 2-1 3-3 4-3 5-3 6-4 7-1 8-2 9-0
//            10 - 2

    public static void main(String[] args) {

        rozw1();
        System.out.println("=============================================");
        rozw2();
    }

    public static void rozw1() {
        Random ran = new Random();
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;
        int count9 = 0;
        int count10 = 0;

        int[] tab = new int[20];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = ran.nextInt(9) + 1;
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        for (int i = 0; i < tab.length; i++) {

            if (tab[i] == 1) {
                count1++;
            } else if (tab[i] == 2) {
                count2++;
            } else if (tab[i] == 3) {
                count3++;
            } else if (tab[i] == 4) {
                count4++;
            } else if (tab[i] == 5) {
                count5++;
            } else if (tab[i] == 6) {
                count6++;
            } else if (tab[i] == 7) {
                count7++;
            } else if (tab[i] == 8) {
                count8++;
            } else if (tab[i] == 9) {
                count9++;
            } else if (tab[i] == 10) {
                count10++;
            }
        }
        System.out.println();
        System.out.println("1-" + count1 + " " + "2-" + count2 + " "
                + "3-" + count3 + " " + "4-" + count4 + " "
                + "5-" + count5 + " " + "6-" + count6 + " "
                + "7-" + count7 + " " + "8-" + count8 + " "
                + "9-" + count9 + " " + "10-" + count10);
    }

    public static void rozw2() {
        int[] randomArray = new int[20];
        Random rn = new Random();
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = rn.nextInt(9) + 1;
        }
        System.out.println(Arrays.toString(randomArray));

        for (int i = 1; i <= 10; i++) {
            int counter = 0;
            for (int j = 0; j < 20; j++) {
                if (i == randomArray[j]) {
                    counter++;
                }
            }
            System.out.println(i + " - " + counter);
        }
        System.out.println();
        System.out.println("Sposób z tablicą kubełkową");
        System.out.println();
        //sposób z tablicą kubełkową
        int[] counters = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < 20; i++) {
            counters[randomArray[i] - 1]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1 + " - " + counters[i]);
        }
    }
}
