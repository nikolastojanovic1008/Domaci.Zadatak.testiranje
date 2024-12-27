package JavaPrviDeo.PrvaNedelja.Cetvrtak2208.Petak2308;

public class zadatak1 {
    public static void main(String[] args) {
        /*
        Zadatak 1:
Napraviti promenljivu gde ce stojati vas broj godina, ukoliko imate 18 i vise godina,
ispisati poruku da imate dovoljno godina da konzumirate alkohol, u suprotnom ispisti da ste previse mladi.
         */
        int mojeGodine = 42;
        if (mojeGodine>=18){
            System.out.println("imate dovoljno godina da konzumirate alkohol");
        }
        else {
            System.out.println("Previse ste mladi za alkohol");
        }
        /*
        Zadatak 2:
Napraviti dve promenljive sa proizvoljnim brojevima, zatim izracunati njihov zbir i proizvod. Ako je proizvod veci - ispisati poruku, ako je zbir veci - ispisati poruku o tome,
 u suprotnom ispisati poruku da su brojevi jednaki.
         */
        int a = 2;
        int b = 2;
        int zbir = a + b;
        int proizvod = a * b;
        if (zbir > proizvod) {
            System.out.println(" Zbir ovih brojeva je veci");
        } else if (proizvod > zbir) {
            System.out.println("Proizvod ovih brojeva je veci");
        }else {
            System.out.println("Proizvod i zbir su jednaki");
        }
    }
}
