package Hashing.hard;

import java.util.HashMap;
import java.util.Map.Entry;

public class _10_MoreThanNByKOccurence {

  public static void main(String[] args) {
    int arr[] = {30, 10, 20, 20, 20, 10, 40, 30, 30,40,5,10,7,40};
    int k = 5; //  9/4 = 2.25
    naive(arr, k);
    System.out.println();
    optimal(arr, k);
  }

  static void naive(int arr[], int k) {

    int n = arr.length;
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int x : arr) {
      map.put(x, map.getOrDefault(x, 0) + 1);
    }

    for (Entry<Integer, Integer> x : map.entrySet()) {
      if (x.getValue() > (n / k)) {
        System.out.print(x.getKey() + " ");
      }
    }

  }

  //The problem with above approach if n is very large, then we will have to create a very large map

  static void optimal(int arr[], int k) {
    int n = arr.length;
    HashMap<Integer, Integer> map = new HashMap<>();


    for (int x : arr) {

      if (!map.containsKey(x) && map.size() < k) {
        map.put(x, map.getOrDefault(x, 0) + 1);
      }

      if (map.size() > k) {
        for (Entry<Integer, Integer> y : map.entrySet()) {
          int freq = y.getValue();
          if (freq - 1 <= 0) {
            map.remove(y.getKey());
          } else {
            map.put(y.getKey(), freq - 1);
          }
        }
      }
    }

    for (Entry<Integer, Integer> e : map.entrySet()) {
      int count = 0;
      for (int x : arr) {
        if (e.getKey() == x) {
          count++;
        }
      }
      if (count > (n / k)) {
        System.out.print(e.getKey() + " ");
      }
    }

  }

}
