package DrugiDeoOOP.Cetvrtak1909.Garaza;

public class Main {
    public static void main(String[] args) {
        Brod b = new Brod(100, 1000, 1955, 45);
        Auto c = new Auto(100, 300, 1945);
        System.out.println(b.izracunajCenu());
        System.out.println(c.izracunajCenu());
        Vozilo brod = new Brod(100,1000,1978,67);
    }
}
