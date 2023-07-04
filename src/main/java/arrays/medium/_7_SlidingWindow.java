package arrays.medium;

public class _7_SlidingWindow {
    public static void main(String[] args) {
        int arr[] ={1,8,30,-5,20,7}; // o/p if k=4, 53
        int arr2[] = {10,5,-2,20,1};  // if k=3 , o/p = 23
        System.out.println(findMaxSumWithWindowK(arr, 4));
        System.out.println(findMaxSumWithWindowK(arr2, 3));
    }

    static int findMaxSumWithWindowK(int []arr, int k)
    {
        int n= arr.length;
        int sum =0, res=0;
        for(int i=0; i< n; i++)
        {
            if(i<k) {
                sum += arr[i];
                res = sum;
            }
            else
            {
                sum = sum - arr[i-k] + arr[i];
            }

            res = Math.max(res, sum);
        }

        return res;
    }
}
