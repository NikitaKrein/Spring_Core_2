package task_1.bean;

import java.util.Objects;

public class F {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public F() {
        System.out.println("Constructor worked");
    }

    public F(int number) {
        this.number = number;
        System.out.println("Constructor worked");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        F f = (F) o;
        return getNumber() == f.getNumber();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber());
    }

    @Override
    public String toString() {
        return "F{" +
                "number=" + number +
                '}';
    }

    public void initMethod(){
        System.out.println("Bean F was initialized");
    }

    public void destroyMethod(){
        System.out.println("Bean F will be deleted now!");
    }
}
