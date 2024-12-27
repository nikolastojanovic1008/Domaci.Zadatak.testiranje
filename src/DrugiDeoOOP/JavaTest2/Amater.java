package DrugiDeoOOP.JavaTest2;

public class Amater extends Planinar{
    public Amater(double maxUspon) {
        super(maxUspon);
    }

    @Override
    public String toString() {
        return "Amater sa maksimalnim usponom od" + getMaxUspon();
    }
}
