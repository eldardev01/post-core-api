public class Main {
    public static void main(String[] args) {
        int [][] arr = {{43,23,32},{56,87,32}};
        int max = findMax(arr);
        System.out.println("Максимум = " + max);

        int seconds = 7234;
        String time = formatTime(seconds);
        System.out.println("Время " + time);

        int first = 15;
        int second = 30;
        int nod = findGCD(first,second);
        System.out.println("НОД = " + nod);

        int year = 2004;
        int month = 5;
    }

    //task 1
    public static int findMax(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }


    //task2
    public static  String formatTime(int seconds) {
        int minutesSeconds = 60;
        int hourSeconds = 3600;

        int hours = seconds / hourSeconds;
        seconds = seconds % hourSeconds;
        int minutes = seconds / minutesSeconds;
        seconds = seconds % minutesSeconds;

        return (hours < 10 ? "0" : "") + hours + ":" + (minutes < 10 ? "0" : "") + minutes + ":" + (seconds < 10 ? "0" : "") + seconds;
    }

    //task4
    public static int findGCD(int a, int b) {
        int c= 0;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0)
                c = i;
        }
        return c;
    }

    //task6


    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static int getDaysInMonth(int month, int year) {
        int days = 0;
        if ((month < 8 && month % 2 == 1) || (month >= 8 && month % 2 == 0))
            days = 31;
        else if (month == 2)
            days = isLeapYear(year) ? 29 : 28;
        else
            days = 30;
        return days;
    }

    //task 7
    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }

    //task 3

    public static void isPalindrome(String str) {
        String result = "True";
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                result = "False";
                break;
            }
        }
        System.out.println(result);
    }

    //task5
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(array[i]);
        }
    }
    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
    public static void printArray(char[] array) {
        for (int i : array) {
            System.out.print(i);
        }
    }



}



