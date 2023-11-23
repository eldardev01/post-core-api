import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        int min = getMin(25, 37, 29);
        System.out.println("task 1, Наименьшее значение: " + min);

        double average = getAverage(25, 45, 65);
        System.out.println("task 2, Среднее значение " + average);

        String str = "DarTech123";
        String vowels = "AaEeYyUuIiOo";
        int numberOfVowels = getNumberOfVowels(str, vowels);
        System.out.println("task 3, Количество гласных в строке: " + numberOfVowels);

        String javaIsG = "Java is good to learn Object Oriented programming.";
        int numberOfWords = getNumberOfWords(javaIsG);
        System.out.println("task 4, Количество слов в строке: " + numberOfWords);

        int number = 1254212;
        int numberOfDigits = getNumberOfDigitsEqualTo2(number);
        System.out.println("task 5: " + numberOfDigits);

        String str1 = "AIEEE";
        boolean checkString = getBoolIfStringEqualVowels(str1);
        System.out.println("task 6, Строка является гласной ? " + checkString);

        int side = 6;
        double area = getAreaOfPentagon(side);
        System.out.printf("task 7, Площадь пятиугольника равна %.3f %n", area);

        int number1 = 252;
        int sumOfDigits = getSumOfDigits(number1);
        System.out.println("task 8, Сумма = " + sumOfDigits);

        int[][] arr1 = {{40, 20, 30, 10}, {34, 15, 54, 45}};
        int find = 54;
        System.out.print("add 1, Коррдинаты элемента - ");
        printCoordinatesOfElement(arr1, find);

        System.out.println("add 2:");
        printAverageOfI(arr1);

        System.out.println("add 4:");
        printMaxMin(arr1);

        System.out.println("add 5:");
        printSortMas(arr1);


        int[][] arr2 = {{5, 4}, {3, 1}};
        boolean isSymmetrical = isSymmetricalMatrix(arr2);
        System.out.println("Add 6, Является ли заданная матрица симметричной - " + isSymmetrical);

        int[][] rotateMatrix = getRotateMatrix(arr2);
        for (int i = 0; i < rotateMatrix.length; i++) {
            for (int j = 0; j < rotateMatrix[i].length; j++) {
                System.out.print(rotateMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    // task 1
    public static int getMin(int first, int second, int third) {
        if (first < second && first < third) {
            return first;
        } else if (second < first && second < third) {
            return second;
        } else {
            return third;
        }
    }

    //task 2

    public static int getAverage(int first, int second, int third) {
        return (first + second + third) / 3;
    }

    // task 3

    public static int getNumberOfVowels(String str, String vowels) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if (str.charAt(i) == vowels.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    //task 4

    public static int getNumberOfWords(String javaIsG) {
        int count = 1;

        for (int i = 0; i < javaIsG.length(); i++) {
            if (javaIsG.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }


    // task 5

    public static int getNumberOfDigitsEqualTo2(int number) {
        int count = 0;

        while (number != 0) {
            if (number % 10 == 2) {
                count++;
            }
            number = number / 10;
        }
        return count;
    }

    // task 6

    public static boolean getBoolIfStringEqualVowels(String str) {
        int count = 0;
        boolean isVowels = false;
        String vowels = "AaEeYyUuIiOo";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if (str.charAt(i) == vowels.charAt(j)) {
                    count++;
                }
            }
        }
        if (count == str.length()) {
            isVowels = true;
        }
        return isVowels;
    }

    // task 7

    public static double getAreaOfPentagon(int side) {
        return (5 * pow(side, 2)) / (4 * sqrt(5 - 2 * sqrt(5)));
    }

    public static int getSumOfDigits(int number) {
        int temp;
        int sum = 0;
        while (number % 10 != 0) {
            temp = number % 10;
            sum += temp;
            number /= 10;
        }
        return sum;
    }

    // add 1

    public static void printCoordinatesOfElement(int[][] arr, int find) {
        int coordinateI = 0;
        int coordinateJ = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == find) {
                    coordinateI = i;
                    coordinateJ = j;
                }
            }
        }
        System.out.println(coordinateI + " " + coordinateJ);
    }

    // add 2


    public static void printAverageOfI(int[][] arr) {
        int sum1 = 0;
        int average1 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum1 += arr[i][j];
                average1 = sum1 / arr[i].length;
            }
            System.out.println("Average of " + i + " = " + average1);
            sum1 = 0;
            average1 = 0;
        }
    }

    // add 4
    public static void printMaxMin(int[][] arr) {
        int max = arr[0][0];
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Максимальный эелемент = " + max);
        System.out.println("Минимальный эелемент = " + min);
    }

    //add 5
    public static void printSortMas(int[][] arr) {
        boolean isSort = false;
        while (!isSort) {
            isSort = true;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length - 1; j++) {
                    if (arr[i][j] > arr[i][j + 1]) {
                        int temp = arr[i][j + 1];
                        arr[i][j + 1] = arr[i][j];
                        arr[i][j] = temp;
                        isSort = false;
                    }
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSymmetricalMatrix(int[][] arr) {
        boolean isSymetrical = false;


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[j][i] != arr[i][j]) || arr.length != arr[i].length) {
                    isSymetrical = false;
                } else {
                    isSymetrical = true;
                }
            }
        }

        return isSymetrical;
    }

    public static int[][] getRotateMatrix(int[][] arr) {
        int size = arr.length;
        int[][] rotateMatrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                rotateMatrix[i][j] = arr[size - j - 1][i];
            }
        }
        return rotateMatrix;
    }

}

