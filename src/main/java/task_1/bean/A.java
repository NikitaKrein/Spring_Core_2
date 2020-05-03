package task_1.bean;

import java.util.Objects;

public class A {
    private String name;
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public A() {
    }

    public A(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        if (getName() == null || a.getName() == null)
            return getNumber() == a.getNumber();
        return getNumber() == a.getNumber() &&
                getName().equals(a.getName());
    }

    @Override
    public int hashCode() {
        if (getName() == null)
            return getNumber();
        return Objects.hash(getName(), getNumber());
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
