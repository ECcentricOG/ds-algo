package sorts;

import core.Core;

public class BubbleSort {
    
    public static int[] sort(int[] arr) {
        boolean swapped = false;
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    arr = Core.swapInArray(arr, j, j + 1);
                    swapped = true;
                }
            }
            if(swapped == false) break;
        }
        return arr;
    }
}
