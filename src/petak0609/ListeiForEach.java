package petak0609;

import java.util.ArrayList;

public class ListeiForEach {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(5); //[5]
        lista.add(7); //[5,7]
        lista.add(-1); // [5,7,-1]
        lista.add(2);
        System.out.println(lista);

        // lista.get(0); // .get metoda vraca element sa pozicije i
        // lista.size(); // .size vraca koliko elemenata ima u lisyi
        // lista.isEmpty(); // .isEmpty vraca true ukoliko je lista prazna
        // lista.remove(1); // .remove brise elemet sa pozicije i
        // lista.contains(5); // .contains vraca true ukoliko se element nalazi u listi
        // lista.add(1,6); // na indeks 1 ubacuje broj 6
        //System.out.println(lista);
        for (int i = 0; i < 4; i++) {
            System.out.println(lista.get(i));
        }
        double suma = 0;
        double prosek = 0;
        for (Integer pivot : lista) { // [5,7,-1] pivot = 5
            suma += pivot;
            System.out.println(pivot);
        }
        prosek = suma / lista.size() * 1.0;
        System.out.println("Prosek je: " + prosek);
    }
}
