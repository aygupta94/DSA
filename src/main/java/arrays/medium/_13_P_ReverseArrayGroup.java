package arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;

public class _13_P_ReverseArrayGroup {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        reverseInGroups(arr, arr.size(), 4);
        arr.stream().forEach(e -> System.out.print(e+ " ,"));
    }


    static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        int rem = n%k;

        for(int i=0; i<n; i+=k)
        {
            if(i+k < n)
            {
                //reverse the groups
                reverse(arr, i, i+k-1);
            }
            else
            {
                //reverse the remaining element
                reverse(arr, i, n-1);
            }
        }
    }

    static void reverse(ArrayList<Integer> arr, int low, int high){

        int temp;
        while(low < high)
        {
            temp = arr.get(low);
            arr.set(low, arr.get(high));
            arr.set(high, temp);
            low++;
            high--;
        }
    }

}
