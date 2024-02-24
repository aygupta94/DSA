package sorting;

import java.util.Arrays;

public class _12_kth_Samllest_Element {

    public static void main(String[] args) {
        int arr[] = {4, 3, 1, 5, 6, 2}; // 1,2,4,5,6,3
        int k = 3;
        int ele = kthSmallestElement(arr, 0, arr.length - 1, k);
        System.out.println("Ele: " + ele);
        System.out.println(Arrays.toString(arr));
    }


    private static int kthSmallestElement(int arr[], int low, int high, int k) {
        int p;
        if (high >= k - 1) {
            p = partition(arr, low, high);

            if (p == k - 1) {
                return arr[p];
            } else if (p > k - 1) {
                return kthSmallestElement(arr, low, p - 1, k);
            } else {
                return kthSmallestElement(arr, p + 1, high, k);
            }
        }
        return -1;
    }

    private static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1, j = low;

        while (j <= high - 1) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
            j++;
        }
        swap(arr, i + 1, high);
        return i + 1;

    }

    private static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
