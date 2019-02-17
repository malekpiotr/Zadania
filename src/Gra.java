import java.util.Random;
import java.util.Scanner;

public class Gra {
    public static void main(String[] args) {
//        Gra w ”Za dużo, za mało”. Komputer losuje liczbę z
//        zakresu 1...100, a gracz (użytkownik) ma za zadanie odgadnąć, co to
//        za liczba poprzez podawanie kolej- nych wartości. Jeżeli podana
//        wartość jest:
//          • większa – wyświetlany jest komunikat „Podałeś za dużą wartość”,
//          • mniejsza – wyświetlany jest komunikat „Podałeś za małą wartość”,
//             • identyczna z wylosowaną – wyświetlany jest komunikat
//          „Gratulacje” i gra się kończy.

        System.out.println("Podaj liczbe z zakresu 1 - 100");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int szukana = random.nextInt(100) + 1;
        int podana = 0;

        while (podana != szukana) {
            podana = scanner.nextInt();
            if (podana < szukana) {
                System.out.println("za mala");
            } else if (podana > szukana) {
                System.out.println("za duza");
            } else {
                System.out.println("Gratulacje! Trafiłeś!");
            }
        }
    }
}