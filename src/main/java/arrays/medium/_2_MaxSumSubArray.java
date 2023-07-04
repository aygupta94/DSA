package arrays.medium;

/**
 * SubArrays are contiguous element of array
 * ex {1,2,3} possible sub array are => {1}, {2}, {3}, {1,2}, {2,3}, {1,2,3}
 * Note: {1,3} is not subarray as they are not contiguous
 */
public class _2_MaxSumSubArray {
    public static void main(String[] args) {
        int arr[] = {2, 3, -8, 7, -1, 2, 3}; // 7+(-1)+2+3 = 11
        System.out.println(maxSum(arr));
    }

    static int maxSum(int arr[]) {
        int n = arr.length;
        int res = 0;
        int maxEnding = arr[0];
        for (int i = 1; i < n; i++) {
            maxEnding = Math.max(arr[i], maxEnding + arr[i]);
            res = Math.max(res, maxEnding);
        }

        return res;
    }


}
