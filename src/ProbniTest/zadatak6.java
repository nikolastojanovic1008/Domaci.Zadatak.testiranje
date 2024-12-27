package ProbniTest;

public class zadatak6 {
    public static void main(String[] args) {
        /*
        Zadatak 6:
Napraviti metodu koja prihvata dva niza String-ova i konkatenira sve String-ove na istim pozicijama.
         */
        String[] niz1 = {"avion", "Bus", "Auto"};
        String[] niz2 = {" jedan", " dva", " tri"};
        stampanje(sabiranjeStringova(niz1, niz2));
    }

    public static String[] sabiranjeStringova(String[] niz1, String[] niz2) {
        String[] niz3 = new String[niz1.length];
        for (int i = 0; i < niz1.length; i++) {
            niz3[i] = niz1[i] + niz2[i];
        }
        return niz3;
    }

    public static void stampanje(String[] niz) {
        for (int i = 0; i < niz.length; i++) {
            System.out.println(niz[i]);
        }
    }
}
