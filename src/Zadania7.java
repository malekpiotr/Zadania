public class Zadania7 {

//        Napisać program, który wczytuje od użytkownika liczbę
//        całkowitą dodatnią n, a następnie wyświetla na ekranie wszystkie
//        potęgi liczby 2 nie większe, niż podana liczba. Przykładowo, dla
//        liczby 71 program powinien wyświetlić:
//        1 2 4 8 16 32 64

    public static void main(String[] args) {

        zad7(71);

    }

    public static void zad7(double liczba){
        double n = 0;
        for (double i = 0; i < liczba; i++) {

            while (Math.pow(2, n) < liczba) {
                System.out.print((int)Math.pow(2, n) + " ");
                n++;
            }
        }

    }

}
