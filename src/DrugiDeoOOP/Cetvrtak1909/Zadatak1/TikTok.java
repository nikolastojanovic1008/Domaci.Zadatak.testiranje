package DrugiDeoOOP.Cetvrtak1909.Zadatak1;

public class TikTok extends DrustvenaMreza {
    public TikTok(int brojKorisnika, int brojReklama) {
        super(brojKorisnika, brojReklama);
    }

    @Override
    public void upozorenje() {
        if (getBrojKorisnika() < 500) {
            System.out.println("Broj korisnika je manji od 500!");
        }
    }
}
