import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Zadania9 {
    public static void main(String[] args) {
//        Napisać program, który pobiera od użytkownika ciąg
//        liczb całkowitych. Pobieranie danych kończone jest podaniem
//        wartości 0 (nie wliczana do danych). W następ- nej kolejności
//        program powinien wyświetlić sumę największej oraz najmniejszej z
//        podanych liczb oraz ich średnią arytmetyczną.
//        Przykład:
//        Użytkownik podał ciąg: 1, -4, 2, 17, 0. Wynik programu:
//        13 // suma min. i maks.
//        6.5 // średnia
        Scanner scanner = new Scanner(System.in);

        List<Integer> lista = new ArrayList<Integer>();
        int liczba;

        System.out.println("podaj liczby: , (liczba 0 konczy zadanie!!)");

        do {
            liczba = scanner.nextInt();
            lista.add(liczba);

        }while (liczba != 0);
        System.out.println("stara dlugosc listy: " + lista.size());
        lista.remove(lista.size()-1); // usuwanie zera <- ostatniej wartosci dodanej
        System.out.println("dlugosc listy: " + lista.size()); // nowa lista po usunieciu zera

        Collections.sort(lista); // sortowanie listy od najmniejszej do najwiekszej

        System.out.println("zawartosc listy: ");
        for(int i=0; i<lista.size();i++ )
        {
            System.out.println(lista.get(i));
        }
        int max = lista.get(lista.size()-1);
        System.out.println("liczba max to: " + max);
        int min = lista.get(0);
        System.out.println("liczba min to: " + min);
        int suma = max + min;
        System.out.println("suma najmniejszej i najwiekszej liczby " + (double)suma);
        System.out.println("srednia najwiekszej i najmniejszej to: " + (double)suma / 2);

    }
}
