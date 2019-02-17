public class Zadania11 {
    //    Napisać program, dla podanej liczby całkowitej
//    wyświetla jej dzielniki. Przykła- dowo, dla liczby 21 dzielniki to: 1, 3,
//            7, 21.
//
    public static void main(String[] args) {
        dzielniki(21);

    }

    public static void dzielniki(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }

        }
    }
}
