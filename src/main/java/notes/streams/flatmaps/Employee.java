package notes.streams.flatmaps;

import java.util.List;

class Employee {

    private int id;
    private String name;
    private List<String> skills;

    public Employee(int id, String name, List<String> skills) {
        this.id = id;
        this.name = name;
        this.skills = skills;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getSkills() {
        return skills;
    }
}