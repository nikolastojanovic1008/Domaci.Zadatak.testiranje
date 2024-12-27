package petak3008;

public class zadatak1 {
    public static void main(String[] args) {
        /*
        Zadatak 1:
Napraviti metodu koja prihvata neki String i vraca Koliko on ima samoglasnika.
         */
        String prvi = "prvi string";
        String drugi = "drugi string";
        String treci = "aaaaai";
        int broj = prebrojSamoglasnike(prvi);
        System.out.println("Broj samoglasnika je : " + broj);
        int broj1 = prebrojSamoglasnike(drugi);
        System.out.println("Broj samoglasnika je : " + broj1);
        int broj2 = prebrojSamoglasnike(treci);
        System.out.println("Broj samoglasnika je : " + broj2);
    }

    public static int prebrojSamoglasnike(String nekiString) {
        int rezultat = 0;
        for (int i = 0; i < nekiString.length(); i++) {
            if (nekiString.charAt(i) == 'a' || nekiString.charAt(i) == 'i' || nekiString.charAt(i) == 'e' || nekiString.charAt(i) == 'o' || nekiString.charAt(i) == 'u') {
                rezultat++;
            }
        }
        return rezultat;
    }

}
