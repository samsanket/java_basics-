package notes.streams.flatmaps;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class First {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(
                        101,
                        "John",
                        List.of("Java", "Spring", "Kafka")
                ),
                new Employee(
                        102,
                        "Alice",
                        List.of("Java", "AWS")
                ),
                new Employee(
                        103,
                        "Bob",
                        List.of("Docker", "Kubernetes")
                )
        );


        // Find all unique skills across all employees

        Set<String> unique = employees.stream().flatMap(e -> e.getSkills().stream()).collect(Collectors.toSet());
        unique.forEach(System.out::println);
    }
}
