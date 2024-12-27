package vezbanje2;

public class dodatnizadatak2a {
    public static void main(String[] args) {

        String[] niz = {"pas", "macka", "slon", "zirafa", "hrcak"};
        String rec = "Pas";
        boolean tuJe = false; //ova promenljiva ce biti true ako se nasa rec nalazi u nizu, krecemo od toga da se ne nalazi
        for (int i = 0; i < niz.length; i++) {
            if (niz[i].equalsIgnoreCase(rec)) {
                tuJe = true; // cim naidjemo prvi put na tu rec iz niza podesavamo promenljivu na true
                break; // izlazimo kako ne bi dalje proveravali da li se nalazi u nizu
            }
        }
        if (tuJe) { // proveravamo da li je promenljiva true ili false,
            System.out.println("Rec se nalazi u nizu.");
        } else {
            System.out.println("Rec se ne nalazi u nizu.");
        }
    }
}