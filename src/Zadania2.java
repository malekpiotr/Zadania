

public class Zadania2 {
//    6. Metoda która przyjmie zakres od - do i zwróci wszystkie liczby nieparzyste.
//      7. Metoda która przyjmie zakres od - do i zwróci listę liczb pierwszych z tego przedziału.

    public static void main(String[] args) {
        nieparzyste(3,55);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        liczbyPierwszeZZakresu(-50,120);

    }


    public static void nieparzyste(int start, int stop){
        for (int i = start; i <= stop ; i++) {
            if(i % 2 != 0){
                System.out.println(i + " ");
            }

        }
    }
    public static void liczbyPierwszeZZakresu(int start, int stop){
        if (start <=0){
            start = 1;
        }
        for (int i = start; i < stop; i++) {

            int podzielnik = 2;

            boolean liczbaPierwsza = true;

            if (i > 3) {

                while (podzielnik < i) {
                    if (i % podzielnik == 0) {

                        liczbaPierwsza = false;break;

                    }
                    podzielnik++;}

            }
            if (liczbaPierwsza) {

                System.out.print( i + " ");

            }

        }
    }

}
