package Hashing.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class _9_EqualArrays {

  public static void main(String[] args) {
    long arr[] = {1, 2 , 3, 4, 5, 4};
    long arr2[] = {5,4,4,2,1};
    System.out.println(check(arr, arr2, arr.length));
  }

  public static boolean check(long A[],long B[],int N)
  {
    //Your code here
    HashMap<Long, Long> map = new HashMap();
    HashMap<Long, Long> map2 = new HashMap();

    for(long x: A) {
      map.put(x, map.getOrDefault(x, 0l) + 1l);
    }

    for(long y: B) {
      map2.put(y,map2.getOrDefault(y, 0l) + 1l);
    }

    for(Entry<Long, Long> e: map.entrySet()) {
      if(map2.containsKey(e.getKey())) {
        long freq = map2.get(e.getKey());
        if(!(freq == e.getValue())) {
          return false;
        }
      } else {
        return false;
      }
    }

    return true;

  }

}
