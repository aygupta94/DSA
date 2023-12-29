package sorting;

/**
 * 1. Uses Divide and conquer strategy.
 * 2. Works in nlog(n) with A.S O(n).
 * 3. It is stable algorithm but not in-place
 * 4. Well suited for linked list. works with O(1) aux space.
 * 5. Used in external
 * sorting. (chunks of array can be sorted, making whole array sorted)
 * 6. For arrays, quick sort out performs merge sort.
 * 7. python uses Tim sort variation of ( merge sort + insertion sort)
 */

/**
 * Merge two sorted arrays
 */
public class _2_Print2MergedStortedArray {

  public static void main(String[] args) {

    int arr1[] = {10, 15, 20, 30, 45, 67};
    int arr2[] = {5, 6, 12, 15};
    printMergedSortedArray(arr1, arr2);

  }

  // o/p : 5 6 10 12 15 15 20 30 45 67

  private static void printMergedSortedArray(int arr1[], int arr2[]) {
    int n1 = arr1.length;
    int n2 = arr2.length;

    //p1 and p2 are 2 variable to keep track till where we have moved in the array

    int p1 = 0, p2 = 0;
    while (p1 < n1 && p2 < n2) {
      if (arr1[p1] >= arr2[p2]) {
        System.out.print(arr2[p2] + " ");
        p2++;
      } else {
        System.out.print(arr1[p1] + " ");
        p1++;
      }
    }

      for(int i=p2; i < n2; i++)
        System.out.print(arr2[i] + " ");

      for(int i=p1; i < n1; i++)
        System.out.print(arr1[i] + " ");

  }

}
