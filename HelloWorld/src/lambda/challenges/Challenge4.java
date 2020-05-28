package lambda.challenges;

import java.util.function.Function;

public class Challenge4 {
    public static void main(String[] args) {
        Function<String, String> lambdaFunction = s -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };
        System.out.println(everySecondCharacter(lambdaFunction,"1234567890"));
    }
    public static String everySecondCharacter(Function<String,String> function, String input){
        return function.apply(input);
    }
}
