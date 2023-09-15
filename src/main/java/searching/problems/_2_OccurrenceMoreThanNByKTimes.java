package searching.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class _2_OccurrenceMoreThanNByKTimes {

  public static void main(String[] args) {
    int arr[] = {3,1,2,2,1,2,3,3};
    int k=4;
    System.out.println(occurrences(arr,k));
  }

  static int occurrences(int arr[], int k)
  {
    Map<Integer, Integer> map = new HashMap();
    int n= arr.length, count=0;
    for(int i=0; i<n; i++)
    {
      if(!map.containsKey(arr[i]))
      {
        map.put(arr[i], 1);
      } else {
        int value = map.get(arr[i]);
        map.put(arr[i], value+1);
      }

    }

    Set<Entry<Integer, Integer>> entries = map.entrySet();

    for(Map.Entry<Integer, Integer> entry : map.entrySet())
    {
      if(entry.getValue() > n/k)
          count++;
    }

    return count;

  }

}
