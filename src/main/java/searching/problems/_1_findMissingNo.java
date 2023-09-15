package searching.problems;

public class _1_findMissingNo {

  public static void main(String[] args) {
    int arr[] ={0,-10,1,3,-20};  // O/p = 3
    System.out.println(missingNumber(arr, arr.length));
  }

  static int missingNumber(int arr[], int n)
  {
    int mx=Integer.MIN_VALUE;
    for(int i=0;i<n;i++) {
      if(arr[i]<=0)
        arr[i]=0;
      mx=Math.max(mx,arr[i]);
    }
    mx=mx+1;
    for(int i=0;i<n;i++) {
      if(arr[i]>0) {
        int ind=arr[i]%mx-1;
        if(ind<n && ind>=0) arr[ind]+=mx;
      }
    }
    for(int i=0;i<n;i++){
      if(arr[i]<mx)
        return i+1;
    }
    return n+1;
  }

//  ============GFG solution================
//Function that puts all non-positive (0 and negative) numbers on left
  //side of arr[] and return count of such numbers.
  static int segregateArr (int arr[], int n)
  {
    int j = 0, i;
    for(i = 0; i < n; i++)
    {
      if(arr[i] <= 0)
      {
        //changing the position of negative numbers and 0.
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        //incrementing count of non-positive integers.
        j++;
      }
    }
    return j;
  }

  //Finding the smallest positive missing number in an array
  //that contains only positive integers.
  static int findMissingPositive(int arr[],int st, int end)
  {

    //marking arr[i] as visited by making arr[arr[i]-1] negative.
    //note that 1 is subtracted because indexing starts from 0 and
    //positive numbers start from 1.
    for(int i=st; i<end; i++)
    {
      if(Math.abs(arr[i])+st - 1 < end && arr[ Math.abs(arr[i])+st - 1] > 0)
        arr[ Math.abs(arr[i])+st - 1] = -1*arr[ Math.abs(arr[i])+st - 1];
    }

    for(int i=st; i<end; i++)
    {
      if (arr[i] > 0)
      {
        //returning the first index where value is positive.
        // st is subtracted because we do not have to consider negative numbers present at the start of array.
        // 1 is added because indexing starts from 0.
        return i-st+1;
      }
    }
    return end-st+1;
  }

  //Function to find the smallest positive number missing from the array.
  static int missingNumber2(int arr[], int size)
  {
    //first separating positive and negative numbers.
    int shift = segregateArr(arr, size);

    //shifting the array to access only positive part.
    //calling function to find result and returning it.
    return findMissingPositive(arr,shift, size);
  }

}
