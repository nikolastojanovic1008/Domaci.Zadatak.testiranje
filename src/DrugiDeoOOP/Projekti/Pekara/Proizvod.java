package DrugiDeoOOP.Projekti.Pekara;

public class Proizvod {
    /*
     * Napraviti klasu "Proizvod", sa privatnim poljima "tezina" (u gramima), "cena" (u dinarima), i
     * "lager" (stanje na lageru), konstruktorom, potrebnim set/get metodima i metodom "toString".
     *
     * Klasa "Burek" treba da nasledi klasu "Proizvod", da ima dodatno polje "fil", svoj konstruktor
     * i metode "filuj" (pridruzuje neku vrednost novom polju i povecava cenu bureka za 10 dinara)
     * i "smazi" (smanjuje kolicinu bureka na lageru na 0 - toliko je dobar da prva musterija koja
     * ga kupi uzme sve sto ima). Metod "toString" treba redefinisati da obuhvati i opis fila (ako ga ima).
     *
     * Klasa "Pecivo" treba da nasledi klasu "Proizvod", da ima svoj konstruktor i metod "zvakni"
     * (smanjuje kolicinu peciva na lageru za zadatu gramazu, ukoliko je moguce, inace prazni lager
     * do vrednosti 0).
     *
     * Konacno, realizovati klasu "Kroasan" koja nasledjuje "Pecivo". Za kroasan se zna da ima 100 g,
     * a cena i kolicina na lageru se odredjuju svakodnevno. U ovoj klasi stoga treba realizovati
     * specifican metod "zvakni" (bez parametara), u kom se smanjuje lager kroasana za 100 g
     * (pozivom metoda natklase).
     *
     * U klasi za testiranje, pod nazivom "Pekara", treba napraviti po 5 kg bureka i kroasana, potom
     * odrediti s cim ce se praviti burek, a onda i malo "pojesti" i jednog i drugog proizvoda, uz ispis
     * stanja nakon svake izmene.
     */
    private int tezina;
    private double cena;
    private int lager;

    public Proizvod(int tezina, double cena, int lager) {
        this.tezina = tezina;
        this.cena = cena;
        this.lager = lager;
    }

    public int getTezina() {
        return tezina;
    }

    public void setTezina(int tezina) {
        this.tezina = tezina;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getLager() {
        return lager;
    }

    public void setLager(int lager) {
        this.lager = lager;
    }


    @Override
    public String toString() {
        return  this.getClass().getName()+ " od " + tezina + " g kosta " + cena + " dinara. Na lageru je " + lager + " g.";
    }
}
