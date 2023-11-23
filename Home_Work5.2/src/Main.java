public class Main {
    public static void main(String[] args) {
        //5.4

        int[] myarray = {1, 2, 3, 4, 5};
        int result = 0;

        for (int i = 4; i >= 0; i--) {
            result = myarray[i];
            System.out.print(result);
        }

        //5.5

        int number = 34;
        System.out.println();

        if (number > 1 && number % 2 != 0 && number % number == 0) {
            System.out.println("Простое");
        } else {
            System.out.println("Составное");
        }

        // 5.6.i

        char symvol = '*';

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(symvol);
            }
            System.out.println();
        }

        System.out.println();

        // 5.6 ii

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(symvol);
            }
            System.out.println();
        }

        System.out.println();

        // 5.6 iii

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();

        }

        System.out.println();

        //5.7

        int a = 1;
        int b = 5;
        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum = sum + i;
        }

        System.out.println(sum);

        System.out.println();
        //5.8

        double salary = 100000;
        double prem = 0;
        boolean classA = false;
        boolean classB = false;
        boolean classC = false;

        if (classA) {
            prem = salary * 0.5;
            salary = salary + prem;
            System.out.println(salary);
        } else if (classB) {
            prem = salary * 0.25;
            salary = salary + prem;
            System.out.println(salary);
        } else if (classC) {
            System.out.println(salary);
        } else {
            System.out.println("Error Employee not found");
        }

        System.out.println();

        //5.9

        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        int fib = 0;

        System.out.print(n1 + " ");
        System.out.print(n2 + " ");
        System.out.print(n2 + " ");

        for (int i = 0; i <= 9; i++) {
            n3 = n1 + n2;
            fib = n2 + n3;
            System.out.print(fib + " ");
            n1 = n2;
            n2 = n3;
        }
    }
}