package ponedeljak2608;

import java.util.Scanner;

public class switchnaredba {
    public static void main(String[] args) {
       /* int x = 2;
        switch (x) {
            case 1:
                System.out.println("Vrednost iksa je 1");
                break;
            case 2:
                System.out.println("Vrednost iksa je 2");
                break;
            default:
                System.out.println("Vrednost iksa nije ni 1 ni 2");
                break;
        }*/
        /*
        Zadatak 1:
Kreirati dva proizvoljna broja i ponuditi korisniku jednu od dve operacije za primenu(sabiranje ili oduzimanje).
         */
      /*  Scanner sc = new Scanner(System.in);
        int x = 5;
        int y = 3;

        System.out.println("Unesite jednu od dve operacija, + ili - ");
        String tekst = sc.nextLine();
        int  rezultat;

        switch (tekst.trim()){
            case "+":
                rezultat = x +y;
                System.out.println("Rezultat je :" + rezultat);
                break;
            case "-":
                rezultat = x-y;
                System.out.println("rezultat je :" + rezultat );
                break;
            default:
                System.out.println("Nisi uneo dobru operaciju");

        }*/
/*
Zadatak 2:
Kreirati dva proizvoljna broja i ponuditi korisniku jednu od tri operacije za primenu(mnozenje, ostatak i inkrement).
 */
        int a = 15;
        int b = 7;
        System.out.println("Unesite jednu od tri operacije za primenu,  *, % ili ++");
        Scanner sc = new Scanner(System.in);
        String tekst2 = sc.nextLine();
        int rezultat2;
        int rezultat3;
        switch (tekst2.trim()) {
            case "*":
                rezultat2 = a * b;
                System.out.println("Proizvod dva broja je : " + rezultat2);
                break;
            case "%":
                rezultat2 = a % b;
                System.out.println("Ostatak pri celobrojnom deljenju je : " + rezultat2);
                break;
            case "++":
                rezultat2 = ++a;
                rezultat3 = ++b;
                System.out.println("Oba broja su inkrementovana i ona sada imaju vrednosti: " + rezultat2 + " " + rezultat3);
                break;
            default:
                System.out.println("Nisi uneo pravilan znak");
                break;


        }


    }
}
