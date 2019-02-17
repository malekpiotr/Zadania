import java.util.ArrayList;
import java.util.List;

public class Zadania {
    public static void main(String[] args) {
//        1. Metoda która przyjmuje ciąg znaków i zwraca ten sam ciąg znaków napisany samymi dużymi
//        literami (patrz: metoda obiektu String - toUpperCase()), np. „Ala” zwróci: „ALA”.
//        2. Metoda która przyjmuje listę liczb i zwraca największą z nich.
//        3. Metodę która przyjmuje listę liczb i zwraca najmniejszą z nich.
//        4. Metodę która przyjmie listę liczb i zwróci listę tych które są podzielne przez 3 bez reszty.
//        5. Zmodyfikuj poprzednią metodę tak aby przyjmowała listę liczb oraz cyfrę przez którą będziesz
//        dzielił liczby z listy i zwrócisz te które są przez nie podzielne bez reszty. Np. getDivisible(lista,
//                - zwróci nową listę tych które były podzielne przez 4.


        String str = "Ala";
        System.out.println(str.toUpperCase());

        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(-20);
        list.add(22);
        list.add(66);
        list.add(6);


        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.println("max z listy to: " + max);

        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (min > list.get(i)) {
                min = list.get(i);
            }
        }
        System.out.println("min z listy to: " + min);

        getDivisible(list, 2);

    }
    public static void getDivisible(List<Integer> lista, int dzielnik) {
        List<Integer> listaPodzielnePrzezDzielnik = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % dzielnik == 0) {
                listaPodzielnePrzezDzielnik.add(lista.get(i));
            }
        }
        System.out.println("liczby z listy podzielne przez " + dzielnik + " to: " + listaPodzielnePrzezDzielnik);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}

