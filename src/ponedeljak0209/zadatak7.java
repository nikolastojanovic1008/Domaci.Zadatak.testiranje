package ponedeljak0209;

public class zadatak7 {
    public static void main(String[] args) {
        /*
        Zadatak 7:
Napraviti metodu koja prima niz celih brojeva i vraca true ukoliko je niz rastuci.
         */
        int[] niz1 = {2, 3, 6, 8, 10};

        if (proveraNiza(niz1)) {
            System.out.println("Uneti niz je rastuci!");
        } else {
            System.out.println("Uneti niz NIJE rastuci");
        }
    }

    public static boolean proveraNiza(int[] niz) {

        for (int i = 0; i < niz.length - 1; i++) {
            if (niz[i] >= niz[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
