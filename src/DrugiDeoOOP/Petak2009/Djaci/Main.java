package DrugiDeoOOP.Petak2009.Djaci;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listaOcena = new ArrayList<>();
        listaOcena.add(5);
        listaOcena.add(2);
        listaOcena.add(1);
        listaOcena.add(3);
        listaOcena.add(1);
        listaOcena.add(1);

        Ucenik a = new Osnovac("Nikola", 1000, listaOcena, 8);
        Ucenik b = new Srednjoskolac("Marko", 1000, listaOcena, 11);
        Ucenik c = new Student("Slobodan", 1000, listaOcena, 7);
        System.out.println(b.zaUkor());
        System.out.println(c.cenaSkolovanja());
    }
}
