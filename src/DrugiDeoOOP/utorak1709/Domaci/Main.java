package DrugiDeoOOP.utorak1709.Domaci;

import DrugiDeoOOP.ponedeljak1609.DomaciZadatak.BankovniRacun;

public class Main {
    public static void main(String[] args) {
        BankovniRacunEnkapsulacija korisnik1 = new BankovniRacunEnkapsulacija(101, "Petar Petrović", 10000);
        BankovniRacunEnkapsulacija korisnik2 = new BankovniRacunEnkapsulacija(102, "Nikola Nikolić", 20.45);

        korisnik1.uplata(2000);
        korisnik1.uplata(3350);
        korisnik1.uplata(-3500);
        korisnik1.isplata(10000);
        korisnik1.isplata(-3000);
        System.out.println(korisnik1);

        korisnik2.uplata(10.15);
        korisnik2.uplata(25.69);
        korisnik2.isplata(21.99);
        System.out.println(korisnik2);
    }
}
