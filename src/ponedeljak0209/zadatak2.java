package ponedeljak0209;

public class zadatak2 {
    public static void main(String[] args) {
        /*
        Zadatak 2:
Napraviti metodu koja prima niz String-ova i jos jedan String, vraca true ukoliko se ta rec nalazi u tom nizu.
         */
        String[] nizStringova = {"jedan", "dva", "tri", "cetiri"};
        String rec = "Jedan";
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
