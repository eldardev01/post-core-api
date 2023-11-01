public class Main {
    public static void main(String[] args) {
        //5.4

        int [] myarray = {1,2,3,4,5};
        int result = 0;

        for ( int i = 4; i >= 0; i--) {
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

        // 5.6 i

        char symvol = '*';

        for ( int i = 0; i < 4; i++) {
            for ( int j = 0; j < 10; j++) {
                System.out.print(symvol);
            }
            System.out.println();
        }

        System.out.println();

        // 5.6 ii

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i +1; j++ ) {
                System.out.print(symvol);
            }
            System.out.println();
        }

        System.out.println();

        // 5.6 iii

        for ( int i = 0; i < 6; i++) {
            // для печати пробелов
            for ( int j = i; j < 5; j++ ) {
                System.out.print(" ");
            }
            // для вывода
            for ( int k = 1; k <= i; k++) {
                System.out.print(k);
                if (k > 1)
                    System.out.print(k);
            }

            // дл перехода на следующую линию
            System.out.println();
        }


    }
}