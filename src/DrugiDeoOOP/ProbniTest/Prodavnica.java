package DrugiDeoOOP.ProbniTest;

import java.util.ArrayList;

public class Prodavnica {
    /*
    Napraviti klasu Prodavnica koja od atributa ima broj zaposlenih I listu artikala.
Napraviti metode:
-blackFriday() -> sve artikle iz liste spusta za 50%
-pronadji(String a) -> trazi prosledjeni naziv u listi artikala
-triftKolekcija() -> vraca listu artikala koji su stariji od 20 godina
-ukupnaZarada() -> racuna Koliko prodavnica zaradjuje kada proda sve artikle, uz to da svakog zaposlenog placaju 100
-izbaciPrestaro() -> izbacuje iz liste sve artikle koji su stariji od 30 god
     */
    private int brojZaposlenih;
    private ArrayList<Artikl> artikli;

    public Prodavnica(int brojZaposlenih, ArrayList<Artikl> artikli) {
        this.brojZaposlenih = brojZaposlenih;
        this.artikli = artikli;
    }

    public void blackFriday() {
        for (Artikl artikl : artikli) {
            artikl.setCena(artikl.getCena() / 2);
        }
    }

    public Artikl pronadji(String a) {
        for (Artikl artikl : artikli) {
            if (artikl.getNaziv().equalsIgnoreCase(a)) {
                return artikl;
            }
        }
        return null;
    }

    public ArrayList<Artikl> triftKolekcija() {
        ArrayList<Artikl> starijiOd20 = new ArrayList<>();
        int trenutnaGodina = 2024;
        for (Artikl artikl : artikli) {
            if (trenutnaGodina - artikl.getGodinaProizvodnje() > 20) {
                starijiOd20.add(artikl);
            }
        }
        return starijiOd20;
    }

    public  double ukupnaZarada() {
        double zarada = 0;
        for (Artikl artikl : artikli) {
            zarada += artikl.getCena();
        }
        zarada = zarada - (getBrojZaposlenih() * 100);
        return zarada;
    }

    /*
    public void izbaci1() {
        ArrayList<Ucenik> lista = new ArrayList<>();
        for (Ucenik ucenik : getUcenici()) {
            if (ucenik.prosek() >= 1.5) {
                lista.add(ucenik);
            }
        }
        setUcenici(lista);
    }
     */
    public void izbaciPrestaro() {
        int trenutnaGodina = 2024;
        ArrayList<Artikl> novaLista = new ArrayList<>();
        for (Artikl artikl : artikli) {
            if (trenutnaGodina - artikl.getGodinaProizvodnje() < 30) {
                novaLista.add(artikl);
            }
        }
        setArtikli(novaLista);
    }

    public int getBrojZaposlenih() {
        return brojZaposlenih;
    }

    public void setBrojZaposlenih(int brojZaposlenih) {
        this.brojZaposlenih = brojZaposlenih;
    }

    public ArrayList<Artikl> getArtikli() {
        return artikli;
    }

    public void setArtikli(ArrayList<Artikl> artikli) {
        this.artikli = artikli;
    }

    @Override
    public String toString() {
        return "Prodavnica{" +
                "brojZaposlenih=" + brojZaposlenih +
                ", artikli=" + artikli +
                '}';
    }
}
