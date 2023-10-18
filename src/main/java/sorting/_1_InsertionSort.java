package sorting;


import java.util.Arrays;

/**
 * O(n2) worst case
 * In-place and stable (In-place: does not use auxiliary space)
 * Preferred for small size array (Used in hybrid sorting algo like Tim sort and ItroSort)
 * O(n) in best case
 *
 * Idea: You traverse through each element in the array and place the ith element at its correct position.
 * In doing so the left side of the array becomes sorted, and its size increases till we reach the last position.
 *
 * Complication: How we will insert it at its correct position, we compare with previous elements and right sift them in array
 * Until the correct inserting position is reached
 */
public class _1_InsertionSort {

  public static void main(String[] args) {

    int arr[] = {20,5,40,60,10,30};
    sort(arr);
    System.out.println(Arrays.toString(arr));


  }

  private static void sort(int arr[])
  {

    for (int i = 1; i < arr.length ; i++) {

      int key = arr[i];
      int j = i-1;
                                   // 0 1  2  3  4
      while( j>=0 && arr[j] > key)  // 5 20 40 60 10 -> 5 20 40 60 60  -->  5 20 20 40 60
      {
        arr[j+1] = arr[j];
        j--;
      }

      arr[j+1] = key;

    }

  }
}
