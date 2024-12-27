package Dopunskicas;

public class zadatak1 {
    public static void main(String[] args) {
        /*
        Zadatak 1:
Nadji minimum u nizu brojeva i vratiti ga.
         */
        int[] niz = {2,3,45,6,7,8,2};
        System.out.println(Minimum(niz));

    }
    public static int Minimum(int[] niz){
        int min = niz[0];
        for (int i =1; i< niz.length;i++){
            if (min>niz[i]){
                min = niz[i];
            }
        }
        return min;
    }
}
