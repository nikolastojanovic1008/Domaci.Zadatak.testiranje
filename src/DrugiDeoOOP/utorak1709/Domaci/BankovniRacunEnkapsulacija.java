package DrugiDeoOOP.utorak1709.Domaci;

public class BankovniRacunEnkapsulacija {
    private int jedinstveniBroj;
    private String ime;
    private double trenutnoStanje;

    public BankovniRacunEnkapsulacija(int jedinstveniBroj, String ime, double trenutnoStanje) {
        this.jedinstveniBroj = jedinstveniBroj;
        this.ime = ime;
        this.trenutnoStanje = trenutnoStanje;
    }

    public String toString() {
        return "Jedinstveni broj računa: " + jedinstveniBroj + "\n" +
                "Ime vlasnika računa: " + ime + "\n" +
                "Trenutno stanje na Vašem računu: " + trenutnoStanje;
    }

    public int getJedinstveniBroj() {
        return jedinstveniBroj;
    }

    public void setJedinstveniBroj(int jedinstveniBroj) {
        this.jedinstveniBroj = jedinstveniBroj;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getTrenutnoStanje() {
        return trenutnoStanje;
    }

    public void setTrenutnoStanje(double trenutnoStanje) {
        this.trenutnoStanje = trenutnoStanje;
    }

    public void uplata(double svotaUplata) {
        if (svotaUplata > 0) {
            setTrenutnoStanje(getTrenutnoStanje() + svotaUplata);
        } else {
            System.out.println("Druže ne možeš da uplatiš negativni iznos");
        }
    }

    public void isplata(double svotaIsplata) {
        if (svotaIsplata > 0) {
            if (getTrenutnoStanje() >= svotaIsplata) {
                setTrenutnoStanje(getTrenutnoStanje() - svotaIsplata);
            } else {
                System.out.println("Ne možete isplatiti više nego što imate!");
            }
        } else {
            System.out.println("Ne možete isplatiti negativnu sumu!");
        }
    }
}
