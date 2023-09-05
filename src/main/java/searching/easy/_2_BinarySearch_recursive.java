package searching.easy;

public class _2_BinarySearch_recursive {
    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 8, 10};
        System.out.println(findElement(arr, 0, arr.length - 1, 20));
    }

    /*
      Important points:
      No of recursive calls is = ceil[log2N]
      N = no of elements in array
     */

    private static int findElement(int arr[], int low, int high, int ele) {
        int n = arr.length;
        int mid = (low + high) / 2;

        if (ele == arr[mid]) {
            return mid;
        }

        if (low >= high) {
            return -1;
        }

        if (ele < arr[mid]) {
            return findElement(arr, low, mid - 1, ele);
        } else {
            return findElement(arr, mid + 1, high, ele);
        }

    }
}
