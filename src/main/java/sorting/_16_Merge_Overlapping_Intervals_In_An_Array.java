package sorting;

import java.util.Arrays;

public class _16_Merge_Overlapping_Intervals_In_An_Array {

  public static void main(String[] args) {
    Interval[] arr = { new Interval(5,10), new Interval(3,15), new Interval(18,30), new Interval(2,7)};
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    int res = mergeInterval(arr);
    for (int i = 0; i <= res ; i++) {
      System.out.print(arr[i] + ", ");
    }
  }

  public static int mergeInterval(Interval[] arr)
  {
    int res =0;

    for(int i=1; i< arr.length; i++)
    {
      if(arr[i].start <= arr[res].end )
      {
        arr[res].start = Math.min(arr[res].start, arr[i].start);
        arr[res].end = Math.max(arr[res].end, arr[i].end);
      } else {
        res++;
        arr[res] = arr[i];
      }
    }

    return res;
  }
}

class Interval implements Comparable<Interval> {

  int start;
  int end;

  public Interval(int start, int end) {
    this.start = start;
    this.end = end;
  }

  @Override
  public String toString() {
    return "{" +
         start +
        ", " + end +
        '}';
  }

  @Override
  public int compareTo(Interval interval) {
    return this.start - interval.start;
  }
}
