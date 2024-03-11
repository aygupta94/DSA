package Hashing.easy;

import java.util.Arrays;
import java.util.HashSet;

public class _8_LongestConsecutiveSubsequence {

  public static void main(String[] args) {
    int arr[] = {1, 9, 3, 2, 4, 20, 11, 12, 10, 13, 11};
//    int arr[] = {1, 2, 3, 4, 5};
    System.out.println(naive(arr));
    System.out.println(efficient(arr));
  }

  /* Dry run
i  count  res
0   1     1
1   2     2
2   3     3
3   0     3
4   1     3
5   2     3
6   3     3
7   4     4
 */
  static int naive(int arr[]) {
    int res = 0;
    int count = 0;
    Arrays.sort(arr);                          // 0 1 2 3 4 5  6  7  8  9
    for (int i = 0; i < arr.length - 1; i++) { // 1 2 3 4 9 10 11 12 13 20
      if (arr[i + 1] - arr[i] == 1) {
        count++;
      } else if (arr[i + 1] == arr[i]) {
        continue;
      } else {
        count = 0;
      }
      res = Math.max(res, count);

    }
    return res + 1;
  }


//  We do 2n lookup in set
//  TC: O(2n)
//  SC: O(n)
  static int efficient(int arr[]) {
    HashSet<Integer> set = new HashSet<>();
    int res = 0, count = 1;
    for (int j : arr) {
      set.add(j);
    }

    for (int x : set) {
      if (set.contains(x - 1) == false) {
        count = 1;
        while(set.contains(x+count))
        {
          count++;
        }
        res = Math.max(res, count);
      }
    }
    return res;
  }
}

