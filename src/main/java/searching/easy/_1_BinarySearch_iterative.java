package searching.easy;

public class _1_BinarySearch_iterative {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 8, 13, 42, 53, 325, 333};
        int[] inp2 = {10, 15};
        int[] inp3 = {10, 10};
        System.out.println(findElementIndex(arr, 5));
        System.out.println(findElementIndex(inp2, 20));
        System.out.println(findElementIndex(inp2, 5));
        System.out.println(findElementIndex(inp3, 10));

    }

    private static int findElementIndex(int[] arr, int ele) {
        int n = arr.length;
        int low = 0, high = n-1, mid;


        while (low <= high) {
            mid = (low + high) / 2;
            if (ele == arr[mid]) {
                return mid;
            }


            if (ele < arr[mid]) {
                high = mid-1;

            } else {
                low = mid + 1;

            }
        }

        return -1;
    }

}
