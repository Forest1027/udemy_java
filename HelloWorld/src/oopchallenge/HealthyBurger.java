package oopchallenge;

public class HealthyBurger extends BasicBurger {
    private Addition addition5;
    private Addition addition6;

    public HealthyBurger(double basePrice, String breadRollType, String meat) {
        super(basePrice, breadRollType, meat);
        super.setMaxAddition(6);
    }

    public Addition getAddition5() {
        return addition5;
    }

    public void setAddition5(Addition addition5) {
        this.addition5 = addition5;
    }

    public Addition getAddition6() {
        return addition6;
    }

    public void setAddition6(Addition addition6) {
        this.addition6 = addition6;
    }

    @Override
    public double display() {
        double totalPrice = super.display();
        if (this.addition5 != null) {
            System.out.println("Extra Addition: " + this.addition5.getName() + ", " + this.addition5.getPrice());
            totalPrice += this.addition5.getPrice();
        }
        if (this.addition6 != null) {
            System.out.println("Extra Addition: " + this.addition6.getName() + ", " + this.addition6.getPrice());
            totalPrice += this.addition6.getPrice();
        }
        return totalPrice;
    }
}
