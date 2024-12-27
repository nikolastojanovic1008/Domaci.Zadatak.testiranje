package petak3008;

public class MetodeNove {
    public static void main(String[] args) {
        int x = 12;
        int y = 11;
        int c = -1;
        int d = 0;

        int sabiranje = sabiranje(x,y);
        int sabiranje11 = sabiranje(c,d);
        int sabiranje21 = sabiranje(1,2);

        //System.out.println(sabiranje);
       // System.out.println(sabiranje11);

        sabiranje2(1,2);
    }

    public static int sabiranje(int a, int b) {//zapis metode
        int c = a + b;
        return c;
    }
    public static void sabiranje2(int a, int b){
        int c = a + b;
        System.out.println("Rezultat sabiranja je: " + c);
    }
}
