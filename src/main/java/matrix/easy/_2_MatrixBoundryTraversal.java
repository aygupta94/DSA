package matrix.easy;

/**
 * TC : Theta(R+C)
 */
public class _2_MatrixBoundryTraversal {

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}
        };

        int arr2[][] = {{1},{2},{3},{4}};
        printBoundary(arr);
    }

    public static void printBoundary(int arr[][]) {

        int row = arr.length;
        int col = arr[0].length;

        if (row == 1) {
            for (int i = 0; i < col; i++) {
                System.out.print(arr[0][i] + " ");
            }
        } else if (col == 1) {
            for (int i = 0; i < row; i++) {
                System.out.print(arr[i][0] + " ");
            }
        } else {

            for (int j = 0; j < col; j++) {
                System.out.print(arr[0][j] + " ");
            }
            for (int j = 1; j < row; j++) {
                System.out.print(arr[j][col - 1] + " ");
            }
            for (int j = col - 2; j >= 0; j--) {
                System.out.print(arr[row - 1][j] + " ");
            }
            for (int j = row - 2; j >= 1; j--) {
                System.out.print(arr[j][0] + " ");
            }
        }
    }
}
