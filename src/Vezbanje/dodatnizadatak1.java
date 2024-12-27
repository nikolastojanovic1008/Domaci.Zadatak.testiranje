package Vezbanje;

import java.util.Scanner;

public class dodatnizadatak1 {
    public static void main(String[] args) {
        /*
        Zadatak 1:
Napraviti program gde cete uneti neki proizvoljan broj preko Scanner-a,
zatim ispitati da li je taj broj paran ili neparan, proveriti da li spada
u brojeve visokog ranga(da li je veci od 50), takodje proveriti da li je
taj broj deljiv sa 2 i sa 3.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite neki proizvoljan broj:");
        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("Uneti broj je Paran: ");
        }else {
            System.out.println("Uneti broj je Neparan: ");
        }
        if (x>50){
            System.out.println("Uneti broj je visokog ranga: ");
        }else {
            System.out.println("Uneti broj nije visokog ranga:");
        }
        if (x%2 == 0 && x%3==0){
            System.out.println("Uneti broj je deljiv sa 2 i 3");
        }else {
            System.out.println("Uneti broj NIJE deljiv sa 2 i 3");
        }
    }
}
