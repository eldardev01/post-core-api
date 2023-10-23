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

        int x = 10;
        x++;
        System.out.println(x);
        ++x;
        System.out.println(x);
        x += 5;
        System.out.println(x);

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
    }
}