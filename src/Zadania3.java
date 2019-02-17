public class Zadania3 {
//      8.  Metodę która po wprowadzeniu ciągu znaków zwróci ile było słów.
//       9. Metoda która po wprowadzeniu ciągu znaków zwróci ile było liter.
//     10. Metoda która po wprowadzeniu ciągu znaków zwróci ile było samogłosek a ile spółgłosek
//       (Rozwiązaniem może być np. utworzenie 2 setów, w których trzymaj samogłoski a w drugim
//        spółgłoski i iterując się przez wszystkie litery przekazanego ciągu znaków sprawdzaj w którym
//         secie znajduje się taka sama literka)
//       11. Metoda która przyjmie ciąg znaków i usunie z niego wszystkie spacje.
//      12. Metoda która przyjmie ciąg znaków i usunie spacje a pierwsze litery słów zamieni na duże, np.
//            Wejście: Ala ma kota. Wyjście: „AlaMaKota”.
//            13. Metoda która przyjmuje ciąg znaków i usunie z niego wszystkie znaki interpunkcyjne (np.
//              przecinki, kropki, znaki zapytania i wykrzykniki).


    public static void main(String[] args) {


        ileSlow("Ala ma kota a kot ale");

    }


    public static void ileSlow(String tekst) {

        String wynik1[] = null;
        String wynik2[] = null;
// Do tablicy wynik1 trafi zawartość zmiennej tekst
// podzielona na elementy: Ala, ma, kota itd.
        wynik1 = tekst.split(" ");
// Do tablicy wynik2 trafi zawartość zmiennej tekst
// podzielona na 2 elementy: Ala, ma:kota:a:kot:ma:Ale itd.
        wynik2 = tekst.split(" ", 2);
        System.out.println("ilosc slow w tekscie: " + wynik1.length);
        System.out.println(wynik2);


    }


}