package DrugiDeoOOP.ponedeljak1609.student;

import java.util.ArrayList;

public class Student {
    /*
    Zadatak 2:
Napraviti klasu Student koji ima od atributa ime i listu ocena.
Napraviti metodu koja racuna studentov prosek.
Napraviti metodu koja proverava prosek I ukoliko je manji od 1.5 ispisati poruku da mora na popravni.
Klasa mora imati adekvatan konstruktor I toString.
     */
    String ime;
    ArrayList<Integer> listaOcena;

    public Student(String ime, ArrayList<Integer> listaOcena) {
        this.ime = ime;
        this.listaOcena = listaOcena;

    }

    public double prosek() {
        double suma = 0;

        for (int i = 0; i < listaOcena.size(); i++) {
            suma += listaOcena.get(i);

        }
        //double prosek;
        // = suma / listaOcena.size();
        return suma / listaOcena.size();
    }

    public String toString() {
        return  ime + " " + listaOcena ;
    }

    public void popravni() {
        if (prosek() < 1.5) {
            System.out.println("Morate na popravni!");
        } else {
            System.out.println("Ne morate na popravni");
        }
    }
}
