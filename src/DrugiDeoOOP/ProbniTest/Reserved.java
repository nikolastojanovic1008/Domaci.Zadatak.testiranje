package DrugiDeoOOP.ProbniTest;

import java.util.ArrayList;

public class Reserved extends Prodavnica {
    private double ocekivanaGodisnjaZarada;

    public Reserved(int brojZaposlenih, ArrayList<Artikl> artikli, double ocekivanaGodisnjaZarada) {
        super(brojZaposlenih, artikli);
        this.ocekivanaGodisnjaZarada = ocekivanaGodisnjaZarada;
    }

    public double getOcekivanaGodisnjaZarada() {
        return ocekivanaGodisnjaZarada;
    }

    public void setOcekivanaGodisnjaZarada(double ocekivanaGodisnjaZarada) {
        this.ocekivanaGodisnjaZarada = ocekivanaGodisnjaZarada;
    }

    @Override
    public double ukupnaZarada() {
        double zarada = 0;
        for (Artikl artikl : getArtikli()) {
            zarada += artikl.getCena();
        }
        if (zarada >= ocekivanaGodisnjaZarada) {
            zarada -= getBrojZaposlenih() * 200;
        } else {
            zarada -= getBrojZaposlenih() * 100;
        }
        return zarada;
    }

    @Override
    public String toString() {
        return "Reserved{" +
                "ocekivanaGodisnjaZarada=" + ocekivanaGodisnjaZarada +
                "} " + super.toString();
    }

/*
    Napraviti klasu Reserved koji ima dodatni atribut za ocekivanu godisnju zaradu, ukoliko je to ispunjeno
svi zaposleni dobijaju platu od 200, u suprotnom imaju platu od 100.
     */
}
