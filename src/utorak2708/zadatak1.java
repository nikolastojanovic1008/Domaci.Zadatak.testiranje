package utorak2708;

import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj ciji faktorijel zelite da izracunate");
        int broj = sc.nextInt();

        int i = 1;
        int faktorijel = 1;
        while (i <= broj) {
            faktorijel *= i;
            i++;
            System.out.println("trenutni faktorijel je: " + faktorijel);
        }
        System.out.println("faktorijel je: " + faktorijel);
    }
}
