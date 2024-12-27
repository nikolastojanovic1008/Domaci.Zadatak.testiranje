package Dopunskicas;

public class zadatak2 {
    public static void main(String[] args) {
        /*
        Zadatak 2:
Sabrati dva niza String-ova.
         */
        String[] niz1 = {"Marko", "Milica", "Jovana", "Jelena"};
        String[] niz2 = {"Nikola"};
        stampaj(sabiranjeStringova(niz1, niz2));
    }

    public static void stampaj(String[] niz) {
        for (int i = 0; i < niz.length; i++) {
            System.out.println(niz[i]);
        }
    }

    public static String[] sabiranjeStringova(String[] niz1, String[] niz2) {
        String[] niz3 = new String[niz1.length + niz2.length];
        for (int i = 0; i < niz1.length; i++) {
            niz3[i] = niz1[i];
        }
        int j = 0;
        for (int i = niz1.length; i < niz3.length; i++) {
            niz3[i] = niz2[j];
            j++;

        }
        return niz3;
    }
}
