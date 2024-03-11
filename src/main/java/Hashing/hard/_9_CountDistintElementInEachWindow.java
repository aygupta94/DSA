package Hashing.hard;

import java.util.HashMap;
import java.util.HashSet;

public class _9_CountDistintElementInEachWindow {

  public static void main(String[] args) {

    int arr[] = {10, 10, 5, 3, 20, 5};
    int k = 4;
    naive(arr, k);
    System.out.println();
    efficient(arr, k);
  }

  /*
  Windows: n-k+1 = 6-4+1 = 3
  {10,10,5,3}
  {10,5,3,20}
  {5,3,20,5}
   */

  static void naive(int arr[], int k) {

    int n = arr.length; // 6
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < n - k + 1; i++) {
      for (int j = i; j < i + k; j++) {
        set.add(arr[j]);
      }
      System.out.print(" " + set.size());
      set = new HashSet<>();
    }

  }

  static void efficient(int arr[], int k) {
    int n = arr.length;
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < k; i++) {
        map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

    }
    System.out.print(" " + map.size());

    for (int i = k; i < n; i++) {
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
      int freq = map.get(arr[i - k]);
      freq--;
      if (freq > 0) {
        map.put(arr[i - k], freq);
      } else {
        map.remove(arr[i - k]);
      }
      System.out.print(" " + map.size());
    }
  }

}
