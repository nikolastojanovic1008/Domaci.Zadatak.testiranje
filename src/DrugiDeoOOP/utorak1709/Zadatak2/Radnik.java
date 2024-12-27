package DrugiDeoOOP.utorak1709.Zadatak2;

public class Radnik {
    /*
    Zadatak 2:
Napraviti klasu Radnik koja ima id, godinu zaposlenja i platu radnika.
Napraviti metodu koja racuna staz radniku i metodu koja daje povisicu za 20%
ukoliko se radnik tu nalazi vise od 5 godina, i povisicu od 40% ukoliko ima
staz duzi od 10 godina.
Napraviti adekvatan konstruktor, get i set metod, kao i toString.
     */
    private int id;
    private int godinaZaposlenja;
    private double plata;

    public Radnik(int id, int godinaZaposlenja, double plata) {
        this.id = id;
        this.godinaZaposlenja = godinaZaposlenja;
        this.plata = plata;
    }

    @Override
    public String toString() {
        return "Radnik{" +
                "id=" + id +
                ", godinaZaposlenja=" + godinaZaposlenja +
                ", plata=" + plata +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGodinaZaposlenja() {
        return godinaZaposlenja;
    }

    public void setGodinaZaposlenja(int godinaZaposlenja) {
        this.godinaZaposlenja = godinaZaposlenja;
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }

    public int staz() {
        int staz = 2024 - getGodinaZaposlenja();
        return staz;
    }

    public void novaPlata() {
        if (staz() > 5 && staz() <= 10) {
            setPlata(getPlata() * 1.2);
        } else if (staz() > 10) {
            setPlata(getPlata() * 1.4);
        } else {
            setPlata(getPlata());
        }
    }
}
