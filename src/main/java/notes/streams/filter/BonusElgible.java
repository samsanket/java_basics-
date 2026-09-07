package notes.streams.filter;


import notes.streams.Employee;

import java.util.List;

/*
Find employees who are eligible for a bonus

An employee is eligible if:

salary is greater than 50,000
employee is active
 */
public class BonusElgible {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("John", "IT", 60000, 30, true),
                new Employee("Alice", "HR", 45000, 28, true),
                new Employee("Bob", "IT", 700000, 35, false),
                new Employee("David", "Finance", 55000, 40, true)
        );

      List<Employee> bonus=  employees.
                stream().filter(
                        employee -> employee.getSalary()>50000 &&
                                employee.isActive()
                ).toList();

      for (Employee name:bonus){
          System.out.println(name.getName());
      }

      }
}
