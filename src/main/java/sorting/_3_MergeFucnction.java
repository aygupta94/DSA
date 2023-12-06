package sorting;

import java.util.Arrays;

/**
 * Give a array such that it is left and right array are sorted and divided by a middle element.
 * Your task is to sort the array
 */
public class _3_MergeFucnction {

  public static void main(String[] args) {
    int arr[] = {10, 15, 20, 40, 8, 11, 55};
    int low = 0, mid = 3, high = 6; //indexes
    int newArr[] = mergeFunction(arr, low, mid, high);

    System.out.println(Arrays.toString(newArr));
  }

  private static int[] mergeFunction(int arr[], int low, int mid, int high) {
    int n1 = (mid + 1) - low;
    int n2 = high - mid;
    int mergeArray[] = new int[n1 + n2];

    int i = low, j = mid+1, count = 0;

    while (i < n1+low && j < high+1) {
      if (arr[i] <= arr[j]) {
        mergeArray[count] = arr[i];
        i++;
      } else {
        mergeArray[count] = arr[j];
        j++;
      }
      count++;
    }

    for (int k = i; k < n1+low; k++, count++) {
      mergeArray[count] = arr[k];
    }
    for (int k = j; k < high+1; k++, count++) {
      mergeArray[count] = arr[k];
    }

    return mergeArray;
  }

}
