package DrugiDeoOOP.Petak2009.Bolnica;

public class Main {
    public static void main(String[] args) {
        Doktor o = new Oftalmolog("Milan", 10, 1990);
        Doktor d = new Pedijatar("Petar", 10, 1990);
        Doktor p = new Hirurg("Nikola", 10, 1985);
        System.out.println(d.godineStaza());
        System.out.println(p.plata());
    }
}
