public class Main {
    public static void main(String[] args) {

    }

    //task1
    public void printToN(int n) {
        if (n > 1) {
            printToN(n - 1);
        }
        System.out.println(n);
    }

    //task2
    public int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    ///task3
    public long power(int x, int n) {
        if (n == 0)
            return 1;
        else
            return x * power(x, n - 1);
    }

    //task4
    public int findMax(int[] arr, int i, int max) {
        if (i == arr.length) {
            return max;
        }
        if (max < arr[i]) {
            max = arr[i];
        }
        return findMax(arr, i + 1, max);
    }

    //task5
    public int arraySum(int[] arr, int i, int sum) {
        if (i == arr.length) {
            return sum;
        }
        sum += arr[i];
        return arraySum(arr, i + 1, sum);
    }

}