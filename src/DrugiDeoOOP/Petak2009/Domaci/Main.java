package DrugiDeoOOP.Petak2009.Domaci;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Knjiga> knjige = new ArrayList<>();
        Knjiga knjiga1 = new Knjiga("Leto", 350, 1995);
        Knjiga knjiga2 = new Knjiga("Prolece", 550, 1990);
        Knjiga knjiga3 = new Knjiga("Zima", 35, 1991);
        Knjiga knjiga4 = new Knjiga("Jesen", 55, 1993);
        knjige.add(knjiga1);
        knjige.add(knjiga2);
        knjige.add(knjiga3);
        knjige.add(knjiga4);

        Romanopisac romanopisac = new Romanopisac("Milan Nikolic", 1978, knjige);
        System.out.println(romanopisac.dugometrazniRoman());
        System.out.println(romanopisac.najpoznatijaKnjiga());
        System.out.println("Razlika između prve i poslednje knjige je " + romanopisac.vremePisanja() + " godina.");

        Eseista eseista = new Eseista("Jovan Jovanovic", 1980, knjige);
        System.out.println(eseista.vremePisanja());
        System.out.println(eseista.najpoznatijaKnjiga());
        System.out.println("Kratki eseji: " + eseista.kratkiEseji());
        Pesnik pesnik = new Pesnik("Jovan Misic", 1971, knjige);
        System.out.println("Broj zbirki: " + pesnik.brojZbirki());
        System.out.println(eseista.vremePisanja());
        System.out.println(eseista.najpoznatijaKnjiga());

    }
}
