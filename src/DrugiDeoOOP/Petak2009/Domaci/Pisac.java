package DrugiDeoOOP.Petak2009.Domaci;

import java.util.ArrayList;

public class Pisac {
    /*
    Napraviti klasu Pisac koja ima atribute: ime, godina rođenja, i lista knjiga (lista objekata klase Knjiga).
Napraviti metode:
najpoznatijaKnjiga() -> koja vraća naslov knjige sa najvećim brojem strana.
vremePisanja() -> koja vraća razliku između godine izdavanja prve i poslednje knjige.
     */
    private String ime;
    private int godinaRodjenja;
    private ArrayList<Knjiga> knjige;

    public Pisac(String ime, int godinaRodjenja, ArrayList<Knjiga> knjige) {
        this.ime = ime;
        this.godinaRodjenja = godinaRodjenja;
        this.knjige = knjige;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }

    public ArrayList<Knjiga> getKnjige() {
        return knjige;
    }

    public void setKnjige(ArrayList<Knjiga> knjige) {
        this.knjige = knjige;
    }

    public String najpoznatijaKnjiga() {
        if (knjige.isEmpty()) {
            return "Nema knjiga!";
        }
        Knjiga najpoznatija = knjige.get(0);
        for (Knjiga k : knjige) {
            if (k.getBrojStrana() > najpoznatija.getBrojStrana()) {
                najpoznatija = k;
            }
        }
        return najpoznatija.getNaslov();
    }

    public int vremePisanja() {
        if (knjige.size() < 2) {
            return 0;
        }
        int prvaGodina = knjige.get(0).getGodinaIzdavanja();
        int poslednjaGodina = knjige.get(0).getGodinaIzdavanja();
        for (Knjiga k : knjige) {
            if (k.getGodinaIzdavanja() < prvaGodina) {
                prvaGodina = k.getGodinaIzdavanja();
            }
            if (k.getGodinaIzdavanja() > poslednjaGodina) {
                poslednjaGodina = k.getGodinaIzdavanja();
            }
        }
        return poslednjaGodina - prvaGodina;
    }

    @Override
    public String toString() {
        return "Pisac{" +
                "ime='" + ime + '\'' +
                ", godinaRodjenja=" + godinaRodjenja +
                ", knjige=" + knjige +
                '}';
    }
}
