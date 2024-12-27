package ponedeljak0209;

public class zadatak3 {
    public static void main(String[] args) {
        /*
        Zadatak 3:
Napraviti metodu koja prima neki niz brojeva i racuna sumu svih parnih brojeva
         */
        int[] nizBrojeva = {1, 2, 3, 4, 5, 6, 7, 8,10};
        int sumaParnih = suma(nizBrojeva);
        System.out.println(sumaParnih);
    }

    public static int suma(int[] nizBrojeva) {
        int sumaparnih = 0;
        for (int i = 0; i < nizBrojeva.length; i++) {
            if (nizBrojeva[i] % 2 == 0) {
                sumaparnih += nizBrojeva[i];
            }
        }
        return sumaparnih;
    }
}
