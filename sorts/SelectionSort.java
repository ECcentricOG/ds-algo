package sorts;

import core.Core;

public class SelectionSort {
    
    public static int[] sort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int index = -1;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }
            if(index == -1) continue;
            else {
                arr = Core.swapInArray(arr, i, index);
            }
        }
        return arr;
    }
}
