import java.util.Scanner;

public class Zadania8 {


//        Napisać program, który wczytuje liczby podawane przez
//        użytkownika dotąd, do- póki nie podana zostanie liczba 0. Następnie
//        wyświetlić sumę wszystkich poda- nych liczb.


    public static void main(String[] args) {

        zad8();

    }

    public static void zad8() {
        Scanner wejscie = new Scanner(System.in);
        int a = 0;
        int suma = 0;

        do {
            System.out.println("Podaj liczbę całkowitą");
            a = wejscie.nextInt();
            suma += a;
        } while (a != 0);
        System.out.println("Suma liczb wynosi: " + suma);
    }
}