package DrugiDeoOOP.Projekti.Fakultet1;

import java.util.ArrayList;

public class Student extends Osoba{
    private String brojIndeksa;
    private double prosecnaOcena;
    private ArrayList<Predmet> predmeti;


    public Student(String ime, String prezime, int godinaRodjenja, String brojIndeksa, double prosecnaOcena) {
        super(ime, prezime, godinaRodjenja);
        this.brojIndeksa = brojIndeksa;
        this.prosecnaOcena = prosecnaOcena;
        this.predmeti = new ArrayList<>();
    }
    public void dodajPredmet(Predmet predmet) {
        predmeti.add(predmet);
    }
    public double getProsecnaOcena() {
        return prosecnaOcena;
    }
    @Override
    public String predstaviSe() {
        return super.predstaviSe() + " Student sa brojem indeksa: " + brojIndeksa + ", prosečna ocena: " + prosecnaOcena;
    }
    public void ispisPredmeta() {
        System.out.println("Predmeti koje student sluša:");
        for (Predmet predmet : predmeti) {
            System.out.println(predmet.opisPredmeta());
        }
    }


}
