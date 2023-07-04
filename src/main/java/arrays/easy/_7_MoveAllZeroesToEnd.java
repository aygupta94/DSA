package arrays.easy;

import java.util.Arrays;

public class _7_MoveAllZeroesToEnd {
    public static void main(String[] args) {
//        int arr[] = {8,5,0,10,0,20};
        int arr[] = {0,0,0,10,0,20};
//        int arr[] = {0,0,0};
//        int arr[] = {1,0,0,0};
        Arrays.stream(moveZeroes2(arr)).forEach(e-> System.out.print(e + " "));
    }

    static int[] moveZeroes(int []arr)
    {
        int res=-1, nonZero=0, temp;
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            if(arr[i]==0 && res==-1)
                res = i;
            else if(arr[i] == 0)
                continue;

            if(arr[i] != 0 && res > 0)
            {
                arr[res] =arr[i];
                arr[i]=0;
                res++;
            }
        }
        return arr;
    }

    static int[] moveZeroes2(int[] arr)
    {
        int n = arr.length, count= 0, temp;
        for (int i = 0; i < n; i++) {
            if(arr[i] != 0)
            {
                temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }

        }

        return arr;
    }
}
