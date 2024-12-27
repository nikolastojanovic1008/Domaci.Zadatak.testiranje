package DrugiDeoOOP.Cetvrtak1909.DomaciMenjacnica;

public class Euro extends Valuta {
    public Euro(double kurs) {
        super("Euro", "EUR", kurs);
    }

    public void postaviKursNovi(double noviKurs) {
        setKurs(noviKurs);
    }
}
