package homework9_2;

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.setNumber(5);
        outer.inc();

        Vehicle vehicle = new Vehicle();
        vehicle.start();

        Book book1 = new Book();
        book1.printBook();
    }
}