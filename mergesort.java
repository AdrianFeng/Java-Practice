package Sorting;

/**
 * Created by zhenfeng on 12/21/15.
 */
public class MergeSort {
    public static void sort(int[] arr) {
        int[] temp = new int[arr.length];
        mergesort(arr, temp,0,arr.length-1);
        return;
    }

    public static void mergesort(int[] arr, int[] temp, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        mergesort(arr, temp, start, mid);
        mergesort(arr, temp, mid + 1, end);
        for (int i = start; i <= end; i++) {
            temp[i] = arr[i];
        }
        int cursor=start;
        int firstStart=start;
        int secondStart=mid+1;
        while((firstStart<=mid) && (secondStart<=end)){
            if (temp[firstStart]<=temp[secondStart]){
                arr[cursor]=temp[firstStart];
                firstStart++;
            }
            else{
                arr[cursor]=temp[secondStart];
                secondStart++;
            }
            cursor++;
        }
        while(firstStart<=mid){
            arr[cursor]=temp[firstStart];
            firstStart++;cursor++;
        }
        while (secondStart<=end){
            arr[cursor]=temp[secondStart];
            secondStart++;cursor++;
        }
    }
}
