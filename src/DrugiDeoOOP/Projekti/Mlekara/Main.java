package DrugiDeoOOP.Projekti.Mlekara;

public class Main {
    public static void main(String[] args) {
        /*
         * Napraviti klasu "MlecniProizvod", sa privatnim poljima "tezina" (u gramima), "cena" (u dinarima),
         * "mm" (procenat mlecne masti) i "lager" (stanje na lageru), konstruktorom, potrebnim set/get
         * metodima i metodom "toString".
         *
         * Klasa "Sir" treba da nasledi klasu "MlecniProizvod", da ima dodatno polje "dimljeni" (da li je sir
         * dimljen ili nije), svoj konstruktor i metode "odimi" (sir u startu nije dimljen, ovaj metod mu menja
         * stanje, a uz to povecava cenu za 30%) i "gricni" (smanjuje kolicinu sira na lageru za zadatu
         * gramazu, ukoliko je moguce, inace prazni lager do vrednosti 0). Metod "toString" treba redefinisati
         * da obuhvati sve informacije koje imamo o siru.
         *
         * Klasa "Jogurt" treba da nasledi klasu "MlecniProizvod", da ima polje "dodatak" (npr. voce, probiotici
         * i sl.), svoj konstruktor i metod "gucni" (smanjuje kolicinu jogurta na lageru za zadatu gramazu,
         * ukoliko je moguce, inace prazni lager do vrednosti 0).  Metod "toString" ponovo treba redefinisati
         * (sada da obuhvati sve informacije koje imamo o jogurtu).
         *
         * Konacno, realizovati klasu "VocniJogurt" koja nasledjuje "Jogurt". Za vocni jogurt se zna da se
         * isporucuje u pakovanjima od 200 g, da sadrzi svega 0.1% mlecne masti, a cena, kolicina na lageru
         * i dodatak (neko voce) se odredjuju svakodnevno. U ovoj klasi stoga treba realizovati specifican
         * metod "gucni" (bez parametara), u kom se smanjuje lager vocnog jogurta za 200 g (pozivom
         * metoda natklase).
         *
         * U klasi za testiranje, pod nazivom "Mlekara", treba napraviti po 10 kg sira i vocnog jogurta, potom
         * odimiti sir, a onda i malo "pojesti/popiti" i jednog i drugog proizvoda, uz ispis stanja nakon svake
         * izmene.
         */
        Sir s = new Sir(1000, 450, 45, 10000);
        System.out.println(s + "\n");
        VocniJogurt vj = new VocniJogurt(50, 10000, "kajsija");
        System.out.println(vj + "\n");

        System.out.println("Dimljenje sira...");
        s.odimi();
        System.out.println(s + "\n");

        System.out.println("Dolaze musterije...");
        s.gricni(500);
        System.out.println(s + "\n");
        vj.gucni();
        System.out.println(vj);
    }
}
