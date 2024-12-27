package DrugiDeoOOP.Petak2009.Djaci;

import java.util.ArrayList;

public abstract class Ucenik {
    /*
    Zadatak 2:
Napraviti klasu Ucenik koji ima kao atribute ime, fiksna cena skolovanja, listu ocena I broj neopravdanih.
Napraviti metode:
- zaUkor() -> vraca true ili false u zavisnosti od toga da li djak ispunjava neke uslove za ukor
(da li ima vise od 10 nepravdanih ili ako ima vise od 10 jedinica).
- cenaSkolovanja() -> vraca punu cenu skolovanja ako racunamo da pored vec fiksnih troskova imamo I druge troskove koji
iznose 15% od fiksne cene skolovanja
Klasa Osnovac nasledjuje klasu Ucenik.
Klasa SrednjoSkolac nasledjuje klasu Ucenik I on ima 25% dodatnih troskova.
Klasa Student nasledjuje klasu Ucenik I on ima 30% dodatnih troskova.
     */
    private String ime;
    private double fiksnaCenaSkolovanja;
    private ArrayList<Integer> listaOcena;
    private int brojNeopravdanih;

    public Ucenik(String ime, double fiksnaCenaSkolovanja, ArrayList<Integer> listaOcena, int brojNeopravdanih) {
        this.ime = ime;
        this.fiksnaCenaSkolovanja = fiksnaCenaSkolovanja;
        this.listaOcena = listaOcena;
        this.brojNeopravdanih = brojNeopravdanih;
    }
    public boolean zaUkor() {
        int brojJedinica = 0;
        for (int ocena : getListaOcena()) {
            if (ocena == 1) {
                brojJedinica++;
            }
        }
        return brojNeopravdanih > 10 || brojJedinica > 10;
    }
    public abstract double cenaSkolovanja();



    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getFiksnaCenaSkolovanja() {
        return fiksnaCenaSkolovanja;
    }

    public void setFiksnaCenaSkolovanja(double fiksnaCenaSkolovanja) {
        this.fiksnaCenaSkolovanja = fiksnaCenaSkolovanja;
    }

    public ArrayList<Integer> getListaOcena() {
        return listaOcena;
    }

    public void setListaOcena(ArrayList<Integer> listaOcena) {
        this.listaOcena = listaOcena;
    }

    public int getBrojNeopravdanih() {
        return brojNeopravdanih;
    }

    public void setBrojNeopravdanih(int brojNeopravdanih) {
        this.brojNeopravdanih = brojNeopravdanih;
    }

    @Override
    public String toString() {
        return "Ucenik{" +
                "ime='" + ime + '\'' +
                ", fiksnaCenaSkolovanja=" + fiksnaCenaSkolovanja +
                ", listaOcena=" + listaOcena +
                ", brojNeopravdanih=" + brojNeopravdanih +
                '}';
    }
}
