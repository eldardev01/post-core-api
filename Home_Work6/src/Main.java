import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //1

        int[] myArray = {1, 3, 4, 1, 5, 5};
        float sum = 0;
        float result = 0;

        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
            result = sum / myArray.length;
        }
        System.out.println("Среднее значение = " + result);

        System.out.println();
        //2

        int dubl = 0;

        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] == myArray[j]) {
                    System.out.println("Дубликат = " + myArray[i]);
                    break;
                }
            }
        }

        System.out.println();
        //3

        int number = 23;
        int[] myArray1 = {1, 3, -6, 23, 14, 2};
        for (int i = 0; i < myArray1.length; i++) {
            if (myArray1[i] == number)
                System.out.println(true);
        }

        System.out.println();
        //4 и 4.2

        boolean isFound = false;
        for (int i = 0; i < myArray1.length; i++) {
            if (myArray1[i] == number) {
                isFound = true;
                System.out.println(i);
            }
        }
        if (isFound != true) {
            System.out.println("Не найдено");
        }

        System.out.println();
        //5

        int[] myArray2 = {34, 82, 29, 30, 25, 40, 32, 31, 35, 410, 7};
        int n = 3;
        int m = 8;

        System.out.print("[ ");

        for (int i = 0; i < myArray2.length; i++) {
            if (i >= n && i <= m)
                System.out.print(myArray2[i] + " ");
        }

        System.out.print("]");

        System.out.println();
        System.out.println();
        //5.2


        int n1 = 1;
        int m1 = 3;

        System.out.print("[ ");

        for (int i = 0; i < myArray1.length; i++) {
            if (i >= n1 && i <= m1)
                System.out.print(myArray1[i] + " ");
        }

        System.out.print("]");

        System.out.println();
        System.out.println();
        //6
        int minim = 0;
        int max = myArray1[0];
        for (int i = 0; i < myArray1.length; i++) {
            for (int j = i + 1; j < myArray1.length; j++) {
                if (myArray1[i] < myArray1[j]) {
                    minim = myArray1[i];
                }
            }
        }
        // я потом допёр, что можно тупо максу присвоить первый элемент, минимум оставлю уже так,
        // как сделал
        for (int i = 1; i < myArray1.length; i++) {
            if (myArray1[i] > max) {
                max = myArray1[i];
            }
        }

        System.out.println("Минимальный элемент = "  + minim);
        System.out.println("Максимальный элемент = " + max);



        System.out.println();
        //7

        int min = 0;
        int[] emptyArray = new int[6];
        int min2 = 0;
        int pointer = 0;
        boolean isPointer = true;

        for (int i = 0; i < myArray1.length; i++) {
            for (int j = i + 1; j < myArray1.length; j++) {
               if (myArray1[i] < myArray1[j]) {
                   min = myArray1[i];
                   pointer = i;
               }
            }
        }
        System.out.println();
        System.out.println("Наименьший элемент = " + min);

        for (int i = 0; i < myArray1.length; i++) {
            for (int  j = i + 1; j < myArray1.length - 1; j++ ) {
                if (j == pointer) {
                    isPointer = false;
                }
                else if (myArray1[i] < myArray1[j] && isPointer) {
                    min2 = myArray1[i];
                }
            }
        }
        System.out.println("Второй наименьший элемент = " + min2);

       /*
       здесь я хотел найдя минимум исключить его и создать новый массив без него
       Но столкнулся с проблемой, что когда я убираю min вместо него ставится 0 и тогда этот 0
       становится вторым наименьшим элементом.

       for ( int i = 0; i < myArray1.length; i++) {
            if (myArray1[i] != min) {
                emptyArray[i]+= myArray1[i];
            }
            System.out.print(emptyArray[i] + " ");
        }

        for (int i = 0; i < emptyArray.length; i++) {
            for (int j = i + 1; j < emptyArray.length; j++) {
                if (emptyArray[i] < emptyArray[j]) {
                    min2 = emptyArray[i];
                }
            }
        }

        System.out.println();
        System.out.println(min2);
        */

        // 8
        System.out.println();

        int[] arr = {1, 2, 3, 0, 4, 6};
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < arr.length -1; i++) {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSorted = false;
                }
            }
        }

        for (int i: arr) {
            System.out.print(i);
        }
    }
}