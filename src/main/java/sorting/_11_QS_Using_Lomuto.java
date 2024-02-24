package sorting;

import java.util.Arrays;

public class _11_QS_Using_Lomuto {

    public static void main(String[] args) {
        int arr[] = {2, 9,3, 4,1, 7, 4, 8, 10, 6};
        quickSortUsingLomuto(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSortUsingLomuto(int arr[], int low, int high)
    {
        if(low < high)
        {
          int p = lomutoPartion(arr, low, high);
            quickSortUsingLomuto(arr, low, p-1);
            quickSortUsingLomuto(arr, p+1, high);
        }
    }

    private static int lomutoPartion(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1, j = low;
        while (j <= high - 1) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j); // {2,9,4,3,1,7,4,8,10,6};
            }
            j++;
        }
        swap(arr, i+1, high);
        return i+1;
    }

    private static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
