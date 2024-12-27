package DrugiDeoOOP.Ponedeljak2309.Zadatak3;

import java.util.ArrayList;

public class Ucenik {
    private String ime;
    private int brojNeopravdanih;
    private ArrayList<Integer> ocene;

    public Ucenik(String ime, int brojNeopravdanih, ArrayList<Integer> ocene) {
        this.ime = ime;
        this.brojNeopravdanih = brojNeopravdanih;
        this.ocene = ocene;
    }

    public double prosek() {
        if (getOcene() == null || getOcene().isEmpty()) {
            return 0.0;
        }

        int suma = 0;
        for (int ocena : getOcene()) {
            suma += ocena;
        }

        return (double) suma / getOcene().size();
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getBrojNeopravdanih() {
        return brojNeopravdanih;
    }

    public void setBrojNeopravdanih(int brojNeopravdanih) {
        this.brojNeopravdanih = brojNeopravdanih;
    }

    public ArrayList<Integer> getOcene() {
        return ocene;
    }

    public void setOcene(ArrayList<Integer> ocene) {
        this.ocene = ocene;
    }

    @Override
    public String toString() {
        return "Ucenik{" +
                "ime='" + ime + '\'' +
                ", brojNeopravdanih=" + brojNeopravdanih +
                ", ocene=" + ocene +
                '}';
    }
}
