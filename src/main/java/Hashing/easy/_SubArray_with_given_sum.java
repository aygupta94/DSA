package Hashing.easy;

import java.util.ArrayList;
import java.util.HashSet;

public class _SubArray_with_given_sum {

  public static void main(String[] args) {
                                      // 5 8  6  3  13 -1
    int arr[] = {5, 8, 6, 3, 13, -1}; // 5 13 19 22 35 34
    int sum = 17;                   //-12  -4  2  5
    System.out.println(isSubArrayPresent(arr, sum));
    System.out.println(hasSubarrayWithSum(arr, sum));

  }

  static ArrayList<Integer> isSubArrayPresent(int arr[], int sum) {

    ArrayList<Integer> ans = new ArrayList<>();
    HashSet<Integer>  set = new HashSet<>();
    int indexI = 0, indexF = 0;
    int prefix_sum = 0;
    for (int i = 0; i < arr.length; i++) {
      prefix_sum += arr[i];

      if (prefix_sum - sum == 0) {
        indexF = i;
        break;
      }

      if (set.contains(prefix_sum-sum)) {
        for (int j = 0; j < arr.length; j++) {
          if(arr[j] == prefix_sum -sum)
          {
            indexI = j+1;
            break;
          }
        }
        indexF = i;
        break;
      }

      set.add(prefix_sum);
      indexF++;
    }

    for (int i = indexI; i <= indexF ; i++) {
      ans.add(arr[i]);
    }
    return  ans;

  }

  public static boolean hasSubarrayWithSum(int[] arr, int targetSum) {
    int n = arr.length;
    int start = 0, currentSum = 0;

    for (int end = 0; end < n; end++) {
      currentSum += arr[end];

      while (currentSum > targetSum && start < end) {
        currentSum -= arr[start];
        start++;
      }

      if (currentSum == targetSum) {
        System.out.println("Subarray with given sum found from index " + start + " to " + end);
        return true;
      }
    }

    System.out.println("No subarray with given sum found");
    return false;
  }

}
