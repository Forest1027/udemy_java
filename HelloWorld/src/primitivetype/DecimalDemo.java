package primitivetype;

public class DecimalDemo {
    public static void main(String[] args) {
        float myFloatMin = Float.MIN_VALUE;
        float myFloatMax = Float.MAX_VALUE;
        System.out.println(myFloatMin);
        System.out.println(myFloatMax);

        double myDoubleMin = Double.MIN_VALUE;
        double myDoubleMax = Double.MAX_VALUE;
        System.out.println(myDoubleMin);
        System.out.println(myDoubleMax);

        int myInt = 5/3;
        float myFloat = 5/3;
        double myDouble = 5d/3;
        System.out.println(myInt);
        System.out.println(myFloat);
        System.out.println(myDouble);
    }
}
