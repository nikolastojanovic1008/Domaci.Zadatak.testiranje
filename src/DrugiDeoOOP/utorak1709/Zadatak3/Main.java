package DrugiDeoOOP.utorak1709.Zadatak3;

public class Main {
    public static void main(String[] args) {/*
    Zadatak 3:
Napraviti klasu Knjiga koja ima od atributa naziv, broj strana,godinu izdanja i cenu.
Napraviti metodu:
-popust() -> ako je duzina knjige veca od 300 strana, umanjiti za 20%
-oldTimer() -> ako je knjiga starija od 20 godina, ispisati poruku da je u pitanju stara knjiga
     */

        Knjiga a = new Knjiga("Putovanje", 310, 1999, 2000);
        Knjiga b = new Knjiga("Milostiva", 350, 2005, 1000);
        a.popust();
        a.oldTimer();
        System.out.println(a);

        Autor Neko = new Autor("Milan Mitić", 1989, 10, a);
        Neko.ranaObjava();
        Neko.zarada();
        Autor nekoDrugi = new Autor("Marko Marković", 1982, 5, b);
        b.popust();
        b.oldTimer();

        nekoDrugi.ranaObjava();
        nekoDrugi.zarada();
        System.out.println(b);
    }


}
