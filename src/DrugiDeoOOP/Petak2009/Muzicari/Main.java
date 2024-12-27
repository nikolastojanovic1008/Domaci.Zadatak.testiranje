package DrugiDeoOOP.Petak2009.Muzicari;

public class Main {
    public static void main(String[] args) {
        /*
        Zadatak 3:
Napraviti klasu Album koji ima kao atribute naziv, godinu objavljivanja I broj pesama.
Napraviti klasu Muzicar koji od atributa ima ime, godinu pocetka karijere I jedan album.
Napraviti metode:
- prviHit() -> ukoliko je album objavljen kad je muzicar I zapoceo karijeru, ispisati poruku da mu je to prvi hit
- zarada() -> vraca zaradu od albuma ako znamo da zaradjuje 1000 po pesmi.
Napraviti klasu RokMuzicar koji nasledjuje klasu Muzicar I on zaradjuje 750 po pesmi.
Napraviti klasu PopMuzicar koji nasledjuje klasu Muzicar.
Napraviti klasu Reper koji nasledjuje klasu Muzicar I on zaradjuje 500 po pesmi.
         */
        Album album = new Album("Leto", 1998, 10);
        Album album1 = new Album("Zima", 2000, 10);
        Muzicar a = new PopMuzicar("Nikola", 1999, album);
        Muzicar b = new RokMuzicar("Marko", 2000, album1);
        Muzicar c = new Reper("Stevan", 1998, album);

       
        System.out.println("Rok muzičar:");
        b.prviHit();
        System.out.println("Zarada: " + b.zarada());
    }
}
