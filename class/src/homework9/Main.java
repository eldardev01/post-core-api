package homework9;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Student ira = new Student(32, "Irina");
        ira.increaseYear();
        System.out.println(ira);

        StarTriangle small = new StarTriangle(3);
        System.out.println(small.toString());

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение стороны квадрата: ");
        int number = scan.nextInt();
        Square square = new Square(number);
        System.out.println(square);

        Temperature temperature1 = new Temperature(100, "C");
        System.out.println(temperature1.toString());
    }
}