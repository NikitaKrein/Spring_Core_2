package task_1.bean;

import java.util.Objects;

public class B {
    private A field_A;
    private int number;

    public A getField_A() {
        return field_A;
    }

    public void setField_A(A field_A) {
        this.field_A = field_A;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public B() {
    }

    public B(A field_A, int number) {
        this.field_A = field_A;
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        B b = (B) o;
        if (getField_A() == null)
            return getNumber() == b.getNumber();
        return getNumber() == b.getNumber() &&
                getField_A().equals(b.getField_A());
    }

    @Override
    public int hashCode() {
        if (getField_A() == null)
            return getNumber();
        return Objects.hash(getField_A(), getNumber());
    }

    @Override
    public String toString() {
        return "B{" +
                "field_A=" + field_A +
                ", number=" + number +
                '}';
    }
}
