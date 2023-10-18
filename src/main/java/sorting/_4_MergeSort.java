package sorting;

import java.util.Arrays;

public class _4_MergeSort {

  public static void main(String[] args) {
      int arr[] = {10,20,40,20,30};
    mergeSort(arr, 0 , arr.length-1);
    System.out.println(Arrays.toString(arr));
  }

  private static void mergeSort(int arr[], int low, int high)
  {
    if(high > low)
    {
      int mid = low + (high -low)/2;
      mergeSort(arr, low, mid);
      mergeSort(arr, mid+1, high);
      mergeFunction(arr, low, mid, high);
    }
  }

  private static int[] mergeFunction(int arr[], int low, int mid, int high) {
    int n1 = (mid + 1) - low;
    int n2 = high - mid;

    int left[] = new int[n1];
    int right[] = new int[n2];

    for(int i=0; i<n1; i++)
      left[i]= arr[low+i];

    for(int i=0; i<n2; i++)
      right[i]= arr[mid+1+i];

    int i = 0, j = 0, count=low;

    while (i < n1 && j < n2) {
      if (left[i] <= right[j]) {
        arr[count] = left[i];
        i++;
      } else {
        arr[count] = right[j];
        j++;
      }
      count++;
    }

    for (int k = i; k < n1; k++, count++) {
      arr[count] = left[k];
    }
    for (int k = j; k < n2; k++, count++) {
      arr[count] = right[k];
    }


    return arr;
  }
}
