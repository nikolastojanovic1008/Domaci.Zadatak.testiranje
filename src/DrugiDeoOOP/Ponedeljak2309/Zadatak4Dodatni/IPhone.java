package DrugiDeoOOP.Ponedeljak2309.Zadatak4Dodatni;

import java.util.ArrayList;

public class IPhone extends Telefon {
    public IPhone(String ime, ArrayList<Aplikacija> listaAplikacija) {
        super(ime, listaAplikacija);
    }

    @Override
    public Aplikacija najkoriscenija() {
        Aplikacija najviseZaradjuje = null;
        double maxZarada = 0;
        for (Aplikacija aplikacija : getListaAplikacija()) {
            if (aplikacija.zarada() > maxZarada) {
                maxZarada = aplikacija.zarada();
                najviseZaradjuje = aplikacija;
            }
        }
        return najviseZaradjuje;
    }
}
