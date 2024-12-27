package DrugiDeoOOP.Petak2009.Djaci;

import java.util.ArrayList;

public class Srednjoskolac extends Ucenik{
    public Srednjoskolac(String ime, double fiksnaCenaSkolovanja, ArrayList<Integer> listaOcena, int brojNeopravdanih) {
        super(ime, fiksnaCenaSkolovanja, listaOcena, brojNeopravdanih);
    }

    @Override
    public double cenaSkolovanja() {
        return getFiksnaCenaSkolovanja()+ (getFiksnaCenaSkolovanja()*0.25);
    }
}
