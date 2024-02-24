package matrix.easy;

public class _3_TransposeOfAMatrix {

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int arr2[][] = {{1},{2},{3},{4}};

        int arr3[][] = {{1,2,3,4}};

        printSquareTranspose(arr);
        System.out.println();
        printTranspose(arr2);
        System.out.println();
        printTranspose(arr3);
    }

    public static void printSquareTranspose(int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;

        for(int i=0; i<row; i++)
        {
            for(int j=i+1;j<col; j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i=0; i<col; i++)
        {
            for(int j=0;j<row; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printTranspose(int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;

        int tranArr[][] = new int[col][row];

        for(int i=0; i<row; i++)
        {
            for(int j=0;j<col; j++)
            {
                tranArr[j][i] = arr[i][j];
            }
        }

        for(int i=0; i<col; i++)
        {
            for(int j=0;j<row; j++)
            {
                System.out.print(tranArr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
