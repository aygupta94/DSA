package arrays.medium;

import java.util.Arrays;

public class _14_P_RearrangeArray {

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6};
        Arrays.stream(rearrange(arr, arr.length)).forEach(e-> System.out.print(e + " "));
    }

    public static int[] rearrange(int[] arr, int n)
    {
        // Your code here
        int lastidx=n-1;
        int firstidx=0;
        int maxi=arr[n-1]+2;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                arr[i]+=(arr[lastidx]%maxi)*maxi;
                lastidx--;
            }
            else
            {
                arr[i]+=(arr[firstidx]%maxi)*maxi;
                firstidx++;
            }
        }

        Arrays.stream(arr).forEach(e-> System.out.print(e + " "));

        for(int i=0;i<n;i++)
            arr[i]/=maxi;
        System.out.println();
        return arr;
    }
}
