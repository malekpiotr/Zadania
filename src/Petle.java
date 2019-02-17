public class Petle {
    //    Napisać program pobierający od użytkownika dwie liczby
//    całkowite A oraz B, A < B, a następnie wyznaczający sumę ciągu
//    liczb od A do B, czyli sumę ciągu (A, A + 1, . . . , B). Obliczenia
//    należy wykonać trzykrotnie stosując kolejno pętle: while, do-while, for.
//    Przykład:
//    Dla A = 4 i B = 11 program powinien wyświetlić:
//            60 60 60
//
    public static void main(String[] args) {

        petlafor(4, 11);
        petlawhile(4, 11);
        petlaDoWhile(4, 11);
    }

    public static void petlafor(long number1, long number2) {
        long suma = 0;
        if (number1 > number2) {
            System.out.println("wartosc number1 musi byc mniejsza od wartosc2");
        } else {
            for (long i = number1; i <= number2; i++) {
                suma += number1;
                number1++;
            }
            System.out.println(suma);
        }
    }

    public static void petlawhile(long number1, long number2) {
        long suma = 0;
        if (number1 > number2) {
            System.out.println("wartosc number1 musi byc mniejsza od wartosc2");
        }
        while (number1 <= number2) {
            suma += number1;
            number1++;
        }
        System.out.println(suma);


    }

    public static void petlaDoWhile(long number1, long number2) {
        long suma = 0;
        if (number1 > number2) {
            System.out.println("wartosc number1 musi byc mniejsza od wartosc2");
        }
        do {
            suma += number1;
            number1++;

        }while(number1<=number2);
        System.out.println(suma);
    }
}
