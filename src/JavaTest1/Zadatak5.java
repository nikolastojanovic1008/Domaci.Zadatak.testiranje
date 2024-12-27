package JavaTest1;

public class Zadatak5 {
    public static void main(String[] args) {
        /*
        Zadatak 5:
Napraviti metodu koja prima niz brojeva i proverava da li je niz monoton.
Niz je monoton ukoliko mu je vrednost ili rastuca ili opadajuca.
Primer:
Niz je monoton -> {1, 11, 21, 35}, {1, 0, -5, -10}
Niz NIJE monoton -> {1, 3, 6, 2, 11}, {5, 3, 4, 0, -2}
         */
        int[] nekiNiz = {1, 2, 3, 4, 6};
        int[] rastuciNiz = {1, 3, 5, 7, 9};
        int[] opadajuciNiz = {9, 7, 5, 3, 1};
        int[] neMonotoniNiz = {1, 3, 2, 6, 3};
        if (monotonJe(nekiNiz)) {
            System.out.println("Monoton je!");
        } else {
            System.out.println("Nije Monoton");
        }
        // System.out.println("Rastuci niz je monoton: " + monotonJe(rastuciNiz));
        // System.out.println("Opadajuci niz je monoton: " + monotonJe(opadajuciNiz));
        // System.out.println("Nemonotoni niz je monoton: " + monotonJe(neMonotoniNiz));
        /*if (monotonJe(rastuciNiz)) {
            System.out.println("Monoton je!");
        }
        if (monotonJe(opadajuciNiz)) {
            System.out.println("monoton je!");
        }
        if (!monotonJe(neMonotoniNiz)) {
            System.out.println("NIJE Monoton");
        }
*/
        //System.out.println(monotonJe(opadajuciNiz));
    }

    public static boolean monotonJe(int[] niz) {
        if (niz == null || niz.length < 2) {
            return true;
        }
        boolean rastuci = true;
        boolean opadajuci = true;
        for (int i = 1; i < niz.length; i++) {
            if (niz[i] > niz[i - 1]) {
                opadajuci = false;
            }
            if (niz[i] < niz[i - 1]) {
                rastuci = false;
            }

        }
        if (rastuci || opadajuci) {
            return true;
        } else {
            return false;
        }
        // return rastuci || opadajuci;
    }
}
