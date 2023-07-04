package arrays.easy;

import java.util.Arrays;

public class _5_reverseArray {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        Arrays.stream(reverse(arr)).forEach(e-> System.out.print(e + " "));

    }

    static int[] reverse(int []arr)
    {
        int temp;
        int n = arr.length;
        for(int i=0, j= n-1; i<=j; i++, j--)
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        return arr;
    }

}
