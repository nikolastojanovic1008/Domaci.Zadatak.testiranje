package DrugiDeoOOP.ponedeljak1609.DomaciZadatak;

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


public class BankovniRacun {
    int jedinstveniBroj;
    String ime;
    double trenutnoStanje;

    public BankovniRacun(int jedinstveniBroj, String ime, double trenutnoStanje) {
        this.jedinstveniBroj = jedinstveniBroj;
        this.ime = ime;
        this.trenutnoStanje = trenutnoStanje;
    }

    public String toString() {
        return "Jedinstveni broj računa: " + jedinstveniBroj + "\n" +
                "Ime vlasnika računa: " + ime + "\n" +
                "Trenutno stanje: " + trenutnoStanje;
    }

    public void uplata(double svotaUplata) {
        if (svotaUplata > 0) {
            trenutnoStanje += svotaUplata;
        } else {
            System.out.println("Druže ne možeš da uplatiš negativni iznos");
        }

    }

    public void isplata(double svotaIsplata) {
        if (svotaIsplata > 0) {
            if (trenutnoStanje >= svotaIsplata) {
                trenutnoStanje -= svotaIsplata;
            } else {
                System.out.println("Ne možete isplatiti više nego što imate!");
            }
        } else {
            System.out.println("Ne mozete isplatiti negativnu sumu!");
        }
    }
}
