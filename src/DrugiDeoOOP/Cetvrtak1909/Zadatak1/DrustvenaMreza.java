package DrugiDeoOOP.Cetvrtak1909.Zadatak1;

public class DrustvenaMreza {
    /*
    Zadatak 1:
Napraviti klasu DrustvenaMreza koja od atributa ima broj korisnika i broj reklama.
Napraviti metodu:
- zarada() -> racuna zaradu za drustvene mreze ako zaradjuje 2 po korisniku a 5 po reklami.
- upozorenje() -> ispisuje poruku o upozorenju ukoliko drustvena mreza nema dovoljno korisnika (manje od 200)
Napraviti klasu Facebook koji nasledjuje klasu DrustvenaMreza.
Napraviti klasu Instagram koji nasledjuje klasu DrustvenaMreza I on zaradjuje 1 po korisniku I 10 po reklami.
Napraviti klasu TikTok koji nasledjuje klasu DrustvenaMreza I on ispisuje upozorenje ukoliko ima manje od 500 korisnika.
     */
    private int brojKorisnika;
    private int brojReklama;

    public DrustvenaMreza(int brojKorisnika, int brojReklama) {
        this.brojKorisnika = brojKorisnika;
        this.brojReklama = brojReklama;
    }

    public int getBrojKorisnika() {
        return brojKorisnika;
    }

    public void setBrojKorisnika(int brojKorisnika) {
        this.brojKorisnika = brojKorisnika;
    }

    public int getBrojReklama() {
        return brojReklama;
    }

    public void setBrojReklama(int brojReklama) {
        this.brojReklama = brojReklama;
    }

    @Override
    public String toString() {
        return
                "brojKorisnika=" + brojKorisnika +
                ", brojReklama=" + brojReklama;

    }

    public void zarada() {
        int zaradaDrustveneMreze = (getBrojKorisnika() * 2) + (getBrojReklama() * 5);
        System.out.println("Zarada drustvene mreze je: " + zaradaDrustveneMreze);
    }
    public void upozorenje(){
        if (getBrojKorisnika()<200){
            System.out.println("Broj korisnika je manji od 200!");
        }
    }
}
