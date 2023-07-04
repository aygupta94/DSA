package arrays.medium;

import java.util.Arrays;

public class _8_subArrayWithGivenSum {
    public static void main(String[] args) {
        int arr[] = {1, 4, 20, 3, 5, 10}; // sum =33, o/p -> yes {20,3,10}
        int arr2[] ={1,4,0,0,3,10,5}; // sum =7, o/p -> yes {4,0,0,3}
        int arr3[] ={1,5,3}; // sum=7, o/p-false
        int arr4[] ={4,8,12,5};
        System.out.println(isSubArrayPresent(arr,33));
        System.out.println(isSubArrayPresent(arr2,7));
        System.out.println(isSubArrayPresent(arr3,7));
        System.out.println(isSubArrayPresent(arr4,17));
    }

    static boolean isSubArrayPresent(int arr[], int sum) {
        int n = arr.length;
        int start=0, end =0;
        int currSum =0;
        for (int i = 0; i < n; i++) {

            if(currSum < sum){
                currSum += arr[i];
                end = i;
            } else {
                break;
            }
        }

        for(int i=start; i<end; i++)
        {
            if(currSum > sum)
            {
                currSum -= arr[i];
                if(currSum == sum)
                    return true;
            }
        }

        if(currSum == sum)
            return true;

        return false;
    }
}
