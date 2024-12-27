package utorak2708;

public class zadatak2 {
    public static void main(String[] args) {
        /*
        Zadatak 2:
Pomocu while petlje izracunati sumu prvih 10 brojeva.
         */
        int i = 1;
        int suma = 0;
        while (i <= 10) {
            suma += i;
            i++;
        }
        System.out.println("Suma prvih 10 prirodnih brojeva je: " + suma);
    }
}
