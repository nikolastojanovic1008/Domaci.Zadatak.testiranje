package petak3008;

public class kopiranjenizova {
    public static void main(String[] args) {
        int[] niz1 = {1, 2, 3, 4};
        int[] niz2 = niz1; // plitko kopiranje

        int[] niz3 = new int[niz1.length]; //duboko kopiranje
        for (int i = 0; i < niz1.length; i++) {
            niz3[i] = niz1[i];
        }

    }
}
