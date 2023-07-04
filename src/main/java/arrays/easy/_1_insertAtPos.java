package arrays.easy;

import java.util.Arrays;

public class _1_insertAtPos {

    public static void main(String[] args) {
        int arr[] = new int[7];
        arr[0] = 4;
        arr[1] = 8;
        arr[2] = 1;
        arr[3] = 9;
        System.out.println(arr.length);
//        insert(arr, 4, 6, 2);
        insert(arr, 4, 6, 7);
        Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
    }

    static int insert(int []arr, int n, int x, int pos)
    {
        int cap = arr.length;

        if(n ==cap)
            return n;
        if(pos>=n && pos < cap)
            arr[pos] = x;

        if(pos<n)
        {
            for(int i =n; i>=pos; i--)
            {
                arr[i] = arr[i-1];
            }
            arr[pos] = x;
            return n+1;
        }

        return -1;
    }

}
