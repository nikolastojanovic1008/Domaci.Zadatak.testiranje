package DrugiDeoOOP.Cetvrtak1909.DomaciMenjacnica;

public class Dolar extends Valuta {
    public Dolar(double kurs) {
        super("Dolar", "USD", kurs);
    }

    public void postaviKursNovi(double noviKurs) {
        setKurs(noviKurs);
    }
}

