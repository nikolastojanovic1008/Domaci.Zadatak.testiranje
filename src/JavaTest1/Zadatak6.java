package JavaTest1;

public class Zadatak6 {
    public static void main(String[] args) {
        /*
        Zadatak 6:
Napraviti metodu koja prima 3 niza String-ova i ispisuje nam poruku koji je od ta 3 niza najveci.
         */
        String[] niz1 = {"jedan", "dva"};
        String[] niz2 = {"tri", "dva"};
        String[] niz3 = {"Jedan ali vredan", "dva", "Jedan"};
        najduziNiz(niz1, niz2, niz3);
    }

    public static void najduziNiz(String[] niz1, String[] niz2, String[] niz3) {
        if (niz1.length > niz2.length && niz1.length > niz3.length) {
            System.out.println("Prvi niz je najduzi");
        } else if (niz2.length > niz1.length && niz2.length > niz3.length) {
            System.out.println("Drugi niz je najduzi");
        } else if (niz3.length > niz1.length && niz3.length > niz2.length) {
            System.out.println("Treci niz je najduzi");
        } else if (niz2.length == niz1.length && niz1.length == niz3.length) {
            System.out.println("Sva tri niza su jednaka");
        }
    }
}
