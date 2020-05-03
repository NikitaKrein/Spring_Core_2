package task_1.bean;

import java.util.Objects;

public class E {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public E() {
    }

    public E(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        E e = (E) o;
        return getNumber() == e.getNumber();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber());
    }

    @Override
    public String toString() {
        return "E{" +
                "number=" + number +
                '}';
    }

    public void doingSomething(){
        System.out.println("Doing something!");
    }
}
