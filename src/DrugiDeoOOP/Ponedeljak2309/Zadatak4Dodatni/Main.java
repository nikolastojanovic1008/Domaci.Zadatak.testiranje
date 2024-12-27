package DrugiDeoOOP.Ponedeljak2309.Zadatak4Dodatni;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        Napraviti klasu Aplikacija koja od atributa ima naziv, broj korisnika i ukupno vremena provedeno na toj aplikaciji.
Klasa Aplikacija ima metode:
-zarada() -> zaradjuje 10 po korisniku
Napraviti klasu Telefon koji kao atribut ima naziv i listu aplikacija. Napraviti metodu:
- najkoriscenija() -> vraca aplikaciju koja se najvise koristi
- netWorth() -> vraca ukupnu zaradu svih aplikacija koje telefon ima
- delete(Aplikacija a) -> brise aplikaciju iz liste
Napraviti klasu Android koji nasledjuje klasu Telefon.
Napraviti klasu IPhone koji nasledjuje klasu Telefon i on najvise koristi aplikaciju koja najvise zaradjuje.
         */

        Aplikacija fb = new Aplikacija("Facebook", 500, 1500);
        Aplikacija ig = new Aplikacija("Instagram", 1400, 1200);
        Aplikacija yt = new Aplikacija("YouTube", 600, 1800);
        Aplikacija tt = new Aplikacija("TikTok", 1000, 2000);
        Aplikacija x = new Aplikacija("X", 1100, 1700);
        ArrayList<Aplikacija> listaAplikacija = new ArrayList<>();
        listaAplikacija.add(fb);
        listaAplikacija.add(ig);
        listaAplikacija.add(yt);
        listaAplikacija.add(tt);
        listaAplikacija.add(x);

        Android android = new Android("Samsung", listaAplikacija);
        IPhone iphone = new IPhone("iPhone 13", listaAplikacija);

        //System.out.println("Najkorišćenija aplikacija na Androidu: " + android.najkoriscenija().getIme());
        //System.out.println("Ukupna zarada aplikacija na Androidu: " + android.netWorth());

        //System.out.println("Najviše zaradjuje na iPhone-u: " + iphone.najkoriscenija().getIme());
        //System.out.println("Ukupna zarada aplikacija na iPhone-u: " + iphone.netWorth());
        android.delete(ig);
        System.out.println(listaAplikacija);
    }
}
