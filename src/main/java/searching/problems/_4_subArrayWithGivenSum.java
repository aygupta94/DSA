package searching.problems;

import java.util.Arrays;

public class _4_subArrayWithGivenSum {

  public static void main(String[] args) {
    int arr[]={1,2,3,7,5}; //18
    int sum =12;
  }

  static boolean isSubArrayPrersent(int arr[], int sum){

    int totalSum = Arrays.stream(arr).sum();
    int currentSum = 0, n= arr.length, start =0, end;

    for(int i=0; i<n; i++)
    {
      currentSum += arr[i];   //1+2+3+7

      while(currentSum > sum)
      {
        currentSum -= arr[start];
        start++;
      }

    }

    return false;
  }

}
