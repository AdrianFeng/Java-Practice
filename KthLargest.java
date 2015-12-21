package Sorting;

import java.util.ArrayList;

/**
 * Created by zhenfeng on 12/20/15.
 */
public class KthLargest {


    public static int findKthLargest(int[] arr, int k) {
        return find(arr, 0, arr.length - 1, k);
    }

    public static int find(int[] arr, int start, int end, int k) {
        int pivotIndex = partation(arr, start, end);
        if (pivotIndex == k - 1) {
            return arr[k - 1];
        } else if (pivotIndex < k - 1) {
            return find(arr, pivotIndex + 1, end, k);
        } else {
            return find(arr, start, pivotIndex - 1, k);
        }
    }

    public static int partation(int[] arr, int start, int end) {
        int pivotVal = arr[end];
        int bound = start;
        for (int i = start; i < end; i++) {
            if (arr[i] >= pivotVal) {
                SortingTest.swap(arr, bound, i);
                bound++;
            }
        }
        SortingTest.swap(arr, bound, end);
        return bound;
    }
}
