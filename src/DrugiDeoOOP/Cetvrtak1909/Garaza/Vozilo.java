package DrugiDeoOOP.Cetvrtak1909.Garaza;

public class Vozilo {
    private double cena;
    private int kilometraza;
    private int godinaProizvodnje;

    public Vozilo(double cena, int kilometraza, int godinaProizvodnje) {
        this.cena = cena;
        this.kilometraza = kilometraza;
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public double getCena() {
        return cena;
    }

    public int getKilometraza() {
        return kilometraza;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }
    public double izracunajCenu(){
        return cena*0.5;
    }
}
