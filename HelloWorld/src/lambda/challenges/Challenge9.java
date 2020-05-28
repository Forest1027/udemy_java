package lambda.challenges;

import java.util.Arrays;
import java.util.List;

public class Challenge9 {
    public static void main(String[] args) {
        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );
//        topNames2015.stream()
//                .sorted(String::compareTo)
//                .map((name)->{
//                    if (name.charAt(0)>'Z'){
//                        StringBuilder sb = new StringBuilder();
//                        sb.append(String.valueOf(name.charAt(0)).toUpperCase()).append(name.substring(1));
//                        return sb.toString();
//                    }
//                    return name;
//                })
//                .forEach(System.out::println);

        //challenge 12
        // print out how many names being with the letter 'A'
//        long number = topNames2015.stream()
//                .filter(name -> name.startsWith("A"))
//                .peek(System.out::println)
//                .count();
//        System.out.println(number);
        topNames2015.stream()
                .filter(name -> name.startsWith("A"))
                .peek(System.out::println)
        .count();

        //challenge 13
        // what will be printed?
//        long num = topNames2015
//                .stream()
//                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
//                .peek(System.out::println)
//                .sorted(String::compareTo)
//                .count();
    }
}
