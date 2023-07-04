package arrays.medium;

public class _9_TappingWater_medium {
    public static void main(String[] args) {
        int arr[] = {3,1,2,4};
        int arr2[] = {3,0,1,2,5};
        int arr3[] = {3,1,5,2,4};
        int arr4[] = {3,5,2,3};
        int arr5[] = {3,0,5,0,2,0,1};  //6
        System.out.println(maxWater(arr5));
    }

//    Approach: We precaculate the lmax and rmax for give array.
//    arr[] = {3,0,5,0,2,0,1}
//        *
    //    *
    //*   *
    //*   *   *
    //*   *   *   *
//    -------------
//    3 0 5 0 2 0 1

//  arr= {3,0,5,0,2,0,1}
//  lmax={3,3,5,5,5,5,5}
//  rmax={5,5,5,2,2,1,1}
//
//  min(lmax-rmax)={3,3,5,2,2,1,1}
//             arr={3,0,5,0,2,0,1}
//             res={0,3,0,2,0,1,0} = 6
//  res = min(lmax,rmax) -a[i];

    static int maxWater(int[] bars)
    {
        int n = bars.length;
        int lmax[] = new int[n];
        int rmax[] = new int[n];
        int res =0;
        lmax[0] = bars[0];
        for(int i=1; i<n-1; i++)
            lmax[i] = Math.max(bars[i], lmax[i-1]);

        rmax[n-1] = bars[n-1];
        for(int j=n-2; j>=0; j--)
            rmax[j] = Math.max(bars[j],rmax[j+1] );

        for (int i = 1; i <n-1 ; i++) {
            res += Math.min(lmax[i], rmax[i]) - bars[i];
        }

        return res;
    }


}
