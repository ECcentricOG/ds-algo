package recursion;

public class Basic {
    
    public static void printOneToN(int num) {
        if(num == 0) return;
        printOneToN(num - 1);
        System.out.println(num);
    }

    public static int sumOfN(int num) {
        if(num == 1) return 1;
        int sum = num + sumOfN(num - 1);
        return sum;
    }

    public static void reverseArray(int[] arr, int left, int right) {
        if(left >= right) return;
        arr[left] = arr[left] ^ arr[right];
        arr[right] = arr[left] ^ arr[right];
        arr[left] = arr[left] ^ arr[right];
        reverseArray(arr, left + 1, right - 1);
    }

    public static void fibonacciSeries(int n) {

    }
}
