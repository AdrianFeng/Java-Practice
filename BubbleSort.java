package Sorting;

/**
 * Created by zhenfeng on 12/20/15.
 */
public class BubbleSort {
    public static void sort(int[] arr) {
        int length = arr.length;
        for (int i = length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    SortingTest.swap(arr, j, j + 1);
                }
            }
        }
    }
}
