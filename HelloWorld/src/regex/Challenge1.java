package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge1 {
    public static void main(String[] args) {
        String challenge1 = "I want a bike.";
        System.out.println("challenge1: " + challenge1.matches("I want a bike."));
        String challenge2 = "I want a ball.";
        String pattern2 = "I want a b[a-zA-Z]{3}.";
        System.out.println("1. challenge2: " + challenge1.matches(pattern2));
        System.out.println("2. challenge2: " + challenge2.matches(pattern2));

        String pattern3 = "^I want a \\w+.?";
        Pattern pattern = Pattern.compile(pattern3);
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());

        String challenge4 = "Replace all blanks with underscores";
        System.out.println(challenge4.replaceAll("[ ]", "_"));

        String challenge5 = "aaabccccccccdddefffg";
        System.out.println(challenge5.matches("[a]{3}[b]{1}[c]{8}[d]{3}[e]{1}[f]{3}[g]{1}"));
        System.out.println(challenge5.matches("[a-z]+"));
        System.out.println(challenge5.replaceAll("[a]{3}[b]{1}[c]{8}[d]{3}[e]{1}[f]{3}[g]{1}", "REPLACED"));

        String challenge7 = "kjisl.22a";
        System.out.println(challenge7.matches("\\w+.\\d+"));



    }
}
