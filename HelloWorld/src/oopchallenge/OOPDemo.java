package oopchallenge;

public class OOPDemo {
    public static void main(String[] args) {
        BasicBurger burger = new BasicBurger(3.56,"white bread","beef");
        burger.setAddition1(new Addition("tomato",0.27));
        burger.setAddition2(new Addition("lettuce",0.75));
        burger.setAddition3(new Addition("cheese",1.12));
        System.out.println(burger.display());
        System.out.println("--------------");
        HealthyBurger healthyBurger = new HealthyBurger(5.67,"white","Bacon");
        healthyBurger.setAddition1(new Addition("Egg",5.43));
        healthyBurger.setAddition5(new Addition("Lentils",3.41));
        System.out.println(healthyBurger.display());
        System.out.println("--------------");
        DeluxeBurger deluxeBurger = new DeluxeBurger(5.99,"white","Bacon");
        System.out.println(deluxeBurger.display());
    }
}
