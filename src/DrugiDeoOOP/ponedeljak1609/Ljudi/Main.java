package DrugiDeoOOP.ponedeljak1609.Ljudi;

public class Main {
    public static void main(String[] args) {
        Covek c = new Covek("Dejan", "Grujic", 12345, 1999);
        Covek c1 = new Covek("Marko", "Tomin", 12345, 1998);


        System.out.println("Moje ime je: " + c.ime + "  Moje prezime je: " + c.prezime);

        System.out.println(c);

        c.pozdraviSe();
        System.out.println(c.izracunajGodine());
        Auto n = new Auto("Audi", 125, 30000, "ljubicasta");


    }
}
