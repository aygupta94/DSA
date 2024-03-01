package Hashing.easy;

import java.util.HashMap;
import java.util.HashSet;

public class _2_LongestSubArrayWithGivenSum {

  public static void main(String[] args) {
//    int arr[] = {3, 8, 0, 1, 2, 3, 4, 6}; //
    int sum = 0;
    int arr[] = {5, 8, -4, -4, 9, -2, 2};
    System.out.println(naiveSolution(arr, sum));
    System.out.println(efficientSolution(arr, sum));
    System.out.println(efficientSolutionUsingHashMap(arr, sum));
  }

  static int naiveSolution(int arr[], int sum) {
    int currSum = 0;
    int res = 0;
    for (int i = 0; i < arr.length; i++) {
      currSum = 0;
      for (int j = i; j < arr.length; j++) {
        currSum += arr[j];
        if (currSum == sum) {
          res = Math.max(res, j - i + 1);
        }
      }

    }
    return res;
  }

  static int efficientSolution(int arr[], int sum) {
    int prefixSum = 0, res = 0, indexI = 0;
    int currSum = 0;
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      prefixSum += arr[i];

      if (prefixSum - sum == 0) {
        res = Math.max(res, i + 1);
      }

      if (set.contains(prefixSum - sum)) {
        for (int j = 0; j < arr.length; j++) {
          currSum += arr[j];
          if (currSum == prefixSum - sum) {
            indexI = j + 1;
            currSum = 0;
            break;
          }
        }
        res = Math.max(res, i - indexI + 1);
      }

      set.add(prefixSum);

    }
    return res;
  }

  static int efficientSolutionUsingHashMap(int arr[], int sum) {
    HashMap<Integer, Integer> map = new HashMap();
    //arr = [10,5,2,3]
    int prefixSum = 0, res = 0;
    for (int i = 0; i < arr.length; i++) {
      prefixSum += arr[i];

      if (prefixSum == sum) {
        res = i + 1;
      }

      if (map.containsKey(prefixSum) == false) {
        map.put(prefixSum, i);
      }

      if (map.containsKey(prefixSum - sum)) {
        res = Math.max(res, i - map.get(prefixSum - sum));
      }
    }
    return res;
  }

}
