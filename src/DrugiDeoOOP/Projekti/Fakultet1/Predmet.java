package DrugiDeoOOP.Projekti.Fakultet1;

public class Predmet {
    private String imePredmeta;
    private int espb;
    private String profesor;

    public Predmet(String imePredmeta, int espb, String profesor) {
        this.imePredmeta = imePredmeta;
        this.espb = espb;
        this.profesor = profesor;
    }

    public String getImePredmeta() {
        return imePredmeta;
    }

    public void setImePredmeta(String imePredmeta) {
        this.imePredmeta = imePredmeta;
    }

    public int getEspb() {
        return espb;
    }

    public void setEspb(int espb) {
        this.espb = espb;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
    public String opisPredmeta() {
        return "Predmet: " + imePredmeta + ", ESPB: " + espb + ", Profesor: " + profesor;
    }

    @Override
    public String toString() {
        return "Predmet{" +
                "imePredmeta='" + imePredmeta + '\'' +
                ", espb=" + espb +
                ", profesor='" + profesor + '\'' +
                '}';
    }
}
