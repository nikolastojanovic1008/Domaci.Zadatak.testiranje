package JavaTest1;

public class Zadatak2 {
    public static void main(String[] args) {
        /*
        Zadatak 2:
Napraviti metodu koja prihvata niz String-ova i neki String, vraca nam true ako se taj String nalazi u nizu.
         */
        String[] nizStringova = {"jedan", "dva", "tri", "pet"};
        String rec = "tri";
        provera(nizStringova, rec);

    }

    public static boolean provera(String[] nizStringova, String rec) {
        boolean b = false;
        for (int i = 0; i < nizStringova.length; i++) {
            if (nizStringova[i].trim().equalsIgnoreCase(rec.trim())) {
                b = true;
                break;
            }
        }
        if (b) {
            System.out.println("Tu je u nizu");
        } else {
            System.out.println("NIJE tu!");
        }
        return b;

    }
}
