package utorak2708;

public class Petlje2 {
    public static void main(String[] args) {
    /*    int i = 0;
        while (i<5){
            System.out.println("Hello World");
            i++;
        }

     */

       /* int i = 0;
        do {
            System.out.println("Hello world");
            i++;
        }
        while (i < 5);
*/
        int broj = 0;
        while (broj <= 10) {
            if (broj == 6) {
                broj++;
                continue;
            }
            System.out.println("Broj je :" + broj);
            broj++;
        }


    }
}
