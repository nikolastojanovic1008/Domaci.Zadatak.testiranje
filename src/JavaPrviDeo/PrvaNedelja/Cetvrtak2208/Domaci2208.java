package JavaPrviDeo.PrvaNedelja.Cetvrtak2208;

public class Domaci2208 {
    public static void main(String[] args) {
        /*
        1. Napisati program koji računa površinu i obim pravougaonika sa zadatim dimenzijama a = 5 i b = 13 (dužine stranica).
         */
        int a = 5;
        int b = 13;
        int povrsina = a * b;
        int obim = (a * 2) + (b * 2);

        System.out.println("Površina pravougaonika čije su stranice a i b je :" + povrsina);
        System.out.println("Obim pravougaonika čije su stranice a i b je: " + obim);

        /*
        2. String s1 = "bootcamp qa" i s2 = "xx generacija" spojiti u novi string i ispisati ga u konzoli tako da sva slova budu velika.
                */
        String s1 ="bootcamp qa";
        String s2 ="xx generacija";
        String s3 = s1 + " " + s2;
        System.out.println(s3.toUpperCase());

        /*
        3. Inicijalizovati promenljive broj1 i broj2 sa proizvoljnim vrednostima, zatim ispisati rezultate njihovog zbira, proizvoda i ostatka pri deljenju.
         */
        int broj1 = 27;
        int broj2 = 5;
        int zbir = broj1 + broj2;
        int proizvod = broj1 * broj2;
        int ostatak = broj1%broj2;

        System.out.println("Zbir brojeva je: " + zbir);
        System.out.println("Proizvod brojeva je: " + proizvod);
        System.out.println("Celobrojni ostatak pri deljenju je " + ostatak);

    }
}
