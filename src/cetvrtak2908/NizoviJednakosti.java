package cetvrtak2908;

public class NizoviJednakosti {
    public static void main(String[] args) {
        int niz1[] = {1, 2, 3, 4};
        int niz2[] = {1, 2, 3, 4};
        boolean b = true;

        if (niz1.length == niz2.length) {
            for (int i = 0; i < niz2.length; i++) {
                if (niz1[i] == niz2[i]) {
                    continue;
                } else {
                    b = false;
                    break;
                }
            }
        } else {
            b = false;
        }
        if (b) {
            System.out.println("Nizovi su jednaki");
        } else {
            System.out.println("Nizovi NISU jednaki");
        }
    }
}
