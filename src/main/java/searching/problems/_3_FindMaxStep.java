package searching.problems;

public class _3_FindMaxStep {

  public static void main(String[] args) {
    int arr[]={1,2,2,3,2,3,4,2,3};
    int arr2[]={5, 4, 2, 7, 5, 5, 6};
    System.out.println(maxStep(arr, arr.length));
  }

  static int maxStep(int arr[], int n)
  {
    int j=0; int count=0, res= Integer.MIN_VALUE;
    // Your code here
    for(int i=1; i<n; i++)
    {
      if(arr[i]>arr[j])
      {
        count++;
      } else
      {
        count=0;
      }
      j=i;
      res = Math.max(res, count);

    }

    return res;
  }

}
