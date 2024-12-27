package DrugiDeoOOP.Cetvrtak1909.Zadatak1;

public class Instagram extends DrustvenaMreza {
    public Instagram(int brojKorisnika, int brojReklama) {
        super(brojKorisnika, brojReklama);
    }

    @Override
    public void zarada() {
        int zaradaDrustveneMreze = (getBrojKorisnika() * 1) + (getBrojReklama() * 10);
        System.out.println("Zarada drustvene mreze je: " + zaradaDrustveneMreze);

    }
}
