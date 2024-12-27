package ponedeljak2608;

public class vezba4 {
    public static void main(String[] args) {
      /*  Zadatak 4(for):
        Istampati 10 parnih brojeva.*/


        for (int i=1; i<=20; i++){
            if (i%2==0){
                System.out.println("Parni brojevi : "+i);

}
        }
        /*
        Zadatak 5(for):
Istampati sve brojeve 1-20 koji su deljivi sa 2 i 3.
         */
        for (int i=1; i<21; i++){
            if (i%2==0 && i%3==0){
                System.out.println("brojevi koji su deljivi sa 2 i 3 su sledeci: " + i);
            }
        }
        /*

         */
    }
}
