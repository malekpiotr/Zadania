public class Zadania5 {
//    5. W sklepie ze sprzętem AGD oferowana jest sprzedaż
//    ratalna. Napisz program umożliwiający wyliczenie wysokości
//    miesięcznej raty za zakupiony sprzęt. Danymi wejściowymi dla
//    programu są:
//            • cena towaru (od 100 zł do 10 tyś. zł), • liczba rat (od 6 do 48).
//    Kredyt jest oprocentowany w zależności od liczby rat:
//            • od 6–12 wynosi 2.5% , • od 13–24 wynosi 5%, • od 25–48 wynosi 10%
//
//    Obliczona miesięczna rata powinna zawierać również odsetki.
//    Program powinien sprawdzać, czy podane dane mieszczą się w
//    określonych powyżej zakresach, a w przypadku błędu pytać prosić
//    użytkownika ponownie o podanie danych.
//    ========================================================================
//    Napisać program na podstawie programu do zadania 4,
//    który dodatkowo wyświetli liczbę w pozostałych kodach, a więc ZU1
//    oraz ZU2.
//    =======================================================================

    public static void main(String[] args) {

        rata(9000, 12);

    }

    public static void rata(double cena, double liczbaRat) {
        double oprocentowanie1 = 0.025;
        double oprocentowanie2 = 0.05;
        double oprocentowanie3 = 0.1;
        double odsetki1 = cena * oprocentowanie1;
        double odsetki2 = cena * oprocentowanie2;
        double odsetki3 = cena * oprocentowanie3;

        if (cena < 100 || cena > 10000 || liczbaRat < 6 || liczbaRat > 48) {
            System.out.println("Podaj cene z zakresu 100 - 10000 zł oraz liczbe rat z zakresu 6-48 ");
        } else if (liczbaRat > 6 || liczbaRat < 12) {
            double wynik1 = (cena / liczbaRat) + odsetki1;
            System.out.println("miesieczna rata ktedytu to: ");
            System.out.format("%.2f%n", wynik1);
        } else if (liczbaRat > 13 || liczbaRat < 24) {
            double wynik2 = (cena / liczbaRat) + odsetki2;
            System.out.println("miesieczna rata ktedytu to: ");
            System.out.format("%.2f%n", wynik2);
        } else if (liczbaRat > 25 || liczbaRat < 48) {
            double wynik3 = cena / liczbaRat + odsetki3;
            System.out.println("miesieczna rata ktedytu to: ");
            System.out.format("%.2f%n", wynik3);
        }else{
            System.out.println("podales bledne wartosci.");
        }
    }
}