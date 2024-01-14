package homework12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Metods metod = new Metods();
        metod.arethmeticOperation(15, 20);
        metod.printOddNumbers();
        System.out.println();
        metod.maxOfThree(100,10,30);
        metod.isPositive(-100);

        String str = "aaadfskfanva";
        metod.replaceChar(str);

        int[] array = {14,12,20,21,26};
        metod.printSumOfMas(array);
        metod.printSecondMaxOfArray(array);

        String string = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};

        String result = metod.restoreString(string, indices);
        System.out.println(result);

        int x = metod.numberOfSteps(18);
        System.out.println(x);



    }
}