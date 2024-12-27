package ProbniTest;

public class zadatak3 {
    public static void main(String[] args) {
        /*
        Zadatak 3:
Napraviti metodu koja prihvata niz brojeva i vraca proizvod svih parnih brojeva.
         */
        int[] niz = {1, 1, 3, 4, 5, 6, 7, 8};
        //System.out.println("Proizvod svih parnih brojeva je: " + proizvodParnih(niz));
        stampanje(proizvodParnih(niz));
    }

    public static int proizvodParnih(int[] niz) {
        int proizvod = 1;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] % 2 == 0) {
                proizvod *= niz[i];
            }
        }
        return proizvod;
    }

    public static void stampanje(int a) {

        System.out.println(a);
    }
}

