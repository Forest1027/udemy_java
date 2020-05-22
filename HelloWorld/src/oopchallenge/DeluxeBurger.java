package oopchallenge;

public class DeluxeBurger extends BasicBurger {
    public DeluxeBurger(double basicPrice, String breadRollType, String meat) {
        super(basicPrice, breadRollType, meat);
        super.setAddition1(new Addition("chips",3.99));
        super.setAddition2(new Addition("drinks",3.99));
    }

    @Override
    public void setAddition3(Addition addition3) {
        System.out.println("Can only have 2 additions");
        super.setAddition3(null);
    }

    @Override
    public void setAddition4(Addition addition4) {
        System.out.println("Can only have 2 additions");
        super.setAddition4(null);
    }
}
