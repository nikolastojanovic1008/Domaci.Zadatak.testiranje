package JavaTest1;

public class Zadatak1 {
    public static void main(String[] args) {
/*
Zadatak 1:
Napraviti metodu koja prihvata niz brojeva i vraca broj parnih brojeva u nizu.

 */
        int[] niz1 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Broj parnih u nizu je: " + brojParnih(niz1));
    }

    public static int brojParnih(int[] niz) {
        int brojac = 0;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] % 2 == 0) {
                brojac++;
            }
        }
        return brojac;
    }
}
