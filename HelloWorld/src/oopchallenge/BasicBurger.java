package oopchallenge;

public class BasicBurger {
    private String burgerName;
    private double basePrice;
    private String breadRollType;
    private String meat;
    private Addition addition1;
    private Addition addition2;
    private Addition addition3;
    private Addition addition4;
    private int maxAddition;

    public BasicBurger(double basePrice, String breadRollType, String meat) {
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

    public Addition getAddition1() {
        return addition1;
    }

    public void setAddition1(Addition addition1) {
        this.addition1 = addition1;
    }

    public Addition getAddition2() {
        return addition2;
    }

    public void setAddition2(Addition addition2) {
        this.addition2 = addition2;
    }

    public Addition getAddition3() {
        return addition3;
    }

    public void setAddition3(Addition addition3) {
        this.addition3 = addition3;
    }

    public Addition getAddition4() {
        return addition4;
    }

    public void setAddition4(Addition addition4) {
        this.addition4 = addition4;
    }

    public double display() {
        String result = "Basie price: " + this.basePrice + "; ";
        double totalPrice = basePrice;
        if (addition1 != null) {
            result += "Addition1: " + this.addition1.getName() + ", " + this.addition1.getPrice() + "; ";
            totalPrice += this.addition1.getPrice();
        }
        if (addition2 != null) {
            result += "Addition2: " + this.addition2.getName() + ", " + this.addition2.getPrice() + "; ";
            totalPrice += this.addition2.getPrice();
        }
        if (addition3 != null) {
            result += "Addition3: " + this.addition3.getName() + ", " + this.addition3.getPrice() + "; ";
            totalPrice += this.addition3.getPrice();
        }
        if (addition4 != null) {
            result += "Addition4: " + this.addition4.getName() + ", " + this.addition4.getPrice() + "; ";
            totalPrice += this.addition4.getPrice();
        }

        System.out.println(result);
        return totalPrice;
    }
}
