package searching.medium;

public class _1_MedieanOf2SortedArray {

  /*
    Naive approach
     Median: element such that
        no of ele left of median == no of ele right of median.
     Median of these 2 array will be

     int temp[] = {5,10,15,20,25,30,35,45}
     n = temp.length();
     if( n %2 == 0)
        median = ((n/2) + ((n-1)/2))/2
     else
        median = (n/2);

        T.C = O((n1 + n2)*log(n1 + n2))
        A.s = O(n1 + n2)

        Using merge sort:
        TC = O(n1 + n2)

     */
  public static void main(String[] args) {

    int arr[]={10,20,30};
    int arr2[]={5,15,25,35,45};
    System.out.println(findMedian(arr, arr2));

  }

  private static double findMedian(int arr[], int arr2[])
  {
    int n1 = arr.length;
    int n2 = arr2.length;

    int begin = 0, end = n1;
    while(begin <= end) {
      int i1 = (begin + end) / 2; //initial min1 right of arr1 : i1 = 1
      int i2 = ((n1 + n2 + 1) / 2) - i1; //initial min2 right of arr2: i2 = 3
//      ============================================
      int min1 = (i1 ==n1)?Integer.MAX_VALUE : arr[i1]; // min1 = minimum element on right side of arr1;  min1 = 20
      int max1 = (i1 ==0)?Integer.MIN_VALUE : arr[i1-1]; // max1 = maximum element on left side of arr1;  max1 = 10
      int min2 = (i2 ==n2)?Integer.MAX_VALUE : arr2[i2]; // min2 = minimum element on right side of arr2;  min2 = 35
      int max2 = (i2 ==0)?Integer.MIN_VALUE : arr2[i2-1]; // max2 = maximum element on left side of arr2;  max2 = 25



      /*
      here we are actually forming 2 sets such that
          a1[0 ... i1-1]           a1[i1 ... n1]
          a2[0 ... i2-1]           a2[i2 ... n2]

      these 2 sets have equal no of elements, and the sets are divided my median value
      we are using BS to find that median

      ex: if these i1 and i2 are final:
        a1{10}          a1{20,30}   max1=10, min1=20
        a2{5,15,25}     a2{35,45}   max2=25, min2=35

        left half has 25 which is greater than 20 in right half
        So these value cannot be final
      */

      if(max1 <= min2 && max2 <= min1){
        //we have correct i1 and i2
        if((n1 + n2) % 2 == 0)
        {
          return (double) (Math.max(max1, max2) + Math.min(min1,min2) ) /2;
        } else {
          return (double) (Math.max(max1, max2));
        }
      } else if ( max1 > min2)
            end = i1 - 1;
      else
            begin = i1 + 1;


    }
    return -1d;

  }

}
