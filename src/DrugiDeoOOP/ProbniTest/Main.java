package DrugiDeoOOP.ProbniTest;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
Napraviti klasu Artikl koji od atributa ima naziv, cenu I godinu proizvodnje.
Napraviti klasu Prodavnica koja od atributa ima broj zaposlenih I listu artikala.
Napraviti metode:
-blackFriday() -> sve artikle iz liste spusta za 50%
-pronadji(String a) -> trazi prosledjeni naziv u listi artikala
-triftKolekcija() -> vraca listu artikala koji su stariji od 20 godina
-ukupnaZarada() -> racuna Koliko prodavnica zaradjuje kada proda sve artikle, uz to da svakog zaposlenog placaju 100
-izbaciPrestaro() -> izbacuje iz liste sve artikle koji su stariji od 30 god
Napraviti klasu HM koji nasledjuje klasu Prodavnica I oni svoje zaposlene placaju 150.
Napraviti klasu Zara koji nasledjuje klasu Prodavnica I oni svoje zaposlene placaju 200.
Napraviti klasu Reserved koji ima dodatni atribut za ocekivanu godisnju zaradu, ukoliko je to ispunjeno
svi zaposleni dobijaju platu od 200, u suprotnom imaju platu od 100.
Napraviti klasu SportVision I on za black Friday daje popust od 30% na sve artikle.
Za sve klase kreirati adekvatne konstruktore, geter I setere kao I toString.
Modifikovanje metoda je dozvoljeno kao I kreiranje dodatnih.
         */
        ArrayList<Artikl> lista = new ArrayList<>();
        Artikl jedan = new Artikl("Jakna", 5000, 2010);
        Artikl dva = new Artikl("Pantalone", 3000, 2000);
        Artikl tri = new Artikl("Majica", 1000, 1991);
        Artikl cetiri = new Artikl("Bermude", 4500, 2005);
        lista.add(jedan);
        lista.add(dva);
        lista.add(tri);
        lista.add(cetiri);
        Prodavnica hm = new HM(10, lista);
        Prodavnica reserved = new Reserved(10,lista, 10000);
        Prodavnica sportvision = new SportVision(10, lista);
        Prodavnica zara = new Zara(10, lista);
        System.out.println("Ukupna zarada  prodavnice: " + reserved.ukupnaZarada());
        System.out.println(reserved);
        /*
        System.out.println("Pre Black Friday popusta: " + hm.getArtikli());
        hm.blackFriday();
        System.out.println("Posle Black Friday popusta: " + hm.getArtikli());

        System.out.println("Artikli stariji od 20 godina: " + hm.triftKolekcija());
        System.out.println("Ukupna zarada  prodavnice: " + hm.ukupnaZarada());

        hm.izbaciPrestaro();
        System.out.println("Posle izbacivanja starih artikala: " + hm.getArtikli());

        System.out.println("Pre Black Friday popusta: " + reserved.getArtikli());
        reserved.blackFriday();
        System.out.println("Posle Black Friday popusta: " + reserved.getArtikli());

        System.out.println("Artikli stariji od 20 godina: " + reserved.triftKolekcija());
        System.out.println("Ukupna zarada  prodavnice: " + reserved.ukupnaZarada());

        hm.izbaciPrestaro();
        System.out.println("Posle izbacivanja starih artikala: " + reserved.getArtikli());


        System.out.println("Pre Black Friday popusta: " + sportvision.getArtikli());
        sportvision.blackFriday();
        System.out.println("Posle Black Friday popusta: " + sportvision.getArtikli());

        System.out.println("Artikli stariji od 20 godina: " + sportvision.triftKolekcija());
        System.out.println("Ukupna zarada  prodavnice: " + sportvision.ukupnaZarada());

        sportvision.izbaciPrestaro();
        System.out.println("Posle izbacivanja starih artikala: " + sportvision.getArtikli());
*/
        System.out.println("Pre Black Friday popusta: " + zara.getArtikli());
        zara.blackFriday();
        System.out.println("Posle Black Friday popusta: " + zara.getArtikli());

        System.out.println("Artikli stariji od 20 godina: " + zara.triftKolekcija());
        System.out.println("Ukupna zarada  prodavnice: " + zara.ukupnaZarada());

        zara.izbaciPrestaro();
        System.out.println("Posle izbacivanja starih artikala: " + zara.getArtikli());
    }
}
