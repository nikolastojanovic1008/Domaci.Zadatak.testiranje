package petak3008;

import java.util.Scanner;

public class zadatak2 {
    public static void main(String[] args) {
/*
Zadatak 2:
Napraviti metodu koja prihvata dva broja i stampa poruku koji je od ta dva broja veci.
 */
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi prvi broj :");
        int a = sc.nextInt();
        System.out.println("Unesi drugi broj :");
        int b = sc.nextInt();
        //int a = 1;
        //int b = 5;
        mojaMetoda(a, b);
        System.out.println(mojaMetoda2(33,11));
    }

    public static void mojaMetoda(int x, int y) {
        if (x > y) {
            System.out.println("Prvi broj je veci!");
        } else if (x < y) {
            System.out.println("Drugi broj je veci!");
        } else {
            System.out.println("Brojevi su jednaki!");
        }
    }

    public static String mojaMetoda2(int a, int b) {
        String poruka1 = "Prvi broj je veci";
        String poruka2 = "Drugi broj je veci";
        String poruka3 = "Brojevi su jednaki";
        if (a > b) {
            return poruka1;
        } else if (a < b) {
            return poruka2;
        } else {
            return poruka3;

        }
    }
}
