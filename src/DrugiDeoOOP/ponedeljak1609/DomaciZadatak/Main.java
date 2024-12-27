package DrugiDeoOOP.ponedeljak1609.DomaciZadatak;

public class Main {
    public static void main(String[] args) {
        /*
        Kreirati klasu BankovniRacun koja modeluje bankovni racun. Svaki bankovni racun ima svoj jedinstveni broj,
        ime vlasnika racuna, i trenutno stanje na racunu.
Implementirati konstruktor koji postavlja vrednosti ovih atributa pri kreiranju racuna.
Dodati metode uplata i isplata koje omogucavaju uplatu i isplatu novca sa racuna.
Obe metode primaju iznos kao argument. Metoda uplata povecava trenutno stanje racuna za dati iznos,
dok metoda skidanje smanjuje trenutno stanje racuna.
Implementirati provere da li je iznos uplate ili skidanja pozitivan i da li postoji dovoljno
sredstava na racunu za skidanje.
Napisati metodu toString koja generise string reprezentaciju objekta, uključujući broj racuna,
ime vlasnika i trenutno stanje na racunu.
U main metodi, kreirati objekat klase BankovniRacun, ispisati informacije o računu pomocu
metode toString, izvrsiti nekoliko uplata i skidanja novca na računu pomoću metoda uplata i
skidanje, te na kraju ispisati azurirane informacije o racunu.
         */
        BankovniRacun korisnik1 = new BankovniRacun(101, "Petar Petrović", 10000);
        BankovniRacun korisnik2 = new BankovniRacun(102, "Nikola Nikolić", 20.45);
        //System.out.println(korisnik1);
        korisnik1.uplata(2000);
        korisnik1.uplata(1000);
        korisnik1.uplata(3500);
        korisnik1.isplata(5000);
        korisnik1.isplata(3000);
        System.out.println(korisnik1);

        korisnik2.uplata(10.15);
        korisnik2.uplata(25.69);
        korisnik2.isplata(21.99);
        System.out.println(korisnik2);
    }
}
