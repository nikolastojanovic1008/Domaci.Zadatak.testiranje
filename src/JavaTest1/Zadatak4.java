package JavaTest1;

public class Zadatak4 {
    public static void main(String[] args) {
        /*
        Zadatak 4(xo):
Napraviti metodu koja prima niz karaktera(sastoje se samo od x i o), vraca nam karakter koji se
nalazi uzastopno 3 puta za redom.
Primer:
{x,o,o,x,o,o,o,x,x} -> o je pobednik!
         */
        char[] niz = {'o', 'o', 'x', 'x', 'x', 'o', 'o', 'x'};
        char rezultat = nadjiTrostrukikarakter(niz);
        if (rezultat != '\0') {
            System.out.println("Karakter koji se pojavljuje tri puta uzastopno je: " + rezultat);
        } else {
            System.out.println("Nema karaktera koji se pojavljuje 3 puta uzastopno!");
        }
        //System.out.println(rezultat);
    }

    public static char nadjiTrostrukikarakter(char[] niz) {
        for (int i = 0; i < niz.length - 2; i++) {

            if ((niz[i] == niz[i + 1] && niz[i] == niz[i + 2])) {
                return niz[i];
            }
        }
        return '\0';
    }
}
