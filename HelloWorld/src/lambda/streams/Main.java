package lambda.streams;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> someBingoNumbers = Arrays.asList(
                "N40", "N36",
                "B12", "B6",
                "G53", "G49", "G60", "G50", "g64",
                "I26", "I17", "I29",
                "O71"
        );
        List<String> gNumbers = new ArrayList<>();
//        someBingoNumbers.forEach(number->{
//            if (number.toUpperCase().startsWith("G")){
//                gNumbers.add(number);
//                System.out.println(number);
//            }
//        });
//
//        gNumbers.sort((String s1, String s2)->s1.compareTo(s2));
//        gNumbers.forEach((String s)-> System.out.println(s));
        System.out.println("---------------");
        someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);

        System.out.println("--------------------------");
        Stream<String> ioNumberStream = Stream.of("I26", "I17", "I29", "O71");
        Stream<String> inNumberStream = Stream.of("N40", "N36", "I26", "I17", "I29", "O71");
        Stream<String> concatStream = Stream.concat(ioNumberStream, inNumberStream);
        System.out.println(concatStream
                .distinct()
                .peek(System.out::println)
                .count());

        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim Doe", 21);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);

        Department hr = new Department("Human Resource");
        hr.addEmployee(tim);
        hr.addEmployee(jack);
        hr.addEmployee(snow);
        Department accounting = new Department("Accounting");
        accounting.addEmployee(john);

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(accounting);
        System.out.println("-------------");
        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .forEach(System.out::println);
        System.out.println("-------------");
//        List<String> sortedGNumbers = someBingoNumbers
//                .stream()
//                .map(String::toUpperCase)
//                .filter(s->s.startsWith("G"))
//                .sorted()
//                .collect(Collectors.toList());
        List<String> sortedGNumbers = someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        for (String s : sortedGNumbers) {
            System.out.println(s);
        }
        System.out.println("=====================");
        Map<Integer, List<Employee>> groupByAge = departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .collect(Collectors.groupingBy(employee -> employee.getAge()));
        for (Map.Entry<Integer, List<Employee>> entry : groupByAge.entrySet()
        ) {
            System.out.println(entry);
        }
        System.out.println("=====================");

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .peek(System.out::println)
                .reduce((e1, e2) -> e1.getAge() < e2.getAge() ? e1 : e2)
                .ifPresent(System.out::println);


        Stream.of("ABC", "AC", "BAA", "CCCC", "XY", "ST")
                .filter(s -> {
                    System.out.println(s);
                    return s.length() == 3;
                })
        .count();
    }
}
