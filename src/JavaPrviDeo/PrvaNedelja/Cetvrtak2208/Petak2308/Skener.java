package JavaPrviDeo.PrvaNedelja.Cetvrtak2208.Petak2308;

import java.util.Scanner;

public class Skener {
    public static void main(String[] args) {
        Scanner skener = new Scanner(System.in); // kreiramo nov skener i povezujemo ga sa konzolom
        System.out.println("Unesite vas proizvoljan broj: ");
        int broj = skener.nextInt();
        double realanBroj = skener.nextDouble();
        boolean logicki = skener.nextBoolean();
        String tekst = skener.next();
        String tekst2 = skener.nextLine();
        System.out.println("Broj koji ste uneli je: " + broj);
    }
}
