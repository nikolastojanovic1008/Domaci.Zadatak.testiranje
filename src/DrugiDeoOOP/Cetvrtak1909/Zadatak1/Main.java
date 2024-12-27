package DrugiDeoOOP.Cetvrtak1909.Zadatak1;

public class Main {
    public static void main(String[] args) {
        DrustvenaMreza jedan = new DrustvenaMreza(250, 300);
        System.out.println(jedan);
        jedan.zarada();
        jedan.upozorenje();
        DrustvenaMreza tikTok = new TikTok(550, 1000);
        System.out.println(tikTok);
        tikTok.upozorenje();
        tikTok.zarada();

        DrustvenaMreza fejs = new Facebook(150, 356);
        System.out.println(fejs);
        fejs.upozorenje();
        fejs.zarada();

        DrustvenaMreza insta = new Instagram(300, 1000);
        System.out.println(insta);
        insta.upozorenje();
        insta.zarada();

    }
}
