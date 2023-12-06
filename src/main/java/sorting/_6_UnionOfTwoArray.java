package sorting;

public class _6_UnionOfTwoArray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 3, 4, 4};
        int arr2[] = {2, 3, 4, 4, 5, 6};

        union(arr, arr2);
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

        while (i > 0 && i < n) {
            if (arr[i] != arr[i - 1]) {
                System.out.print(arr[i] + " ");

            }
            i++;
        }

        while (j > 0 && j < m) {
            if (arr2[j] != arr2[j - 1]) {
                System.out.print(arr2[j] + " ");

            }
            j++;
        }

    }
}
