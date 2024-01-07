package sorting;

import java.util.Arrays;

public class _14_Group_Even_And_Odd_Elements {

  public static void main(String[] args) {
//    int[] arr= {15,14,13,12,7,2,3,99}; // pivot_index: 2, index indicates all element at and before index 2 is even and other are odd.
    int arr[] = {0,1,1,0,0,0,1};
    System.out.println(groupElements(arr));
    System.out.println(Arrays.toString(arr));
  }

  private static int groupElements(int[] arr)
  {
    int n = arr.length;
    int i=-1; int j=n;
    int pivot = arr[0];
    while(true)
    {
      do{
        i++;
      } while (arr[i]%2==0);
      do{
        j--;
      } while (arr[j]%2!=0);
      if(i>=j)
        return j;
      else
        swap(arr, i, j); // {12,14,13,15}
    }
  }

  private static void swap(int arr[], int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

}
