package sorting;

public class _6_UnionOfTwoArray {

    public static void main(String[] args) {
//        int arr1[] = {1, 2, 3, 3, 3, 4, 4};
        int arr1[] = {1};
        int arr2[] = {7, 9 ,11, 14};
//        int arr2[] = {2, 3, 4, 4, 5, 6};

        union(arr1, arr2);
    }

    private static void unionNaive(int arr[], int arr2[]) {
        /**
         * create a array of m+n
         * put arr elements in new array
         * put arr2 elements in new array
         * sort new array
         * print distinct element
         */
    }

    private static void union(int arr[], int arr2[]) {
        int n = arr.length;
        int m = arr2.length;

        int i = 0, j = 0;

        while (i < n && j < m) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                i++;
                continue;
            }
            if (j > 0 && arr2[j] == arr2[j - 1]) {
                j++;
                continue;
            }

            if (arr[i] < arr2[j]) {
                System.out.print(arr[i] + " ");
                i++;
            } else if (arr[i] > arr2[j]) {
                System.out.print(arr2[j] + " ");
                j++;
            } else {
                System.out.print(arr[i] + " ");
                i++;
                j++;
            }


        }

        while (i < n) {
            if (i > 0 && arr[i] != arr[i - 1]) {
                System.out.print(arr[i] + " ");

            }
            i++;
        }

        while (j < m) {
            if(j==0)
            {
                System.out.print(arr2[j] + " ");
                j++;
            }
            else if (j > 0  && arr2[j] != arr2[j - 1]) {
                System.out.print(arr2[j] + " ");

            }
            j++;
        }

    }
}
