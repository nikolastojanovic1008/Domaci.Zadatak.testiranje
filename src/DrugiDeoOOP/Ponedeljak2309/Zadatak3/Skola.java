package DrugiDeoOOP.Ponedeljak2309.Zadatak3;

import java.util.ArrayList;

public class Skola {
    private ArrayList<Ucenik> ucenici;

    public Skola(ArrayList<Ucenik> ucenici) {
        this.ucenici = ucenici;
    }

    public ArrayList<Ucenik> vukovci() {
        ArrayList<Ucenik> vukovci = new ArrayList<>();
        for (Ucenik ucenik : ucenici) {
            if (ucenik.prosek() == 5.0) {
                vukovci.add(ucenik);
            }
        }
        return vukovci;
    }

    // public void izbaci() {
    //     ucenici.removeIf(ucenik -> ucenik.prosek() < 1.5);
    // }

    public void izbaci() {
        for (int i = 0; i < getUcenici().size(); i++) {
            if (getUcenici().get(i).prosek() < 1.5) {
                ucenici.remove(i);
            }
        }
    }

    public void izbaci1() {
        ArrayList<Ucenik> lista = new ArrayList<>();
        for (Ucenik ucenik : getUcenici()) {
            if (ucenik.prosek() >= 1.5) {
                lista.add(ucenik);
            }
        }
        setUcenici(lista);
    }

    public int ukupnoNeopravdanih() {
        int ukupnoNeopravdanih = 0;
        for (Ucenik ucenik : getUcenici()) {
            ukupnoNeopravdanih += ucenik.getBrojNeopravdanih();
        }
        return ukupnoNeopravdanih;
    }

    public void ispisiUcenike() {
        for (Ucenik ucenik : ucenici) {
            System.out.println("Učenik: " + ucenik.getIme() + ", Prosek: " + ucenik.prosek() + ", Neopravdani: " + ucenik.getBrojNeopravdanih());
        }
    }

    public ArrayList<Ucenik> getUcenici() {
        return ucenici;
    }

    public void setUcenici(ArrayList<Ucenik> ucenici) {
        this.ucenici = ucenici;
    }

    @Override
    public String toString() {
        return "Skola{" +
                "ucenici=" + ucenici +
                '}';
    }
}
