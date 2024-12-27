package ponedeljak2608;

import java.util.Scanner;

public class vezba6 {
    public static void main(String[] args) {
        /*
        Zadatak 6(switch):
Definisati neku fiksnu platu. Unesite radnu poziciju (moze biti Mehanicar, Fizikalac ili Sef),
ukoliko ste fizikalac na fiksnu platu imate bonus od 1000,
ukoliko ste Mehanicar imate bonus od 1500 a Sef 2000 bonus na platu. Istampati koliku radnik ima platu.
         */
        int fiksnaPlata = 1000;

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite radnu poziciju (mehanicar, fizikalac ili sef)");
        String pozicija = sc.nextLine();
        int plataMehanicar = fiksnaPlata + 1500;
        int plataFizikalac = fiksnaPlata + 1000;
        int plataSef = fiksnaPlata + 2000;

        switch (pozicija.trim().toUpperCase()){
            case "MEHANIČAR":
                System.out.println("Plata mehanicara je: " + plataMehanicar);
                break;
            case "FIZIKALAC":
                System.out.println("Plata fizikalca je: " + plataFizikalac);
                break;
            case "ŠEF":
                System.out.println("Plata sefa je: " + plataSef);
                break;
            default:
                System.out.println("Niste uneli pravilnu poziciju");
                break;

        }
    }
}
