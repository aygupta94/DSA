package matrix.medium;

public class _5_PrintMatrixInSpiral {

    public static void main(String[] args) {

        int arr[][]= {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        int arr2[][]= {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}, {17,18,19,20}, {21,22,23,24}};
        printSpiral(arr);
    }

    public static void printSpiral(int arr[][])
    {
        int row = arr.length;
        int col = arr[0].length;

        int top=0, bottom= row-1, right = col-1, left =0;

        if(row == 1) {
            for (int i = 0; i < col; i++) {
                System.out.print(arr[0][i] + " ");
            }
        } else if (col == 1) {
            for (int i = 0; i < row; i++) {
                System.out.print( arr[i][0] + " ");
            }
        } else {
            while(top <= bottom && left <= right) {

                for (int i = left; i <= right; i++) {
                    System.out.print(arr[top][i] + " ");
                }
                top++;
                for (int i = top; i <= bottom ; i++) {
                    System.out.print(arr[i][right] + " ");
                }
                right--;
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
                for (int i = bottom; i >= top ; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }

    }
}
