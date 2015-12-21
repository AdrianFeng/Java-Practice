package Sorting;

/**
 * Created by zhenfeng on 12/20/15.
 */
public class QuickSort {
    public static void sort(int[] arr) {
        Sort(arr,0,arr.length-1);
    }

    public static void Sort(int[] arr, int start, int end) {
        if (start < end) {
            int pivot = partation(arr, start, end);
            Sort(arr, start, pivot - 1);
            Sort(arr, pivot + 1, end);
        }
        return;
    }

    public static int partation(int[] arr, int start, int end) {
        int pivotVal = arr[end];
        int lower = start;
        for (int i = lower; i < end; i++) {
            if (arr[i] <= pivotVal) {
                SortingTest.swap(arr, lower, i);
                lower++;
            }
        }
        SortingTest.swap(arr, lower, end);
        return lower;
    }
}
