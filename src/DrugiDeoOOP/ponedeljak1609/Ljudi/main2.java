package DrugiDeoOOP.ponedeljak1609.Ljudi;

public class main2 {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Audi", 200, 30000, "ljubicasta");
        Auto auto2 = new Auto("Fusion", 150, 15000, "bela");
        System.out.println(auto1);
        System.out.println(auto1.vremePredjeniPut());

        System.out.println(auto1.popustNaBoju());
        System.out.println(auto2);
    }
}
