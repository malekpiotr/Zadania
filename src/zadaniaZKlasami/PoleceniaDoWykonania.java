package zadaniaZKlasami;

public class PoleceniaDoWykonania {
//
//       Utwórz klasę User która ma pola takie jak imię, nazwisko, login, hasło oraz data urodzenia a
//      potem wykonaj poniższe zadania dodając metody:
//      1. Metoda przyjmująca obiekt klasy User i sprawdzi czy wszystkie pola zostały wypełnione -
//    zwróć true lub false.
//      2. Metoda która przyjmie obiekt klasy User i sprawdzi czy hasło posiada przynajmniej 8 znaków.
//      3. Utwórz nową klasę UserParamsGenerator i dodaj w niej metody:
//       1. generateLogin która przyjmie imię i nazwisko oraz zwraca nowy login - 1 litera imienia +
//    całe nazwisko, np. generateLogin(„Jan”, „Nowak”) zwróci „jnowak”
//      2. generatePassword która zwraca 8 cyfrowe losowe hasło.
//      4. W klasie User dodaj metodą która zwróci czy użytkownik jest pełnoletni (true / false) na
//    podstawie zapisanej daty urodzenia.
//       5. Dodaj klasę UserService która będzie przechowywała HashMapę a w niej kluczem będzie
//    integer a wartością obiekt klasy User.
//       6. Dodaj metodę add(user). Jej wywołanie powinno zapisać użytkownika w kolekcji natomiast
//    klucz powinien być automatycznie generowany.
//      7. Zmodyfikuj metodę dodającą tak aby przed dodaniem sprawdzić czy użytkownik o takim
//    loginie już nieistnieje. Jeśli tak to nie dodawaj następnego.
//      8. Ponownie zmodyfikuj poprzednią metodę tak aby zapisywać tylko użytkowników pełnoletnich.
//      9. Ulepsz poprzednią metodę tak aby nie zapisywać użytkowników którzy nie mają wypełnionych
//    wszystkich pól.
//     10. Dodaj metodę update w której przekażesz login użytkownika oraz nowy obiekt klasy User.
//    Zmodyfikuj istniejący obiekt znajdując go po przekazanym loginie.
//      11. Dodaj metodę usuwania użytkownika po przekazanym loginie.
//      12. Dodaj metodę login(login, password) która zwróci true/false jeśli dane do logowania pasują do
//    któregoś z użytkowników, np. userService.login(„jkowalski”, „haslo”); zwróci usera o loginie
//    jkowalski jeśli hasło również do niego pasuje.
//       13. Dodaj metodę getAll która zwróci listę wszystkich użytkowników.
//       14. Dodaj metodę search która przyjmie ciąg znaków i zwróci listę użytkowników których imię lub
//    nazwisko pasuje do przekazanego.
//      15. Zmodyfikuj metodę getAll oraz serach tak aby zwracać listę użytkowników ale ich hasła
//    powinny zostać ukryte więc zamień je na napis „*******”.
//
}
