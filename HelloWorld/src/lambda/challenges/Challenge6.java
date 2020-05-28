package lambda.challenges;

import java.util.function.Supplier;

public class Challenge6 {
    public static void main(String[] args) {
        Supplier<String> iLovaJava = ()->"I love Java!";
        Supplier<String> iLoveJava2 = ()->{return "I love Java!";};
        System.out.println(iLovaJava.get());
        System.out.println(iLoveJava2);
    }
}
