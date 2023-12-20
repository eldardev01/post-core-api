package homework11;

import homework10.*;

import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Введите вещественное число");
            float num = scan.nextFloat();
            System.out.println(Math.sqrt(num));
        }
        catch (Exception e) {
            System.out.println("Что-то пошло не так");
        }

        divide(5,7);

        Scanner int1 = new Scanner(System.in);
        Scanner int2 = new Scanner(System.in);
        Scanner int3 = new Scanner(System.in);
        Scanner int4 = new Scanner(System.in);

        try {
            System.out.println("Введите 4 целых числа");
            int num1 = int1.nextInt();
            int num2 = int2.nextInt();
            int num3 = int3.nextInt();
            int num4 = int4.nextInt();
            System.out.println("Сумма целых чисел в строке равна " +(num1 + num2 + num3 + num4));
        }
        catch (Exception e) {
            System.out.println("Упс, кажется вы ввели строку");
        }

    }
    static void divide(double x, double y) {
        if (y == 0) {
            throw new ArithmeticException("Кажется Вы ввели 0");
        }
        else {
            System.out.println("x/y = " + x/y);
        }
    }

}