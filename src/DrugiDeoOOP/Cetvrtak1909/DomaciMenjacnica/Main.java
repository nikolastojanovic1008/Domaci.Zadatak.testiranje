package DrugiDeoOOP.Cetvrtak1909.DomaciMenjacnica;

public class Main {
    public static void main(String[] args) {
        Dolar dolar = new Dolar(100);
        Euro euro = new Euro(120);

        dolar.postaviKursNovi(105.26);
        euro.postaviKursNovi(117.06);
        System.out.println(dolar);
        System.out.println(euro);


        System.out.println("100 USD dolara u dinarima je: " + dolar.konvertujUdinare(100));

        System.out.println("100 EUR evra u dinarima je: " + euro.konvertujUdinare(100));

        System.out.println("100 EUR u USD: " + 100 * euro.getKurs() / dolar.getKurs());

        System.out.println("10000 dinara u EUR evrima je: " + 10000 / euro.getKurs());
        System.out.println("10000 dinara u USD dolarima je: " + 10000 / dolar.getKurs());


    }
}
