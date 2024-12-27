package utorak2708;

public class zadatak3 {
    public static void main(String[] args) {
        /*
        Zadatak 3:
a)Stampati brojeve od 1 do 40 osim onih koji su deljivi sa 6.
b)Stampati brojeve od 1 do 100, ukoliko naidjete na 78 zaustaviti rad.
         */
/*        int i = 1;
        while (i<=40){
            if (i%6==0){
                i++;
                continue;
            }
            System.out.println("broj koji nije deljiv sa 6 :" + i);
            i++;

        }
   */     int a = 1;
        while (a<=100){
            if (a==78){
                break;
            }
            System.out.println("Brojevi do granice gde izlazi program :" + a);
            a++;
        }
        System.out.println("Ovde program prestaje sa radom!");
    }
}
