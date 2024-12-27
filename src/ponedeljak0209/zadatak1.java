package ponedeljak0209;

public class zadatak1 {
    public static void main(String[] args) {
        /*
        Zadatak 1:
Napraviti metodu koja prima niz brojeva i kao rezultat vraca najveci broj iz tog niza.
         */
        int[] niz = {1, 2, 3, 4, 11};
        int maksimum = pronadjimaks(niz);
        System.out.println(maksimum);

    }

    public static int pronadjimaks(int[] niz) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] > max) {
                max = niz[i];
            }
        }
        return max;
    }
}
