package DrugiDeoOOP.utorak1709.Zadatak2;

public class Main {
    public static void main(String[] args) {
        Radnik Milivoje = new Radnik(101, 2017, 50000);
        Radnik Milan = new Radnik(102, 2000, 100000);

        System.out.println("Godine radnog staza " + Milivoje.staz());
        Milivoje.novaPlata();
        System.out.println(Milivoje);
        System.out.println("Godine radnog staza " + Milan.staz());
        Milan.novaPlata();
        System.out.println(Milan);

    }
}
