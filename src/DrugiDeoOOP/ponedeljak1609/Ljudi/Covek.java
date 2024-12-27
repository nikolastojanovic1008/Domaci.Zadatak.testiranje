package DrugiDeoOOP.ponedeljak1609.Ljudi;

public class Covek {
    //  public static void main(String[] args) {

    String ime = "Marko"; //ovo je jedan atribut klase
    String prezime = "Tomin";

    int jmbg = 12345;
    int godinaRodjenja = 1998;

    public Covek(String ime, String prezime, int jmbg, int godinaRodjenja) { //konstruktor je metoda bey povratnog tipa,
        // uloga konstruktora je da dodeljuje vrednosti atributima
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg=jmbg;
        this.godinaRodjenja=godinaRodjenja;
    }


    //metode unutar neke klase opisuju ponasanje tog objekta
    public void pozdraviSe() {
        System.out.println("Cao! Moje ime je: " + ime);
    }

    public int izracunajGodine() {
       // int x = 2024 - godinaRodjenja;
        return 2024-godinaRodjenja;
    }

    //toString() metod vraca string reprezentaciju nekog objekta
    //pozvan je to defaultu
    public String toString() {
        return "[" + ime + " " + prezime + " " + jmbg + " " + godinaRodjenja + "]";
    }
}

