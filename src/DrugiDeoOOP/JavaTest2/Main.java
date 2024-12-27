package DrugiDeoOOP.JavaTest2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Planina> planine = new ArrayList<>();
        Planina planina1 = new Planina("Kopaonik", 2017, false);
        Planina planina2 = new Planina("Mont Everest", 8848, true);
        Planina planina3 = new Planina("Fruška Gora", 539, false);
        Planina planina4 = new Planina("Zlatibor", 1496, false);
        Planina planina5 = new Planina("Alpi", 4810, true);


        planine.add(planina1);
        planine.add(planina2);
        planine.add(planina3);
        planine.add(planina4);
        planine.add(planina5);
        //System.out.println(planine);

        Planinar planinar1 = new Rekreativac(2000);
        Planinar planinar2 = new Amater( 1500);
        Planinar planinar3 = new Pro( 5000);

        planinar1.dodaj(planina1);
        planinar1.dodaj(planina2);
        planinar1.dodaj(planina3);
        planinar1.dodaj(planina4);
        planinar1.dodaj(planina5);


        planinar2.dodaj(planina1);
        planinar2.dodaj(planina4);
        planinar2.dodaj(planina3);
        planinar2.dodaj(planina5);

        planinar3.dodaj(planina1);
        planinar3.dodaj(planina2);
        planinar3.dodaj(planina3);
        planinar3.dodaj(planina5);


        //System.out.println("Opasne planine za rekreativca: " + planinar1.opasne());
        //System.out.println("Opasne planine za amatera: " + planinar2.opasne());

        //System.out.println("Rekreativac planine: " + planinar1.getPlanine());
        //System.out.println("Amater planine: " + planinar2.getPlanine());
       // System.out.println("Pro planine: " + planinar3.getPlanine());
        //System.out.println("Opasne planine za rekreativca: " + planinar1.opasne());
        //System.out.println("Opasne planine za amatera: " + planinar2.opasne());

       // System.out.println("Najveća planina rekreativca: " + planinar1.najveca());
        //planinar1.izbaci();
        //System.out.println("Planine rekreativca posle izbacivanja: " + planinar1.getPlanine());

        //planinar3.izbaci();
        //System.out.println("Pro planine posle izbacivanja: " + planinar3.getPlanine());






        /*
Napraviti klasu Planina
atributi: naziv(String), visina(double ili int) i opasnost(Boolean)
Napraviti klasu Planinar
atributi:lista planina, max uspon(maksimalna visina na koju taj planinar moze da se popne)
Metode: -dodaj(Planina p) -> ubacuje datu planinu u listu ukoliko je njena visina manja ili jednaka max usponu
	-opasne() -> metoda vraca listu planina koje su opasne za penjanje
 	-izbaci() -> izbacuje planinu iz liste ukoliko je veca od max uspona nekog planinara i ako je opasna
	-najveca()-> vraca najvecu planinu iz planinarove liste
Napraviti klasu Rekreativac koji nasledjuje klasu Planinar.
Napraviti klasu Amater koji nasledjuje klasu Planinar.
Napraviti klasu Pro koji nasledjuje klasu Planinar koji iz svoje liste izbacuje samo planine koje su vece
od njegovog maxUspon-a.
Za sve klase je potrebno deklarisati dati konstruktor, get,set i toString.

*/
    }
}
