package DrugiDeoOOP.Ponedeljak2309.Zadatak2;

public class Main {
    public static void main(String[] args) {
        /*
        Zadatak 2:
Napraviti klasu Stavka koja ima od atributa naziv i cenu.
Napraviti klasu KreditnaKartica koja od atributa ima stanje na racunu.
Napraviti klasu Korpa koji ima od atributa jednu stavku i kreditnu karticu.
Napraviti metode:
- plati() -> skida pare sa kreditne kartice u iznosu od cene stavke, ukoliko nema dovoljno, ispisati poruku.
- viseStavki() -> vraca nam Koliko puta mozemo da kupimo tu stavku sa parama koje imamo
OnlineKorpa nasledjuje klasu Korpa i on prilikom placanja daje popust od 10%.
FizickaKorpa nasledjuje klasu Korpa.
         */
        Stavka s = new Stavka("TV", 1000);
        KreditnaKartica k = new KreditnaKartica(2000);
        Korpa k1 = new OnlineKorpa(s, k);
        System.out.println("Koliko puta mozemo da kupimo stavku:" + k1.viseStavki());


        k1.plati();
        System.out.println(k1);


    }
}
