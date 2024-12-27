package DrugiDeoOOP.Ponedeljak2309.Zadatak1;

import java.util.ArrayList;
/*
- cena() -> vraca cenu nekretnine, ukoliko ima vise od 100 kvadrata, na ukupnu svotu dati popust od 15%
 */

public class Stan extends Nekretnina {

    public Stan(int kvadratura, double cenaPoKv, ArrayList<Double> ponude) {
        super(kvadratura, cenaPoKv, ponude);
    }

    @Override
    public double cena() {
        double rezultat = getCenaPoKv()*getKvadratura();
        if(getKvadratura()>100) {
            rezultat*=0.85;
        }
        return rezultat;
    }
}

