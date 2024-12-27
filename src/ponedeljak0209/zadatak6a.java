package ponedeljak0209;

public class zadatak6a {
    public static void main(String[] args) {

        int[] niz1 = {0, 3, 5, 7, 5, 7};
        int[] niz2 = {-1, -2, -3, 0};
        stampanje(sabiranjeNizova(niz1,niz2));
    }

    public static int[] sabiranjeNizova(int[] niz1, int[] niz2) {
        int[] duziNiz;
        int[] manjiNiz;

        if (niz1.length > niz2.length) {
            duziNiz = niz1;
            manjiNiz = niz2;
        } else {
            duziNiz = niz2;
            manjiNiz = niz1;
        }
        int[] rezultat = new int[duziNiz.length];
        for (int i = 0; i < duziNiz.length; i++) {
            if (i < manjiNiz.length) {
                rezultat[i] = manjiNiz[i] + duziNiz[i];
            } else {
                rezultat[i] = duziNiz[i];
            }
        }
        return rezultat;
    }

    public static void stampanje(int[] niz1) {
        for (int i = 0; i < niz1.length; i++) {
            System.out.println(niz1[i]);
        }
    }
}

