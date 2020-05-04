package task_2.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Position {
    private String name;
    private List<Employee> employees = new ArrayList<>();
    private Map<String, Integer> skills = new HashMap<>();
    private Salary salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public Map<String, Integer> getSkills() {
        return skills;
    }

    public void setSkills(Map<String, Integer> skills) {
        this.skills = skills;
    }

    public Position() {}

    public Position(String name, Salary salary) {
        this.name = name;
        this.salary = salary;
    }

    public Position(String name, List<Employee> employees, Salary salary) {
        this.name = name;
        this.employees = employees;
        this.salary = salary;
    }

    public Position(String name, Map<String, Integer> skills, Salary salary) {
        this.name = name;
        this.skills = skills;
        this.salary = salary;
    }

    public Position(String name, List<Employee> employees, Map<String, Integer> skills, Salary salary) {
        this.name = name;
        this.employees = employees;
        this.skills = skills;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;

        if (name == null || salary == null ||
                position.getName() == null || position.getSalary() == null) {
            return false;
        }

        return getName().equals(position.getName()) &&
                getEmployees().equals(position.getEmployees()) &&
                getSalary().equals(position.getSalary());
    }

    @Override
    public int hashCode() {
        return name.hashCode() + (salary != null ? 131 * salary.hashCode() : 0);
    }

    @Override
    public String toString() {
        StringBuilder str1 =  new StringBuilder("Position " + name + " salary " + salary);
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < employees.size(); i++){
            str2.append("\n").append(employees.get(i).getName());
        }
        return (str1.toString() + str2.toString());
    }
}
