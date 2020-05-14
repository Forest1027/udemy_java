package oop;

public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;
    public static void sing(){

    }

    public Animal() {
        System.out.println("This is Animal no parameter construct.");
    }
    public Animal eat(){
        System.out.println("Animal eat.");
        return this;
    }

    public void move(){
        System.out.println("Animal move.");
    }

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBrain() {
        return brain;
    }

    public void setBrain(int brain) {
        this.brain = brain;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
