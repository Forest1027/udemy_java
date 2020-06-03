package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge2 {
    public static void main(String[] args) {
        String challenge8 = "abcd.135uvwq.7tsdlf.999";
        System.out.println(challenge8.matches("(\\w+.\\d+)+"));
        Pattern pattern8 = Pattern.compile("[\\w]+\\.(\\d+)");
        Matcher matcher = pattern8.matcher(challenge8);
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
        System.out.println("-------------------------------");
        String challenge9 = "abcd.135\tuvwq.7\ttsdlf.999\n";
        Pattern pattern9 = Pattern.compile("\\w+\\.(\\d+)\\s");
        Matcher matcher1 = pattern9.matcher(challenge9);
        while (matcher1.find()) {
            System.out.println(matcher1.group(1));
        }
        System.out.println("-------------------------------");

        String challenge11 = "{0,2},{0,5},{1,3},{2,4},{x,y}";
        Pattern pattern11 = Pattern.compile("\\{(.+?)\\},*");
        Matcher matcher2 = pattern11.matcher(challenge11);
        while (matcher2.find()){
            System.out.println(matcher2.group(1));
        }
    }
}
