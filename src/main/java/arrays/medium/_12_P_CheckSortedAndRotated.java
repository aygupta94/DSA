package arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;

public class _12_P_CheckSortedAndRotated {

    public static void main(String[] args) {
        int arr[] = {3,4,1,2};
    }

    static boolean checkArray(int []arr, int n) {
        // Your code here
        int min = Integer.MAX_VALUE;
        int minIndex = 0, count = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }

        return false;
    }

}
