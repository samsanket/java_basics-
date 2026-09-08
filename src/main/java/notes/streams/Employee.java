package notes.streams;

public class Employee {
    private String name;
    private String department;
    private int salary;
    private int age;
    private boolean active;
    private int id;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActive() {
        return active;
    }

    public Employee(String name, String department, int salary, int age, boolean active) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
        this.active = active;
    }

}