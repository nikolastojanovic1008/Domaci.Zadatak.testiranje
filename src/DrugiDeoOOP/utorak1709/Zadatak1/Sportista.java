package DrugiDeoOOP.utorak1709.Zadatak1;

public class Sportista {
    /*
    Zadatak 1:
Napraviti klasu Sportista koji od atributa ima ime, broj nagrada i godinu rodjenja.
Napraviti metodu:
- penzija(int potrebnoNagrada) -> ova metoda prima kao argument neki potreban broj nagrada da bi
sportista otisao u penziju
- veteran() -> metoda ispisuje poruku o tome da li je ovaj sportista veteran, tj stariji od 40 godina
Napraviti adekvatan konstruktor, get i set metod, kao i toString.
     */
    private String ime;
    private int brojNagrada;
    private int godinaRodjenja;

    public Sportista(String ime, int brojNagrada, int godinaRodjenja) {
        this.ime = ime;
        this.brojNagrada = brojNagrada;
        this.godinaRodjenja = godinaRodjenja;
    }

    public String toString() {
        return ime + " " + brojNagrada + " " + godinaRodjenja;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String novoIme) {
        this.ime = novoIme;
    }

    public int getBrojNagrada() {
        return brojNagrada;
    }

    public void setBrojNagrada(int brojNagrada) {
        this.brojNagrada = brojNagrada;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }

    public void penzija(int granica) {
        if (getBrojNagrada() >= granica) {
            System.out.println("Imate dovoljan broj nagrada!");
        } else {
            System.out.println("Nemate dovoljan broj nagrada!");
        }
    }

    public void veteran() {
        if (2024 - getGodinaRodjenja() > 40) {
            System.out.println("Sportista je veteran");
        } else {
            System.out.println("Sportista nije veteran!");
        }
    }

}
