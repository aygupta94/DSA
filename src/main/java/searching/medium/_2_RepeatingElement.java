package searching.medium;

import java.util.Arrays;

/*
1. Given arr size n >= 2;
2. Only one element repeats any no of time.
3. 0<= max(arr) <= n-2

I/p = {0,2,1,3,2,2}
O/p = 2

 */
public class _2_RepeatingElement {

  public static void main(String[] args) {
    int arr[] = {1, 2, 5, 3, 4, 2, 0};
    int arr2[] =  {0,2,1,3,4,2};
    System.out.println(findRepeating4(arr2));
  }

  // TC = O(n2)
  private static int findRepeating1(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      for (int j = 1; j < n; j++) {
        if (arr[i] == arr[j]) {
          return arr[i];
        }
      }
    }

    return -1;
  }

//  TC = O(nlogn)
//also we change the original array
  private static int findRepeating2(int arr[]) {
    int n = arr.length;
    Arrays.sort(arr);

    for (int i = 0; i < n - 1; i++) {
      if (arr[i] == arr[i + 1]) {
        return arr[i];
      }
    }
    return -1;
  }

//  TC = O(n)
//  AS = O(n)
  private static int findRepeating3(int arr[])
  {
    int n = arr.length;
    boolean temp[] = new boolean[n];
    Arrays.fill(temp , false);

    for(int i=0; i<n; i++)
    {
      if(temp[arr[i]])
        return arr[i];

      temp[arr[i]] = true;
    }

    return -1;
  }

  //efficient solution
  /*
  We are going to use the popular two-step algorithm which is used to find the
  loop in the linked list.
  arr = {1, 2, 5, 3, 4, 2, 0};

  2 -> 6 -> 1 -> 3 -> 4 -> 5 -> /
                  \<-----------/

  when we reach arr[5] it comes back to 2 which is our repeating element.
  We have to find this element only

                              slow    fast
  1. arr[0] + 1   = 1+1 = 2     2       2
  2. arr[2] + 1   = 5+1 = 6     6       1
  3. arr[6] + 1   = 0+1 = 1     1       4
  4. arr[1] + 1   = 2+1 = 3     3       3
  5. arr[3] + 1   = 3+1 = 4     4       5
  6. arr[4] + 1   = 4+1 = 5     5       4
  7. arr[5] + 1   = 2+1 = 3     3       3

  1. arr[0] + 1      = 1+1 = 2
  2. arr[arr[2] + 1] + 1 = arr[5+1] + 1 = 0+1 = 1
  3. arr[arr[1] + 1] + 1 = arr[2+1] + 1 = 3+1 = 4
  4. arr[arr[4] + 1] + 1 = arr[4+1] + 1 = 2+1 = 3
  5. arr[arr[3] + 1] + 1 = arr[3+1] + 1 = 4+1 = 5
  6. arr[arr[5] + 1] + 1 = arr[2+1] + 1 = 3+1 = 4
  7. arr[arr[4] + 1] + 1 = arr[4+1] + 1 = 2+1 = 3
   */

  private static int findRepeating4(int arr[])
  {
    int slow= arr[0] + 1, fast = arr[0] + 1;

    do{
      slow = arr[slow] + 1;
      fast = arr[arr[fast] +1 ] + 1;
    } while (slow != fast);

    // move slow to the starting point;
    slow = arr[0] + 1;

    while(slow != fast)
    {
      fast = arr[fast] + 1;
      slow = arr[slow] + 1;
    }

    return slow-1;

  }



}
