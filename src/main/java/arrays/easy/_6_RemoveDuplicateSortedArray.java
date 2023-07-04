package arrays.easy;

import java.util.Arrays;

public class _6_RemoveDuplicateSortedArray {
    public static void main(String[] args) {
        int[] arr = {10, 10,15,20,20, 30,30,30,30};
//        int[] arr = {};
//        Arrays.stream(removeDuplicates(arr)).forEach(e-> System.out.print(e + " "));
        System.out.println(removeDuplicates(arr));
    }

    static int removeDuplicates(int[] arr)
    {
        int n = arr.length;
        int count =0;
        if(n>=1)
            count =1;

        int res = 1;
        for(int i=1; i< n; i++)
        {
            if(arr[i] == arr[i-1])
            {
                res = i; //2
            } else {
                arr[res] = arr[i];
                count++;
            }
        }

        return count;
    }
}
