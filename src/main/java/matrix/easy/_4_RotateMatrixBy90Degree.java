package matrix.easy;

public class _4_RotateMatrixBy90Degree {

    public static void main(String[] args) {

        int arr[][]= {{1,2,3,11}, {4,5,6,12},{7,8,9,13}, {14,15,16,17}};

        rotate90(arr);
    }

    public static void rotate90(int arr[][]) {

        int row = arr.length;
        int col = row;

        for(int i=0; i<row; i++)
        {
            for(int j=i+1;j<col; j++)
            {
                int temp = arr[i][j]; // arr[0][1] = 2;
                arr[i][j] = arr[j][i]; // arr[1][0] = 4
                arr[j][i] = temp;
            }
        }

        int n = row-1;

        //reverse each row
        for(int i=0; i<col;i++)
        {
            int low = 0, high = n;
            while(low < high)
            {
                int temp = arr[low][i]; // arr[0][2] =2
                arr[low][i] = arr[high][i]; // arr[2][1] = 8
                arr[high][i] = temp;
                low++;
                high--;
            }
        }

        for(int i=0; i<row; i++)
        {
            for(int j=0;j<col; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}
