package sorting;

import java.util.Arrays;

/**
 * Given chocolates as an array and m as no of children.
 * We have to distribute this chocolates in this m students such that the distribution is fair.
 * Fair distribution is when the difference of min and max chocolates is min.
 */
public class _13_Chocolate_Distribution {

  public static void main(String[] args) {
    int[] arr = {7,3, 2,4,9,12,56};
    int m = 3;
    System.out.println(minDiff(arr, m));
  }

  private static int minDiff(int[] arr, int m)
  {
    int n = arr.length;
    Arrays.sort(arr);
    int min_diff = arr[m-1] -arr[0];
    for (int i=1; i+m-1<n; i++)
    {
      min_diff = Math.min(min_diff, arr[i+m-1]-arr[i]);
    }

    return min_diff;
  }

}
