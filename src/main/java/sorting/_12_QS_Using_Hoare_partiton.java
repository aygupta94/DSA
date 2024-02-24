package sorting;

import java.util.Arrays;

public class _12_QS_Using_Hoare_partiton {

    public static void main(String[] args) {
        int arr[] = {6, 9, 3, 4, 1, 7, 4, 8, 10, 2};
        quickSortHoarePartition(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSortHoarePartition(int arr[], int l, int h)
    {
        if(l < h)
        {
            int p = hoarePartition(arr, l, h);
            quickSortHoarePartition(arr, l, p);
            quickSortHoarePartition(arr, p+1, h);
        }
    }

    private static int hoarePartition(int arr[], int l, int h) {
        int pivot = arr[l];
        int i = l - 1, j = h + 1;
        while (i < j) {
            do {
                i++;
            } while (arr[i] < pivot);

            do {
                j--;
            } while (arr[j] > pivot);
            if (i < j) {
                swap(arr, i, j);
            } else {
                return j;
            }
        }
        return j;
    }

    private static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
