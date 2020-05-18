package oopchallenge;

public class BasicHamburger {
    private String burgerName;
    private double basePrice;
    private String breadRollType;
    private String meat;
    private String addition1;
    private String addition2;
    private String addition3;
    private String addition4;
    private int maxAddition;

    public BasicHamburger(double basePrice, String breadRollType, String meat) {
        this.basePrice = basePrice;
        this.breadRollType = breadRollType;
        this.meat = meat;
    }

    public void setMaxAddition(int maxAddition) {
        this.maxAddition = maxAddition;
    }

    public void setBurgerName(String burgerName) {
        this.burgerName = burgerName;
    }

    public void setAddition1(String addition1) {
        this.addition1 = addition1;
    }

    public void setAddition2(String addition2) {
        this.addition2 = addition2;
    }

    public void setAddition3(String addition3) {
        this.addition3 = addition3;
    }

    public void setAddition4(String addition4) {
        this.addition4 = addition4;
    }
}
