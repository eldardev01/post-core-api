public class Main {
    public static void main(String[] args) {

        //task 9.1

        int[][] myArray = {{10, 20, 30}, {40, 50, 60}};
        for (int i = 0; i <= myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                System.out.print(myArray[j][i] + " ");
            }
            System.out.println();
        }

        //task 9.2
        System.out.println("-------------");

        int[][] myArray1 = {{4, 2, 1}, {2,7,2}};
        for (int i = 0; i <= myArray1.length; i++) {
            for (int j = 0; j < myArray1.length; j++) {
                System.out.print(myArray1[j][i] + " ");
            }
            System.out.println();
        }

        //task 10
        System.out.println("-------------");

        int sum = 0;

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                sum += myArray[i][j];
            }
            System.out.println();
        }

        System.out.println("Сумма = " + sum);

        System.out.println("-------------");
        //task 11

        boolean isSquare = false;
        int count = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if (i == 0 ) {
                    count++;
                }
            }
        }

        if (count == myArray.length) {
            isSquare = true;
        }
            System.out.println(isSquare);

        System.out.println("-------------");
        //task 12

        int n = 5;
        int[][] newArray = new int[n][n];

        for (int i = 0; i < n; i++ ) {
            for (int j = 0; j < n; j++) {
                newArray[i][j] = ( i + 1 )  * (j + 1);
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-------------");
        //task 13

        int max = myArray[0][0];
        int min = myArray[0][0];

        for (int i = 0; i < myArray.length; i ++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if (myArray[i][j] > max) {
                    max = myArray[i][j];
                }
                if (myArray[i][j] < min) {
                    min = myArray[i][j];
                }
            }
        }
        System.out.println("Максимальный элемент = " + max);
        System.out.println("Минимальный элемент = " + min);
    }
}
