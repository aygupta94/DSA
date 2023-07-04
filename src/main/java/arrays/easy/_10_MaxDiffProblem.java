package arrays.easy;

public class _10_MaxDiffProblem {
    public static void main(String[] args) {
        int arr[] ={2,3,10,6,4,8,1};
        System.out.println(maxDiff(arr));
    }

    static int maxDiff(int[] arr)
    {
        int res = arr[1] - arr[0];
        int minVal = arr[0];
        int n = arr.length;
        for(int i=1; i<n; i++)
        {
            res = Math.max(res, arr[i] - minVal);
            minVal = Math.min(minVal, arr[i]);
        }

        return res;
    }
}
