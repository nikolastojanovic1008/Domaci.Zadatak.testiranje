package ponedeljak0209;

public class zadatak4 {
    public static void main(String[] args) {
        /*
        Zadatak 4:
Napraviti metodu koja prima niz Stringova i vraca najduzi String iz niza.
         */
        String[] nizStringova = {"Avion", "Vozilo", "slon", "Pas"};
        metoda(nizStringova);
    }

    public static void metoda(String[] nizStringova) {
        String rezultat = nizStringova[0];
        for (int i = 0; i < nizStringova.length; i++) {
            if (nizStringova[i].length() > rezultat.length()) {
                rezultat = nizStringova[i];
            }
        }
        System.out.println(rezultat);

    }
}
