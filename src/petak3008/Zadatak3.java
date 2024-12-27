package petak3008;

public class Zadatak3 {
    public static void main(String[] args) {
        /*
        Zadatak 3:
a)Napraviti metodu koja prima niz celih brojeva i povecava sve brojeve za 1.
b)Napraviti metodu koja je zaduzena za stampanje nizova
         */
        int[] testniz = {1, 2, 3, 4, 5};

        System.out.println("Uvecan niz za jedan:");
        inkrementacija(testniz);
        stampanje(testniz);

    }

    public static void inkrementacija(int[] nekiNiz) {
        for (int i = 0; i < nekiNiz.length; i++) {
            nekiNiz[i]++;
        }
    }

    public static void stampanje(int[] nekiNiz) {
        for (int i = 0; i < nekiNiz.length; i++) {
            System.out.println(nekiNiz[i]);
        }
    }
}
