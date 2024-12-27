package DrugiDeoOOP.ponedeljak1609.prodavnica;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        Zadatak 3:
Napraviti klasu Namirnica koja ima naziv i cenu.
Napraviti klasu Korpa koja ima listu namernica i metodu za racunanje ukupne cene svih namernica.
Klasa mora imati adekvatan konstruktor I toString.
         */
        Namirnica n1 = new Namirnica("Hleb", 100);
        Namirnica n2 = new Namirnica("Mleko", 50);
        Namirnica n3 = new Namirnica("Brašno", 60);
        ArrayList<Namirnica> lista = new ArrayList<>();
        lista.add(n1);
        lista.add(n2);
        lista.add(n3);

        Korpa bag = new Korpa(lista);
        System.out.println(bag);
        System.out.println("Ukupna cena svih namirnica u korpi je: " + bag.ukupnaCena());

    }
}
