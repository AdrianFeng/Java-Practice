package Sorting;

import java.util.Arrays;

/**
 * Created by zhenfeng on 12/20/15.
 */
public class SortingTest {
    public static void main(String[] args) {
        int[] array = {3, 4, 1, 5, 6, 8, 1, 9, 10, 56, 32, 7, 2, 9, 6};
        System.out.println("before sorting is" + Arrays.toString(array));
        //BubbleSort.sort(array);
        //SelectionSort.sort(array);
        //InsertSort.sort(array);
        //ShellSort.sort(array);
        //QuickSort.sort(array);
        MergeSort.sort(array);
        System.out.println("after sorting is" + Arrays.toString(array));
        int[] array1 = {3, 4, 1, 5, 6, 8, 1, 9, 10, 56, 32, 7, 2, 9, 6};
        int k = 9;
        int result = KthLargest.findKthLargest(array1, k);
        System.out.println("the " + k+"th largest value is "+result);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return;
    }
}
