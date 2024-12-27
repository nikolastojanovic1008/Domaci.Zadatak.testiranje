package DrugiDeoOOP.ponedeljak1609.prodavnica;

import java.util.ArrayList;

public class Korpa {
    ArrayList<Namirnica> lista;

    public Korpa(ArrayList<Namirnica> lista) {
        this.lista = lista;
    }

    public String toString() {
        return lista + " ";
    }

    public double ukupnaCena() {
        double racun = 0;
        //  for (int n=0; n< lista.size(); n++){
        //      racun += n.cena;
        //  }
        for (Namirnica n : lista) {
            racun += n.cena;
        }
        return racun;
    }
}
