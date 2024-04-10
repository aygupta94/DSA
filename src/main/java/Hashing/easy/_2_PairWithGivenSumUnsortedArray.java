package Hashing.easy;

import java.util.Arrays;
import java.util.HashSet;

public class _2_PairWithGivenSumUnsortedArray {

    public static void main(String[] args) {
        int arr[] = {2,3,6};
        int sum = 8; // 15+2
        System.out.println(isPairNaive(arr, sum));
        System.out.println(isPair2Pointer(arr, sum));
        System.out.println(isPairHashSet(arr, sum));
    }

//    TC: O(n2)
    static boolean isPairNaive(int arr[], int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i] + arr[j] == sum)
                    return true;
            }
        }

        return false;
    }

//    TC: O(nlogn);
    static boolean isPair2Pointer(int arr[], int sum) {
        Arrays.sort(arr); // {-8, 2, 3, 8, 15}
        int low=0, high = arr.length -1;

        while(low < high) {
            if(arr[low] + arr[high] == sum)
                return true;
            else if (arr[low] + arr[high] < sum) {
                low++;
            } else {
                high--;
            }
        }

        return false;
    }

//    TC: O(n);
//    AS: O(n)
    static boolean isPairHashSet(int arr[], int sum) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(set.contains((sum - arr[i])))
                return true;
            else
                set.add(arr[i]);
        }

        return false;
    }
}
