package DrugiDeoOOP.Ponedeljak2309.Zadatak3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ocene1 = new ArrayList<>();
        ocene1.add(5);
        ocene1.add(5);
        ocene1.add(5);
        ocene1.add(5);
        ocene1.add(5);
        ArrayList<Integer> ocene2 = new ArrayList<>();
        ocene2.add(4);
        ocene2.add(4);
        ocene2.add(4);
        ocene2.add(4);
        ArrayList<Integer> ocene3 = new ArrayList<>();
        ocene3.add(1);
        ocene3.add(1);
        ocene3.add(2);
        ocene3.add(1);
        ArrayList<Integer> ocene4 = new ArrayList<>();
        ocene4.add(5);
        ocene4.add(5);
        ocene4.add(5);
        ocene4.add(5);


        Ucenik ucenik1 = new Ucenik("Marko", 5, ocene1);
        Ucenik ucenik2 = new Ucenik("Jovan", 3, ocene2);
        Ucenik ucenik3 = new Ucenik("Ana", 10, ocene3);
        Ucenik ucenik4 = new Ucenik("Mila", 2, ocene4);

        ArrayList<Ucenik> ucenici = new ArrayList<>();
        ucenici.add(ucenik1);
        ucenici.add(ucenik2);
        ucenici.add(ucenik3);
        ucenici.add(ucenik4);

        Skola skola = new Skola(ucenici);

        System.out.println("Svi učenici:");
        skola.ispisiUcenike();

        System.out.println("Vukovci:");
        for (Ucenik ucenik : skola.vukovci()) {
            System.out.println(ucenik.getIme());

        }
        //System.out.println(skola.vukovci());
        skola.izbaci();
        System.out.println("Ukupan broj neopravdanih je: " + skola.ukupnoNeopravdanih());
    }
    /*
    Zadatak 3:
Napraviti klasu Ucenik koji ima kao atribute ime, broj neopravdanih I listu ocena.
Napraviti metodu:
- prosek() -> racuna ucenikov prosek
Napraviti klasu Skola koja ima listu ucenika i metode:
- vukovci() -> vraca listu djaka koji imaju prosek 5.0
- izbaci() -> izbacuje iz liste sve djake koji imaju prosek ispod 1.5
- ukupnoNeopravdanih() -> vraca sumu svih neopravdanih od ucenika
     */

}
