package oop;

public class InheritanceDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.move();
        System.out.println("------");
        Animal dog = new Dog();
        dog.setBody(2);
        dog.eat();
        dog.move();
        Animal dog2 = dog;
        dog2.setBody(3);
        System.out.println(dog.getBody());
    }
}
