package arrays.medium;

import java.util.Arrays;

public class _4_MaxCircularSumSubArray {

    public static void main(String[] args) {
        int arr[] = {5,-2,3,4}; // Normal subarray => {5}, {-2}, {3}, {4}, {5,-2}, {-2,3}, {3,4}, {5,-2,3}, {-2,3,4}, {5,-2,3,4}
                                // circlar => {3,4,5}, {4,5,-2}, {3,4,-2,5}, {4,5,-2, 3}
        /**
         * IDEA: Take the maximum of below two
         *  1. Maximum of normal subaray (kodane's algorithm)
         *  2. Maximum of circular subarray (how to find this?)
         *          step 1: find the minimum sum of normal subarray
         *          step 2: subtract min sum  from total sum
         *    ex: {5,-2,3,4} = total sum => 10
         *                     min sum = -2
         *                     max circular sum = 10 - (-2) = 12
         */

        int arr2[] = {-8, -3};
        System.out.println(maxCircularSum(arr2));
    }

    static int maxCircularSum(int arr[])
    {
        int n= arr.length;
        int maxEnding = arr[0];
        int minEnding = arr[0];
        int maxSum =arr[0];
        int minSum =arr[0];
        int totalSum = Arrays.stream(arr).reduce(0, (a,b) -> a+b);

        //Maximum Sum
        for (int i = 1; i < n; i++) {
            maxEnding = Math.max(arr[i], maxEnding + arr[i]);
            maxSum = Math.max(maxSum, maxEnding);
        }

        if(maxSum < 0)
            return maxSum;

        //Minimum Sum
        for (int i = 1; i < n; i++) {
            minEnding = Math.min(arr[i], minEnding + arr[i]);
            minSum = Math.min(minSum, minEnding);
        }

        //Circular sum
        int circularSum = totalSum - minSum;
        return Math.max(maxSum, circularSum);
    }

}
