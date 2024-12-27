package DrugiDeoOOP.Projekti.Mesara;

public class Main {
    public static void main(String[] args) {
        /*
         * Napraviti klasu "Preradjevina", sa privatnim poljima "tezina" (u kilogramima), "cena" (u dinarima), i
         * "lager" (stanje na lageru), konstruktorom, potrebnim set/get metodima i metodom "toString".
         *
         * Klasa "Pasteta" treba da nasledi klasu "Preradjevina", da ima dodatna polja "vrsta" (npr. jetrena, riblja
         * i sl.) i "konzervisana" (da li je pakovana u trajnu konzervu ili nije), svoj konstruktor i metode
         * "konzervisi" (pasteta po definiciji nije konzervisana, ovaj metod joj menja stanje, a uz to povecava
         * cenu za 10%) i "smazi" (smanjuje kolicinu pastete na lageru za 300 grama - toliko je dobar da
         * svaka musterija kupi bar toliko, ukoliko je moguce, inace se prazni lager do vrednosti 0).
         * Metod "toString" treba redefinisati da obuhvati sve informacije koje imamo o pasteti.
         *
         * Klasa "Kobasica" treba da nasledi klasu "Preradjevina", da ima dodatno polje "dimljena" (da li je
         * kobasica dimljena ili nije), svoj konstruktor i metode "odimi" (kobasica u startu nije dimljena,
         * ovaj metod joj menja stanje, a uz to joj udvostrucava cenu) i metod "gricni" (smanjuje kolicinu
         * kobasice na lageru za zadatu gramazu, ukoliko je moguce, inace prazni lager do vrednosti 0).
         * Metod "toString" ponovo treba redefinisati (sada da obuhvati sve informacije koje imamo o kobasici).
         *
         * Konacno, realizovati klasu "Kulen" koja nasledjuje "Kobasica". Za kulen se zna da je dimljen,
         * a tezina, cena i kolicina na lageru se odredjuju svakodnevno pri proizvodnji. U ovoj klasi treba
         * realizovati specifican metod "gricni" u kom se smanjuje lager za duplo vise od zadate kolicine
         * (musterije se tesko obuzdavaju kad je ova vrsta kobasice u pitanju).
         *
         * U klasi za testiranje, pod nazivom "Mesara", treba napraviti po 20 kg pastete i kulena, potom
         * konzervisati pastetu, a onda i malo "pojesti" i jednog i drugog proizvoda, uz ispis stanja nakon
         * svake izmene.
         */
        Pasteta p = new Pasteta(0.15, 50, 20.0, "jetrena");
        System.out.println(p);
        Kulen k = new Kulen(1.2, 400, 20.0);
        System.out.println(k);

        System.out.println("Konzervisanje...");
        p.konzervisi();
        System.out.println(p);

        System.out.println("Dolaze musterije...");
        p.smazi();
        System.out.println(p);
        k.gricni(0.2);
        System.out.println(k);
    }
}
