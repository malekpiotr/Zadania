public class Zadania4 {
    //    1. Napisać program służący do konwersji wartości
//    temperatury podanej w stopniach Celsjusza na stopnie w skali
//    Fahrenheita (stopnie Fahrenheita = 1.8 * stopnie Celsjusza + 32.0)
//    2. Wczytać od użytkownika 3 liczby całkowite i wypisać na
//    ekran największą oraz najmniejszą z nich.
//      3. Napisać program, który oblicza wartość współczynnika
//    BMI (ang. body mass index) wg. wzoru: waga/wzrost^2 . Jeżeli wynik
//    jest w przedziale (18,5 - 24,9) to wypisuje
//      ”waga prawidłowa”, jeżeli poniżej to ”niedowaga”, jeżeli powyżej
//      ”nadwaga”.
//    4. Napisać program obliczający należny podatek
//    dochodowy od osób fizycznych. Program ma pobierać od
//    użytkownika dochód i po obliczeniu wypisywać na ekranie należny
//    podatek. Podatek obliczany jest wg. następujących reguł:
//            • do 85.528 podatek wynosi 18% podstawy minus 556,02 PLN,
//            • od 85.528 podatek wynosi 14.839,02 zł + 32% nadwyżki ponad
//              85.528,00
    public static void main(String[] args) {
        System.out.println(" zadanie 1.");
        met(60);
        System.out.println("zadanie 2.");
        max(10, 25, 2);
        min(-22, 55, -22);
        System.out.println("zadanie 3");
        bmi(65.5, 1.75);
        System.out.println("zadanie 4");
        dochod(515321);
    }

    public static void met(double celcjusze) {

        double farenheit = (1.8 * celcjusze) + 32;

        System.out.println(celcjusze + " stopni celcjusza to " + farenheit + " stopni farengheita");
    }

    public static void max(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("najwieksza liczba to: " + a);
        } else if (b > a && b > c) {
            System.out.println("najwieksza liczba to: " + b);
        } else {
            System.out.println("najwieksza liczba to: " + c);
        }
    }

    public static void min(int a, int b, int c) {
        if (a < b && a < c) {
            System.out.println("najmniejszasza liczba to: " + a);
        } else if (b < a && b < c) {
            System.out.println("najmniejszasza liczba to: " + b);
        } else {
            System.out.println("najmniejszasza liczba to: " + c);
        }

    }

    public static void bmi(double waga, double wzrost) {
        double bmi = waga / (wzrost * wzrost);

        if (bmi < 18.5) {
            System.out.println("niedowaga");
        } else if (bmi > 24.9) {
            System.out.println("nadwaga");
        } else {
            System.out.println("waga prawidlowa!");
        }
    }

    public static void dochod(double dochod) {
        if (dochod < 85528) {
            double wynikMaly = (0.18 * dochod) - 556.02;
            System.out.println(("podatek dochodowy to " + (int)wynikMaly));
        } else if (dochod > 85528) {
            double wynikDuzy = 14839.02 + (0.32 * (dochod - 85528));
            System.out.println("podatek dochodowy to " + (int)wynikDuzy);
        }
    }
}