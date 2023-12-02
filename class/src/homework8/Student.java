package homework8;

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
}
