package matrix.medium;

public class _4_DeterminantOfMatrix {

  public static void main(String[] args) {

    int arr[][] = {{10, 20, 30, 40},
        {15, 25, 35, 45},
        {27, 29, 37, 48},
        {32, 33, 39, 50}};

    int arr3[][] = {{1,2,3},
                    {4,5,6},
                    {7,8,9}};
    /**
     * 1 2 3
     * 4 5 6  => 1*(5*9 - 6*8) -2*{4*9 - 6*7) +3(4*8 - 5*7) => (45-48) - 2(42-36) +  3(32-35)
     * 7 8 9  => -3 - 2(-6) + 3(-3) => -3 + 12 -9 => 0
     */

    int arr2[][] = {
        {1,2},
        {3,4}
    };

    int matrix[][] = {{1, 0, 2, -1},
                      {3, 0, 0, 5},
                      {2, 1, 4, -3},
                      {1, 0, 5, 0}};
//    System.out.println(determinant(arr, arr.length));
//    System.out.println(determinant(arr2, arr2.length));
    System.out.println(determinant(arr3, arr3.length));
//    System.out.println(determinant(matrix, matrix.length));

   }

   static int determinant(int arr[][], int n) {

    int determinant = 0;

    if(n==1)
      return arr[0][0];

    if(n==2)
      return arr[0][0]*arr[1][1] - arr[0][1]*arr[1][0];

    for(int i=0; i<n; i++) {
      determinant += arr[0][i]*cofactor(arr, 0, i);
    }

    return determinant;
   }

  private static int cofactor(int[][] arr, int row, int col) {
    int n = arr.length;
    int minorRow =0;
    int minorArr[][] = new int[n-1][n-1];
    for(int i=0; i<n; i++) {
      if(i == row)
        continue;
      int minorCol=0;
      for(int j=0; j<n; j++) {
        if (j == col) continue;
        minorArr[minorRow][minorCol] = arr[i][j];
        minorCol++;
      }
      minorRow++;
    }

    int sign = (row+col %2 ==0) ? 1 : -1;
    return sign * determinant(minorArr, minorArr.length);
  }

}
