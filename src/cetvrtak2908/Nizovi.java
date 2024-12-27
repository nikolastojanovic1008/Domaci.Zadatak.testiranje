package cetvrtak2908;

import java.util.Scanner;

public class Nizovi {
    public static void main(String[] args) {
        //{1,2,3,4,5}
        int[] niz = {1,2,3,4};
        int[] niz2 = new int[5];//{0,0,0,0}
        String[] niz3 = new String[3]; // {null, null,null}

      /*  System.out.println(niz[0]); // prvi element niza
        System.out.println(niz[1]); // drugi element niza
        System.out.println(niz[2]); // treci element niza
        System.out.println(niz[3]); // cetvrti element iz niza

       // System.out.println(niz[4]); // u ovom slucaju dobijamo out of bounds gresku
*/
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<niz.length; i++) {//šablon za štampanje niza
            System.out.println(niz[i]);
            niz[i] = sc.nextInt();
        }
        System.out.println("////////////");
        for (int i=niz.length-1; i>=0; i--){
            System.out.println(niz[i]);
        }

        int[] niz4 = new int[4];
        niz4[2] = 5;


    }
}
