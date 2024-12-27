package JavaTest1;

public class Zadatak3 {
    public static void main(String[] args) {
        /*
        Zadatak 3:
Napraviti metodu koja prihvata niz brojeva i vraca najveci broj iz niza.
         */
        int[] niz = {1, 2, 5, 6, 7, 10, 11, 15, 23};
        System.out.println("Maksimum iz niza je: " + maks(niz));
    }

    public static int maks(int[] niz) {
        int maksimum = niz[0];
        for (int i = 1; i < niz.length; i++) {
            if (maksimum < niz[i]) {
                maksimum = niz[i];
            }
        }
        return maksimum;
    }
}
