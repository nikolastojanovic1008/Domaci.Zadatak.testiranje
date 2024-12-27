package petak3008.Domaci;

public class Zadatak2 {
    public static void main(String[] args) {
        /*
        4. Napisati program koji koristi metodu za izracunavanje faktorijela unetog broja.
         */
        int x = 6;
        System.out.println("Faktorijel broja x je: " + faktorijel(x));
    }

    public static int faktorijel(int a) {
        int i = 1;
        int faktorijelRez = 1;
        while (i <= a) {
            faktorijelRez *= i;
            i++;
        }
        return faktorijelRez;
    }
}
