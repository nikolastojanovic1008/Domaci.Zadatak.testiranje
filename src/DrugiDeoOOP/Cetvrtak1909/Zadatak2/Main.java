package DrugiDeoOOP.Cetvrtak1909.Zadatak2;

public class Main {
    public static void main(String[] args) {
        Glumac k = new Glumac(1950, "Milan Milanović");
        Film akcija = new AkcioniFilm(1987, 1000, k);
        System.out.println(akcija.godineGlavnogGlumca());
        System.out.println(akcija.troskovi());
        //System.out.println(akcija);

        Film horor = new Horor(1998,1000, k);
        System.out.println(horor.godineGlavnogGlumca());
        System.out.println(horor.troskovi());

        Film romantika = new Romantika(1991,1000,k);
        System.out.println(romantika.godineGlavnogGlumca());
        System.out.println(romantika.troskovi());
    }
}
