package core;

public class Core {
    
    public static int[] swap(int a, int b) {
        return new int[]{b, a};
    }

    public static int[] swapInArray(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
        return arr;
    }
}
