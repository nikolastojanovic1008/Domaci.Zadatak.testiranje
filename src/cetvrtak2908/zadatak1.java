package cetvrtak2908;

public class zadatak1 {
    public static void main(String[] args) {
        /*
        Zadatak 1:
Napraviti niz brojeva i stampati samo parne.
         */
        int[] niz = {1,2,5,4,6,78,};
        System.out.println("parni brojevi su: ");
        for (int i=0; i< niz.length; i++){
            if (niz[i]%2==0){
                System.out.println(niz[i]);
            }
        }

    }
}
