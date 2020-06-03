package regex;

import java.util.regex.Pattern;

public class Challenge3 {
    public static void main(String[] args) {
        String challenge12 = "11111";
        Pattern pattern1 = Pattern.compile("^\\d{5}$");
        System.out.println(pattern1.matcher(challenge12).matches());

        String challenge13 = "11111-1111";
        Pattern pattern2 = Pattern.compile("^\\d{5}-\\d{4}$");
        System.out.println(pattern2.matcher(challenge13).matches());

        String challenge14 = "11111-2222";
        Pattern pattern3 = Pattern.compile("^\\d{5}(-\\d{4})?$");
        System.out.println(pattern3.matcher(challenge14).matches());
    }
}
