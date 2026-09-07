package notes.streams.filter;

import notes.streams.Employee;

import java.util.List;


/*
Rule 1

Employee must be active.

Rule 2

Employee must have salary ≥ 80,000.

Rule 3

AND either:

Department = IT
AND age < 40

OR

Department = Finance
AND salary >= 100,000
Expected result
John
Mike
 */
public class ComplexBusiness {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("John", "IT", 90000, 32, true),
                new Employee("Alice", "HR", 70000, 29, true),
                new Employee("Bob", "IT", 95000, 45, false),
                new Employee("David", "Finance", 85000, 38, true),
                new Employee("Emma", "IT", 60000, 26, true),
                new Employee("Mike", "Finance", 120000, 50, true)
        );
    }

}
