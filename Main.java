import recursion.Basic;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        Basic.reverseArray(arr, 0, arr.length - 1);
        for(var a : arr) {
            System.out.println(a);
        }
    }
}
