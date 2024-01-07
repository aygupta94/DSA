package sorting;

import java.util.Arrays;

/**
 * In Hoare-partition we consider the first element as the pivot. We take two variable i=l-1, j=h+1,
 * where l and h are low and high index of array. We traverse through array, from left and right.
 * Whenever
 */
public class _10_QS_Hoare_Partition {

  public static void main(String[] args) {
    int[] arr = {5, 8, 4, 7, 5, 9, 10, 3,};
    int pivot_index = hoarePartition(arr, 0, arr.length - 1);
    System.out.println("pivot_index :"+ pivot_index);
    System.out.println(Arrays.toString(arr));
  }

  public static int hoarePartition(int []arr, int l, int h) {
    int i = l - 1, j = h + 1;
    int pivot = arr[l];
    while (true) {
      do {
        i++;
      } while (arr[i] < pivot);
      do {
        j--;
      } while (arr[j] >= pivot);
      if (i >= j) {
        return j;
      } else {
        swap(arr, i, j);
      }
    }

  }

  private static void swap(int arr[], int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
