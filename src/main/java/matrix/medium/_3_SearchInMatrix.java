package matrix.medium;

import java.util.Arrays;

/**
 * Given a Matrix sorted row and column wise
 */
public class _3_SearchInMatrix {

  public static void main(String[] args) {
    int arr[][] = {{10, 20, 30, 40},
        {15, 25, 35, 45},
        {27, 29, 37, 48},
        {32, 33, 39, 50}};

    int x = 36;
    search(arr, x);
  }

  /**
   * Begin traversal from top right corner. If arr[i][j] == x, return i,j; if arr[i][j] > x, we move
   * left in row, skipping whole column as all elements are greater in that column. if arr[i][j] <
   * x, we move down in column, as all elements in left of arr[i][j] are smaller in row.
   *
   * @param arr : arr matrix
   * @param x   : element to search
   */
  public static void search(int arr[][], int x) {

    int row = arr.length;
    int col = arr[0].length;

    int i = 0, j = col - 1;
    boolean found =false;
    while (i < row && j >= 0) {
      if (arr[i][j] == x) {
        System.out.println("(" + i + "," + j + ")");
        found =true;
        break;
      } else if (arr[i][j] > x) {
        j--;
      } else if (arr[i][j] < x) {
        i++;
      }
    }

    if(!found)
      System.out.println("Element not found");

  }

}

