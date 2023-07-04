package arrays.medium;

public class _3_LongestEvenOddSubArray {
    public static void main(String[] args) {
        int arr[] = {7, 10, 11, 12, 15}; // o/p = 5
        int arr2[] = {10, 12, 14, 7, 8}; // o/p = 3 {14,7,8}
        int arr3[] = {5, 10, 3,20, 4,6, 3, 8};
        System.out.println(maxEOArray(arr3));
    }

    static int maxEOArray(int arr[]) {
        int n = arr.length;
        int currCount = 1, res = 0;
        for (int i = 0; i < n - 1; i++) {
            if ((arr[i] % 2 == 0 && arr[i + 1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i + 1] % 2 == 0)) {
                currCount++;
            } else {
                currCount = 1;
            }
            res = Math.max(currCount, res);
        }

        return res;
    }
}
