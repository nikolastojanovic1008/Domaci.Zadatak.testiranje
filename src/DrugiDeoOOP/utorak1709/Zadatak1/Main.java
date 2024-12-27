package DrugiDeoOOP.utorak1709.Zadatak1;

public class Main {
    public static void main(String[] args) {
        Sportista prvi = new Sportista("Nikola", 12, 1982);
        Sportista drugi = new Sportista("Petar", 15, 1990);
        System.out.println(prvi);
        prvi.penzija(10);
        prvi.veteran();
        System.out.println(drugi);
        drugi.penzija(10);
        drugi.veteran();
    }
}
