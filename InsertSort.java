package Sorting;

/**
 * Created by zhenfeng on 12/20/15.
 */
public class InsertSort {
    public static void sort(int[] arr) {
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            for (int j = i; (j > 0 && arr[j] < arr[j - 1]); j--) {
                SortingTest.swap(arr, j, j - 1);
            }
        }
    }
}
