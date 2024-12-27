package ProbniTest;

public class zadatak4 {
    public static void main(String[] args) {
        /*
        Zadatak 4(Ogledalo):
Napraviti metodu koja prihvata niz brojeva i kao rezultat vraca taj niz samo u obrnutom redosledu.
         */
        int[] niz = {2, 2, 3, 5, 7, 9};
        stampanje(ogledalo(niz));
    }

    public static int[] ogledalo(int[] niz) {

        int[] obrnutiNiz = new int[niz.length];
        for (int i = 0; i < niz.length; i++) {
            obrnutiNiz[i] = niz[niz.length - 1 - i];
        }
        return obrnutiNiz;
    }

    public static void stampanje(int[] niz) {
        for (int i = 0; i < niz.length; i++) {
            System.out.println(niz[i]);
        }
    }
}
