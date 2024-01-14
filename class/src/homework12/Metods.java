package homework12;


public class Metods {
    //Напишите метод для вывода суммы, умножения, вычитания, деления и остатка двух чисел
    public void arethmeticOperation(double num1, double num2) {
        System.out.println(
                "Сумма двух чисел: " + (num1 + num2) + "\n" +
                        "Разность двух чисел: " + (num1 - num2) + "\n" +
                        "Деление двух чисел: " + (num1 / num2) + "\n" +
                        "Умножение двух чисел: " + (num1 * num2) + "\n" +
                        "Остаток двух чисел: " + (num1 % num2) + "\n");
    }

    //Напишите метод для вывода нечетных чисел от 1 до 20

    public void printOddNumbers() {
        System.out.println("Нечётные числа: ");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }


    //Напишите метод, чтобы поменять местами две переменные (без третьей переменной)

    public void swapNumbers(int a, int b){
        a = a +b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + "b =" + b);
    }


    //Напишите метод, которая принимает от пользователя три числа и выводит наибольшее из них
    public void maxOfThree(int num1, int num2, int num3) {
        int[] array = {num1, num2, num3};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Самое большое число из трёх = " + max);
    }

    //Напишите метод для проверки того, является ли число положительным или отрицательным

    public void isPositive(int num1) {
        if (num1 > 0) {
            System.out.println("Число " + num1 + " положительное");
        } else {
            System.out.println("Число " + num1 + " отрицательное");
        }
    }

    //Напишите метод для замены всех символов 'a' на символы 'b'

    public void replaceChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a') {
                c = 'b';
            }
            result += c;
        }
        System.out.println("Новая строка - " + result);
    }

    //Напишите метод для суммирования значений массива

    public void printSumOfMas(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        System.out.println("Сумма элементов массива = " + result);
    }

    //Напишите метод для нахождения второго по величине числа из массива

    public void printSecondMaxOfArray(int[] array) {
        int max1 = array[0];
        int max2 = array[1];
        for (int i = 0; i < array.length; i++) {
            if (max1 < array[i]) {
                max1 = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == max1) {
                array[i] = 0;
            }
            if (array[i] > max2) {
                max2 = array[i];
            }
        }
        System.out.println("Второй по величине элемент в массиве = " + max2);
    }

    //Shuffle String https://leetcode.com/problems/shuffle-string/
    public String restoreString(String s, int[] indices) {
        char[] resultArray = new char[indices.length];

        for (int i = 0; i < indices.length; i++) {
            resultArray[indices[i]] = s.charAt(i);
        }

        return new String(resultArray);
    }

    //Palindrome number https://leetcode.com/problems/palindrome-number/

    static boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < (length / 2); i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    //Number of Steps to Reduce a Number to Zero
    public int numberOfSteps(int num) {
        int temp = 0;
        int count = 0;
        if (num % 2 == 0) {
            while (num  != 0) {
                num = num / 2;
                temp = num - 1;
                num = temp;
                count += 2;
            }
        }
        else {
            while (num != 0) {
                num = num - 1;
                temp = num / 2;
                num = temp;
                count += 2;
            }
        }
        return count;
    }

    //Check If Two String Arrays are Equivalent
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        boolean isEqual = false;
        String str1 = "";
        String str2 = "";
        for (int i = 0; i < word1.length; i ++) {
            str1 += word1[i];
        }
        for (int i = 0; i < word2.length; i ++) {
            str2 += word2[i];
        }
        if (str1.equals(str2)) {
            isEqual = true;
        }
        return isEqual;
    }

    //Sum of All Odd Length Subarrays - не понял задание, позже доделаю

}

