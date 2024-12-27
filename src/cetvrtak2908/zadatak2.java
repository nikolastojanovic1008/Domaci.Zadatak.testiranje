package cetvrtak2908;

public class zadatak2 {
    public static void main(String[] args) {
       /*
       Zadatak 2:
Napraviti niz brojeva i povecati ih sve za 1.
        */
        int niz[] = {1,3,5,7,9};
        System.out.println("Brojevi povecani za jedan su:");
        for (int i=0; i<niz.length; i++){
            niz[i]++;
            System.out.println(niz[i]);
        }

    }
}
