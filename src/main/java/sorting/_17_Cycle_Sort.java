package sorting;

import java.util.Arrays;

public class _17_Cycle_Sort {

  public static void main(String[] args) {
    int[] arr = {4, 2, 5, 2, 1};
    cycleSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static void cycleSort(int[] arr)
  {
    int n = arr.length;
    int pos, item;
    for(int cs=0; cs<n-1; cs++) {
      pos =cs;
      item = arr[cs];
      for(int start=cs+1; start < n; start++)
      {
        if(arr[start] < item)
        {
          pos++;
        }
      }

      if (pos == cs) {
        continue;
      }

      while (item == arr[pos]) {
        pos++;
      }

      item = swap(arr, item, pos); // 20, 20 , 10 , 50, 30 , item =40 , pos= 1

      while(pos != cs) {
        pos = cs;
        for(int start=cs+1; start < n; start++)
        {
          if(arr[start] < item)
          {
            pos++;
          }
        }
        while (item == arr[pos]) {
          pos++;
        }
        item = swap(arr, item, pos); // 10, 20 , 30 , 40, 50 , item =40 , pos= 0
      }

    }
  }

  public static int swap(int[] arr, int item, int index) {
    int temp = arr[index];
    arr[index] = item;
    item = temp;
    return item;
  }
}
