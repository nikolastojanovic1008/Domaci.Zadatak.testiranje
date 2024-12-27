package DrugiDeoOOP.Ponedeljak2309.Zadatak4Dodatni;

import java.util.ArrayList;

public class Telefon {
    /*
    Napraviti klasu Telefon koji kao atribut ima naziv i listu aplikacija. Napraviti metodu:
- najkoriscenija() -> vraca aplikaciju koja se najvise koristi
- netWorth() -> vraca ukupnu zaradu svih aplikacija koje telefon ima
- delete(Aplikacija a) -> brise aplikaciju iz liste
     */
    private String ime;
    private ArrayList<Aplikacija> listaAplikacija;

    public Telefon(String ime, ArrayList<Aplikacija> listaAplikacija) {
        this.ime = ime;
        this.listaAplikacija = listaAplikacija;
    }
    public Aplikacija najkoriscenija() {
        Aplikacija najkoriscenija = null;
        double maxVreme = 0;
        for (Aplikacija aplikacija : listaAplikacija) {
            if (aplikacija.getUkupnoVreme() > maxVreme) {
                maxVreme = aplikacija.getUkupnoVreme();
                najkoriscenija = aplikacija;
            }
        }
        return najkoriscenija;
    }
    public double netWorth() {
        double ukupnaZarada = 0;
        for (Aplikacija aplikacija : listaAplikacija) {
            ukupnaZarada += aplikacija.zarada();
        }
        return ukupnaZarada;
    }
    public void delete(Aplikacija aplikacija) {
        listaAplikacija.remove(aplikacija);
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public ArrayList<Aplikacija> getListaAplikacija() {
        return listaAplikacija;
    }

    public void setListaAplikacija(ArrayList<Aplikacija> listaAplikacija) {
        this.listaAplikacija = listaAplikacija;
    }

    @Override
    public String toString() {
        return "Telefon{" +
                "ime='" + ime + '\'' +
                ", listaAplikacija=" + listaAplikacija +
                '}';
    }
}
