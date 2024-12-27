package Dopunskicas;

public class zadatak3 {
    public static void main(String[] args) {
        /*
        Zadatak 3:
Napraviti niz imena i proveriti Koliko se puta svako ime iz prvog niza nalazi u drugom nizu.
         */
        String[] niz1 = {"Marko", "Nikola", "Jelena"};
        String[] niz2 = {"Marko", "Nikola", "Marko", "Stefan", "Milica"};
        nalaziSe(niz1, niz2);
    }

    public static void nalaziSe(String[] niz1, String[] niz2) {
        for (int i = 0; i < niz1.length; i++) {
            String trenutnoIme = niz1[i];
            int brojac = 0;
            for (int j = 0; j < niz2.length; j++) {
                if (trenutnoIme.equalsIgnoreCase(niz2[j])) {
                    brojac++;
                }
            }
            System.out.println("Ime " + trenutnoIme + " se nalazi ovoliko puta  " + brojac);
        }

    }
}
