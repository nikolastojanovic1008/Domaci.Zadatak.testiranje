package DrugiDeoOOP.ponedeljak1609.Ljudi;

public class Auto {
    /*
    Zadatak 1:
Napraviti klasu Auto koja ima od atributa naziv modela, maksimalnu brzinu na sat, cenu i boju.
Napraviti metodu koja racuna za Koliko sati taj auto moze da predje 1000km.
Napraviti metodu koja smanjuje cenu za 10% ako je boja automobila ljubicasta.
Klasa mora imati adekvatan konstruktor i toString.
     */
    private String nazivModela;
    private int maksimalnaBrzina;
    private double cena;
    private String boja;

    public Auto(String nazivModela, int maksimalnaBrzina, double cena, String boja) {
        this.nazivModela = nazivModela;
        this.maksimalnaBrzina = maksimalnaBrzina;
        this.cena = cena;
        this.boja = boja;

    }

    public String getNazivModela() {
        return nazivModela;
    }

    public int getMaksimalnaBrzina() {
        return maksimalnaBrzina;
    }

    public double getCena() {
        return cena;
    }

    public String getBoja() {
        return boja;
    }

    public void setNazivModela(String nazivModela) {
        this.nazivModela = nazivModela;
    }

    public void setMaksimalnaBrzina(int maksimalnaBrzina) {
        this.maksimalnaBrzina = maksimalnaBrzina;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public int vremePredjeniPut() {
        return 1000 / maksimalnaBrzina;
    }

    public double popustNaBoju() {
        if (getBoja().equalsIgnoreCase("ljubicasta")) {
            setCena(cena * 0.9);
        } else {
            return cena;
        }

        return cena;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "nazivModela='" + nazivModela + '\'' +
                ", maksimalnaBrzina=" + maksimalnaBrzina +
                ", cena=" + cena +
                ", boja='" + boja + '\'' +
                '}';
    }
}

