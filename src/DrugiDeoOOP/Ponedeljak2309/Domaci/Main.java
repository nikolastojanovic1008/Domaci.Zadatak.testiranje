package DrugiDeoOOP.Ponedeljak2309.Domaci;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        Napraviti klasu Igrac koja ima atribute: ime, godine iskustva, i broj postignutih poena.
Napraviti klasu Klub koja ima atribute: naziv, grad, i lista igraca (lista objekata klase Igrac).
Napraviti metode:
- najiskusnijiIgrac() -> vraca ime igrača sa najvise godina iskustva.
- ukupnoPoena() -> vraća ukupan broj poena koje su postigli svi igrači u klubu.
- vrednostTima() -> vraca vrednost tima (apstraktan metod)
Napraviti klasu KosarkaskiKlub koja nasleđuje klasu Klub, i dodati specifičnu metodu:
- sampionTima() -> vraća ime igraca koji ima više od 1000 postignutih poena.
Napraviti klasu FudbalskiKlub koja nasleđuje klasu Klub, i dodati metodu:
- najboljiStrelac() -> vraca ime igraca sa najvise postignutih golova (golove cemo interpretirati kao postignute poene).
Napraviti klasu OdbojkaškiKlub koja nasleđuje klasu Klub, i dodati metodu:
- odbrambeniAs() -> vraća ime igrača koji ima najvise poena, ali je igrao manje od 3 godine.
vrednostTima() -> za kosarkaski tim racunamo da igrac vredi 50 za svaki postignut poen,
za fudbalski tim racunamo da igrac vredi po 1000 za svaki postignut gol, dok za odbojkaski tim svaki igrac vredi 100 po poenu.
 Vrednost tima predstavlja sumu cena svih njegovih igraca (edited)
         */

        Igrac kosarkas1 = new Igrac("Nikola Jokic", 5, 1500);
        Igrac kosarkas2 = new Igrac("Luka Doncic", 3, 800);
        Igrac kosarkas3 = new Igrac("Bogdan Bogdanovic", 10, 1250);
        Igrac fudbaler1 = new Igrac("Lionel Messi", 15, 85);
        Igrac fudbaler2 = new Igrac("Cristiano Ronaldo", 17, 80);
        Igrac fudbaler3 = new Igrac("Dušan Vlahović", 5, 30);
        Igrac odbojkas1 = new Igrac("Ivan Miljkovic", 2, 500);
        Igrac odbojkas2 = new Igrac("Aleksandar Atanasijevic", 6, 600);
        Igrac odbojkas3 = new Igrac("Petar Peric", 5, 550);

        ArrayList<Igrac> kosarkasi = new ArrayList<>();
        kosarkasi.add(kosarkas1);
        kosarkasi.add(kosarkas2);
        kosarkasi.add(kosarkas3);

        ArrayList<Igrac> fudbaleri = new ArrayList<>();
        fudbaleri.add(fudbaler1);
        fudbaleri.add(fudbaler2);
        fudbaleri.add(fudbaler3);

        ArrayList<Igrac> odbojkasi = new ArrayList<>();
        odbojkasi.add(odbojkas1);
        odbojkasi.add(odbojkas2);
        odbojkasi.add(odbojkas3);

        KosarkaskiKlub kk = new KosarkaskiKlub("KK Partizan", "Beograd", kosarkasi);
        FudbalskiKlub fk = new FudbalskiKlub("FK Barcelona", "Barselona", fudbaleri);
        OdbojkaskiKlub ok = new OdbojkaskiKlub("OK Vojvodina", "Novi Sad", odbojkasi);

        System.out.println("Najiskusniji igrač u košarkaškom klubu: " + kk.najiskusnijiIgrac());
        System.out.println("Šampion tima: " + kk.sampionTima());
        System.out.println("Vrednost tima: " + kk.vrednostTima());
        System.out.println("Ukupno poena:" + kk.ukupnoPoena());

        /*System.out.println("Najiskusniji igrač u fudbalskom klubu: " + fk.najiskusnijiIgrac());
        System.out.println("Najbolji strelac: " + fk.najboljiStrelac());
        System.out.println("Vrednost tima: " + fk.vrednostTima());
        System.out.println("Ukupno poena:" + fk.ukupnoPoena());

        System.out.println("Najiskusniji igrač u odbojkaškom klubu: " + ok.najiskusnijiIgrac());
        System.out.println("Odbrambeni as: " + ok.odbrambeniAs());
        System.out.println("Vrednost tima: " + ok.vrednostTima());
        System.out.println("Ukupno poena:" + ok.ukupnoPoena());
*/
    }
}
