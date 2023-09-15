package searching.medium;

import java.util.Arrays;

public class _3_AllocateMaximumPages {

  public static void main(String[] args) {
    int arr[] = {10, 20, 10, 30, 20, 10,20};
    int arr2[] = {10,5,20};
    int k = 3;
    System.out.println(findMaxPages(arr, k));
  }

  private static int findMaxPages(int arr[], int k) {
    int maxPages = Arrays.stream(arr).sum();    //100
    int low = Arrays.stream(arr).max().getAsInt(); //30
    int high = maxPages;
    int res = 0;

    while (low <= high) {
      int mid = (low + high) / 2;   //65
      if (isFeasible(arr, k, mid)) {
        high = mid - 1;
        res = mid;
      } else {
        low = mid + 1;
      }
    }
    return res;
  }

  private static boolean isFeasible(int arr[], int k, int ans) {
    int student = 1;
    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
      if (sum + arr[i] > ans) {
        student++;
        sum = arr[i];
      } else {
        sum += arr[i];
      }
    }
    return student <= k;
  }
}
