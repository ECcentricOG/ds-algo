import sorts.BubbleSort;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 6, 3, 1, 4 ,6};
        BubbleSort.sort(arr);
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
