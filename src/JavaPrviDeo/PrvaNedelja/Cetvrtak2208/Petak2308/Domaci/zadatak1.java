package JavaPrviDeo.PrvaNedelja.Cetvrtak2208.Petak2308.Domaci;

import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {
        /*
        1. Napisati program koji izracunava povrsinu i obim kruga za radijus r. (2 * r * PI)
         */
        Scanner skener = new Scanner(System.in);
        System.out.println("Unesite poluprečnik kruga: ");
        double r = skener.nextDouble();

        double povrsina = r * r * Math.PI;
        double obim = 2 * r * Math.PI;

        System.out.println("Povrsina kruga za uneti poluprečnik je: " + povrsina);
        System.out.println("Obim kruga za uneti poluprečnik je: " + obim);

    }
}
