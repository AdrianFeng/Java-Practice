package Sorting;

/**
 * Created by zhenfeng on 12/20/15.
 */
public class SelectionSort {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    SortingTest.swap(arr, i, j);
                }
            }
        }
    }
}
