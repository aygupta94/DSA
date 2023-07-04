package arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class _9_leaderOfArray {
    public static void main(String[] args) {
        int arr[] = {7,10,4,3,6,5,2};
//        Arrays.stream(findLeaders(arr)).forEach(e-> System.out.print(e + " "));
        findLeaders(arr);
    }

    static void findLeaders(int []arr)
    {

        int n = arr.length , temp=arr[n-1], count=0;
        System.out.print(temp + " ");
        for(int i=n-1; i> 0; i--)
        {
            if(arr[i] > temp)
            {
                System.out.print(arr[i] + " ");
                temp = arr[i];
            }
        }

    }

}
