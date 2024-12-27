package DrugiDeoOOP.Ponedeljak2309.Zadatak1;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        Zadatak 1:
Napraviti klasu Nekretnina koja ima kao atribut kvadraturu, cena po kvadratu i listu ponuda.
Napraviti metode:
- najvecaPonuda() -> vraca najvecu ponudu iz liste
- cena() -> vraca cenu nekretnine, ukoliko ima vise od 100 kvadrata, na ukupnu svotu dati popust od 15%
Napraviti klasu Stan koji nasledjuje klasu Nekretnina.
Napraviti klasu Kuca koji nasledjuje klasu Nekretnina i on daje popust od 20% ukoliko je kuca veca od 200 kvadrata.
Napraviti klasu Lokal nasledjuje klasu Nekretnina i on daje popust od 25% ukoliko je kuca veca od 250 kvadrata.
         */
        ArrayList<Double> ponude = new ArrayList<>();
        ponude.add(100000.0);
        ponude.add(20000.0);
        ponude.add(500.0);

        Nekretnina n1 = new Lokal(260, 1000, ponude);
        Nekretnina n2 = new Kuca(350, 1000, ponude);
        System.out.println(n2.cena());
    }


}
