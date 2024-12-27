package petak3008.Domaci;

public class Zadatak1 {
    public static void main(String[] args) {
        /*
3. Napisati program koji koristi metode za ispisivanje kvadrata i korena unetog broja.
         */
        double a = 9;
        double b = 4;
        double kvadratBrojeva = kvadrat(a, b);
        System.out.println("Stepen broja a na broj b je: " + kvadratBrojeva);
        double korenBrojeva = koren(a);
        double korenBrojeva2 = koren(b);
        System.out.println("Koren broja a je: " + korenBrojeva);
        System.out.println("Koren broja b je: " + korenBrojeva2);
    }

    public static double kvadrat(double a, double b) {
        double c = Math.pow(a, b);
        return c;
    }

    public static double koren(double a) {
        double c = Math.sqrt(a);
        return c;
    }
}
