package DrugiDeoOOP.Petak2009;

public abstract class Zivotinja {
    private String nazivZivotinja;

    public Zivotinja(String nazivZivotinja) {
        this.nazivZivotinja = nazivZivotinja;
    }
    public abstract void oglasiSe();


    public String getNazivZivotinja() {
        return nazivZivotinja;
    }

    public void setNazivZivotinja(String nazivZivotinja) {
        this.nazivZivotinja = nazivZivotinja;
    }

    @Override
    public String toString() {
        return "Zivotinja{" +
                "nazivZivotinja='" + nazivZivotinja + '\'' +
                '}';
    }

}
