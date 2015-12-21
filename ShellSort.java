package Sorting;

/**
 * Created by zhenfeng on 12/20/15.
 */
public class ShellSort {
    public static void sort(int[] arr) {
        int length = arr.length;
        for (int i = length / 2; i > 2; i /= 2) {
            for (int j = 0; j < i; j++) {
                insertSort(arr, j, i);
            }
        }
        insertSort(arr, 0, 1);

    }

    public static void insertSort(int[] arr, int start, int sep) {
        int length = arr.length;
        for (int i = start + sep; i < length; i += sep) {
            for (int j = i; (j >= sep && arr[j] < arr[j - sep]); j -= sep) {
                SortingTest.swap(arr, j, j - sep);
            }
        }
    }
}
