package Inheritance;

public class devloper extends employee {

    int bonus;

    void calculateTotalSalary() {

        int totalSalary = basicSalary + bonus;

        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
    }
}
