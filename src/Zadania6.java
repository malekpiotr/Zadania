public class Zadania6 {
//    Napisać program, który pobiera od użytkownika liczbę
//    całkowitą dodatnią, a na- stępnie wyświetla na ekranie kolejno
//    wszystkie liczby niepatrzyste nie większe od podanej liczby.
//    Przykład, dla 15 program powinien wyświetlić 1, 3, 5, 7, 9, 11, 13, 15,

    public static void main(String[] args) {
        nieparzyste(15);
    }

    public static void nieparzyste(long number) {
        for (int i = 0; i <= number; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
