package ProbniTest;

public class zadatak2 {
    public static void main(String[] args) {
        /*
        Zadatak 2:
Napraviti metodu koja prihvata niz celih brojeva i vraca najmanji broj iz niza.
         */
        int[] niz = {10, 3, -1, 7, 9};
        //System.out.println("Najmanji broj u nizu je: " + minimum(niz));
        stampanje(minimum(niz));
    }

    public static int minimum(int[] niz) {
        int min = niz[0];
        for (int i = 0; i < niz.length; i++) {
            if (niz[i]<min){
                min = niz[i];
            }
        }
        return min;
    }
    public static void stampanje (int a){
        System.out.println("Najmanji broj u nizu je: " + a);
    }
}
