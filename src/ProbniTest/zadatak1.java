package ProbniTest;

public class zadatak1 {
    public static void main(String[] args) {
        /*
        Zadatak 1:
Napraviti metodu koja prihvata niz String-ova i jos jedan String, vraca broj pojavljivanja tog String-a u nizu.
         */
        String[] nizStringova = {"Avion", "voz", "macka", "voz", "pas"};
        String rec = "voz";

        //System.out.println(broj(nizStringova, rec));
        stampanje(broj(nizStringova, rec));
    }

    public static int broj (String[] nizStringova, String rec) {
        int brojac = 0;
        for (int i = 0; i < nizStringova.length; i++) {
            if (nizStringova[i].equalsIgnoreCase(rec)) {
                brojac++;
            }
        }
        return brojac;
    }

    public static void stampanje(int a) {
        System.out.println("Broj pojavljivanja stringa u nizu je: " + a);
    }
}

