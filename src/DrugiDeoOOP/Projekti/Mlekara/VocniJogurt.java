package DrugiDeoOOP.Projekti.Mlekara;

public class VocniJogurt extends Jogurt{
    VocniJogurt(double cena, int lager, String dodatak) {
        super(200, cena, 0.1, lager, dodatak);
    }

    void gucni() {
        super.gucni(200);
    }
}
