package petak3008.Domaci;

public class Zadatak3 {
    public static void main(String[] args) {
        /*
        Napisati program koji koristi metodu da proveri da li su dva uneta niza jednaka.
         */
        int[] niz1 = {1, 2, 3, 4};
        int[] niz2 = {1, 2, 3, 4};
        isti(niz1, niz2);
    }

    public static boolean isti(int[] niz1, int[] niz2) {
        boolean b = true;
        if (niz1.length == niz2.length) {
            for (int i = 0; i < niz2.length; i++) {
                if (niz1[i] == niz2[i]) {
                    continue;
                } else {
                    b = false;
                    break;
                }
            }
        } else {
            b = false;
        }
        if (b) {
            System.out.println("Nizovi su jednaki!");
        } else {
            System.out.println("Nizovi NISU jednaki!");
        }
        return b;
    }
}
