package Hashing.easy;

import java.util.HashSet;

public class _3_SubArrayWithZeroSum {

    public static void main(String[] args) {
        int arr[] ={1,4,13,-3,-10,5}; // 1 5 18 15 5 10
    }

    static boolean isSubArrayPresent(int arr[])
    {
        HashSet<Integer> set = new HashSet<>();
        int currentSum = arr[0], prefixSum = arr[0];
        if(currentSum == 0)
            return true;
        for (int i = 1; i < arr.length; i++) {
            currentSum += arr[i];
            if(set.contains())
        }

    }
}
