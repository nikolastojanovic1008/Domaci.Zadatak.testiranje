package DrugiDeoOOP.Ponedeljak2309.Domaci;

import java.util.ArrayList;

public abstract class Klub {
    private String naziv;
    private String grad;
    private ArrayList<Igrac> igraci;

    public Klub(String naziv, String grad, ArrayList<Igrac> igraci) {
        this.naziv = naziv;
        this.grad = grad;
        this.igraci = igraci;
    }
    public String najiskusnijiIgrac() {
        Igrac najiskusniji = null;
        int maxGodineIskustva = 0;
        for (Igrac igrac : igraci) {
            if (igrac.getGodineIskustva() > maxGodineIskustva) {
                maxGodineIskustva = igrac.getGodineIskustva();
                najiskusniji = igrac;
            }
        }
        return najiskusniji.getIme();
        //return najiskusniji != null ? najiskusniji.getIme() : "Nema igrača";
    }
    public int ukupnoPoena() {
        int ukupno = 0;
        for (Igrac igrac : igraci) {
            ukupno += igrac.getBrojPoena();
        }
        return ukupno;
    }
    public abstract double vrednostTima();

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public ArrayList<Igrac> getIgraci() {
        return igraci;
    }

    public void setIgraci(ArrayList<Igrac> igraci) {
        this.igraci = igraci;
    }

    @Override
    public String toString() {
        return "Klub{" +
                "naziv='" + naziv + '\'' +
                ", grad='" + grad + '\'' +
                ", igraci=" + igraci +
                '}';
    }
}
