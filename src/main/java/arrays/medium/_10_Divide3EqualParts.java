package arrays.medium;

import java.sql.Array;

public class _10_Divide3EqualParts {

    public static void main(String[] args) {
        int arr[] = {1,3,4,0,4};
        has3EqualParts(arr);
    }

    static boolean has3EqualParts(int[] arr)
    {
        int sum=0;

        for(int i=0; i< arr.length; i++)
        {
            sum += arr[i];
        }

        if(sum%3 != 0)
            return false;

        //each subarray will have sum = sum/3;
        int res = sum/3;

        //calculate prefix sum array
        int []psum = new int[arr.length];
        psum[0] = arr[0];

        for(int j=1; j<arr.length; j++)
        {
            psum[j] = psum[j-1] + arr[j];
        }

        //psum = {1,4,8,8,12}
        //arr[]= {1,3,4,0,4};
//                0,1,4,8,8
        int ind1 = -1, ind2 =-1;
        for(int i=0; i < arr.length; i++)
        {
            if (psum[i] == res && ind1==-1 ) {
                ind1=i;
            }
            else if(psum[i]==2*res && ind1!=-1) {
                ind2=i;
                break;
            }
        }

        if(ind1 !=-1 && ind2 != -1)
        {
            System.out.println("("+ind1 + "," +ind2+")");
        }

        return true;

    }
}
