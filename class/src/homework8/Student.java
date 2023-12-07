package homework8;

import java.util.Objects;

public class Student {
    String name;
    String surname;
    String address;
    int id;

    @Override
    public String toString() {
        return "Student "  + id + "\n" +
                 "Name: " + name + "\n" +
                "Surname:" + surname + "\n" +
                "Adress: " + address + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(address, student.address);
    }



    @Override
    public int hashCode() {
        return Objects.hash(name, surname, address, id);
    }
}
