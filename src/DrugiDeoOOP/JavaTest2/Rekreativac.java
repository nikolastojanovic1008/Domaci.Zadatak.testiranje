package DrugiDeoOOP.JavaTest2;

public class Rekreativac extends Planinar{
    public Rekreativac(double maxUspon) {
        super(maxUspon);
    }

    @Override
    public String toString() {
        return "Rekreativac sa Maksimalnim usponom od " + getMaxUspon();
    }
}
