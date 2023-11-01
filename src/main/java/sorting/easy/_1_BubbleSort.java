package sorting.easy;

import java.util.Arrays;

/**
 * Main Idea is in every outer loop iteration we move the largest element to last.
 * For this we compare the adjacent elements only
 * Bubble sort is a stable sorting algorithm
 * We can optimise it for if array is already sorted by introducing a flag.
 *
 * TC: O(n^2)
 * AS: 1
 */
public class _1_BubbleSort {
    public static void main(String[] args) {
        int arr[] = {2, 10, 8, 7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        sortOptimized(arr);
        System.out.println(Arrays.toString(arr));

        int arr2[] = {6, 8, 6, 6};
        sortOptimized(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    private static void sort(int arr[]) {
        int n = arr.length, pass = 0;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) //--> (n-1) + (n-2) + ... + 2 + = n * (n-1) >> 2 = > O(n^2)
            {
                pass++;
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        System.out.println("Total Pass: " + pass);
    }

    private static void sortOptimized(int arr[]) {
        int n = arr.length, pass = 0;
        boolean swapped = false;
        for (int i = n; i > 0; i--) {
            swapped = false;
            for (int j = 0; j < i - 1; j++) //--> (n-1) + (n-2) + ... + 2 + = n * (n-1) >> 2 = > O(n^2)
            {
                pass++;
                if (arr[j] > arr[j + 1]) {
                    swapped = true;
                    swap(arr, j, j + 1);
                }
            }

            if (swapped == false) {
                break;
            }
        }
        System.out.println("Total Pass: " + pass);
    }

    private static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
