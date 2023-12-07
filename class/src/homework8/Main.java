package homework8;

import homework8.Avarage;


public class Main {
    public static void main(String[] args) {
        Student alica = new Student();
        alica.name = "Алиса";
        alica.surname = "Смит";
        alica.address = "Коктем-2";
        alica.id = 24;
        System.out.println(alica);

        Student aza = new Student();
        aza.name = "Азамат";
        aza.surname = "Жумагулов";
        aza.address = "Бокейхана 15";
        aza.id = 15;
        System.out.println(aza);

        Student aza2 = new Student();
        aza2.name = "Азамат";
        aza2.surname = "Жумагулов";
        aza2.address = "Бокейхана 15";
        aza2.id = 15;

        Student kris = new Student();
        kris.name = "Кристина";
        kris.surname = "Семенова";
        kris.address = "Майлниа 40";
        kris.id = 2;
        System.out.println(kris);

        Triangle triangle1 = new Triangle(3,4,5);
        System.out.println(triangle1);

        Rectangle rectangle1 = new Rectangle(5,9);
        Rectangle rectangle2 = new Rectangle(10,14);
        System.out.println(rectangle1);
        System.out.println(rectangle2);

        Avarage avarage = new Avarage();
        System.out.println("Среднее значение = " + avarage.returnAverage(10,15,20));

        Movie movie1 = new Movie("Фокус", "RatPac-Dune Entertainment", "R");
        Movie movie2 = new Movie("Главный герой", "20th Century Studios");
        System.out.println(movie1);
        System.out.println(movie2);

        if (alica.equals(aza)) {
            System.out.println("OK");;
        }
        else {
            System.out.println("False");
        }

        if (aza.equals(aza2)) {
            System.out.println("OK");
        }
        else {
            System.out.println("False");
        }

        System.out.println(aza.hashCode());
        System.out.println(aza2.hashCode());

    }
}