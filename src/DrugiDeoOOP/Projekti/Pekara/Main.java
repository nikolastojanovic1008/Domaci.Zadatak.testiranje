package DrugiDeoOOP.Projekti.Pekara;

public class Main {
    public static void main(String[] args) {
        Burek b = new Burek(250, 180, 500);
        System.out.println(b);
        Kroasan k = new Kroasan(120, 300);
        System.out.println(k);

        System.out.println("Fil po zelji...");
        b.filuj("sir");
        System.out.println(b);

        System.out.println("Dolaze musterije...");
        b.smazi();
        System.out.println(b);
        k.zvakni();
        System.out.println(k);
    }
}
