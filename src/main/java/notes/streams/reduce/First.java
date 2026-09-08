package notes.streams.reduce;

import notes.streams.Employee;

import java.util.List;

public class First {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(101, "John", 90000),
                new Employee(102, "Alice", 70000),
                new Employee(103, "Bob", 85000),
                new Employee(104, "David", 95000)
        );
        // sum of all salaries

        Integer sum =employees.stream().
                map(Employee::getSalary).reduce(Integer::sum).get();

        System.out.println(sum);
    }
}
