import java.util.ArrayList;
import java.util.List;

public class SumaLiczbCyfry {
    //    Napisać program, który pobiera od użytkownika liczbę
//    całkowitą, a następnie:
//    • oblicza sumę cyfr tej liczby,
//    • stosunek średniej arytmetycznej cyfr parzystych do średniej
//    arytmetycznej cyfr nieparzystych.
//    
    public static void main(String[] args) {
        sumaLiczbCyfry(1345);
        System.out.println("+++++++++++");
        sredniaLiczbCyfry(12);
        System.out.println("---------------");
        parzdonieparz(23456);
    }

    public static void sumaLiczbCyfry(int number) {
        int suma = 0;
        do {
            int cyfra = number % 10;
            suma += cyfra;
            number = (number - cyfra) / 10;
        } while (number != 0);
        System.out.println(suma);
    }


    public static void sredniaLiczbCyfry(double number) {
        int suma = 0;
        int count = 0;
        do {
            double cyfra = number % 10;
            suma += cyfra;
            number = (number - cyfra) / 10;
            count++;
        } while (number != 0);
        System.out.println("Srednia sumy liczb cyfry <=== ;) " + (double) suma / (double) count);
        System.out.println("ilosc cyfr w liczbie " + count);
        System.out.println("suma liczb cyfry: " + suma);

    }

    public static void parzdonieparz(double number) {
        double sumaparz = 0;
        double sumanieparz = 0;
        int countParz = 0;
        int countNParz = 0;

        do {
            double cyfra = number % 10;
            if ((cyfra % 2) == 0) {
                sumaparz += cyfra;
                number = (number - cyfra) / 10;
                countParz++;
            } else if ((cyfra % 2) != 0) {
                sumanieparz += cyfra;
                number = (number - cyfra) / 10;
                countNParz++;
            }
        } while (number != 0);
        System.out.println((sumaparz / countParz) / (sumanieparz / countNParz));


    }
}

