public class Main {
    public static void main(String[] args) {
        int number1 = 10, number2 = 5;
        System.out.println(number1 * number2);

        int number3 = 20;
        float number4 = 2.5f;
        System.out.println(number3 / number4);

        int dlina = 15, wirina = 9, S, P;
        S = dlina * wirina;
        P = 2 * (dlina + wirina);
        System.out.println("Площадь = " + S);
        System.out.println("Периметр =" + P);

        int p = 10;
        p++;
        System.out.println(p);
        ++p;
        System.out.println(p);
        p += 5;
        System.out.println(p);

        int count1 = 25, count2 = 43;
        System.out.println(count1 == count2);

        int a = 10, b = 5;

        System.out.println(a + b);
        System.out.println(a / b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a % b);

        int F = 50;
        double C;
        C = (F - 32) / 1.8;
        System.out.println(C);

        int j;
        j = (((10 + 451) / 3) + 5) * 5;
        System.out.println(j);

        int t = 65, u = 80;
        if (t > 50 && t > u)
        {
            System.out.println("Верно");
        }
        else {
        System.out.println("Не верно");
        }

        System.out.println();

        //Доп. задачи
        //1

        int number = 21;

        if ( number % 2 == 0)
            System.out.println("Чётное");
        else
            System.out.println("Нечётное");

        System.out.println();
        //2

        int n1 = 5;
        int n2 = 10;

        if (n1 > n2)
            System.out.println("n1 больше");
        else
            System.out.println("n2 Больше");

        //3
        System.out.println();

        int year = 2005;

        if ((year % 400 == 0 || year % 100 != 0) && year % 4 == 0)
            System.out.println("Год весокосный");
        else
            System.out.println("Год невесокосный");

        //4
        System.out.println();

        int numberOfWeek =4;

        switch (numberOfWeek) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            case 6 -> System.out.println("Суббота");
            case 7 -> System.out.println("Воскресенье");
        }

        //5
        System.out.println();

        int x = -3;
        int y = 4;

        if (x < 0 && y > 0 ) {
            System.out.println("1 Четверть");
        }
        else if (x > 0 && y > 0) {
            System.out.println("2 Четверь");
        }
        else if (x < 0 && y < 0) {
            System.out.println("3 Четверь");
        }
        else
            System.out.println("4 четверь");

        //5
        System.out.println();

        int a1 = 3;
        int b1 = 4;
        int c1 = 3;

        if (a1==b1 && b1 == c1) {
            System.out.println("Равносторонний");
        }
        else if (a1 == b1 || b1 == c1 || a1 == c1)  {
            System.out.println("Равнобердернный");
        }
        else
            System.out.println("Разносторонний");


    }
}