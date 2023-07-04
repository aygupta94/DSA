package arrays.easy;

import java.util.Arrays;

public class _8_LeftRotateBy1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int arr2[] = {1,2,3,4,5};
        Arrays.stream(leftRotate(arr)).forEach(e-> System.out.print(e + " "));
        System.out.println("-----------------");
        Arrays.stream(leftRotateByD(arr2, 2)).forEach(e-> System.out.print(e + " "));
    }

    static int[] leftRotate(int arr[])
    {
        //I/p ={1,2,3,4,5}
        //O/p ={2,3,4,5,1}
        int n = arr.length, temp;
        for (int i = 0; i <n-1; i++) {
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        return arr;
    }

//    For left rotate by d there are multiple approaches.
//    Approach 1:
//    d*leftrotate  , TC = Theta(dn), A.S = Theta(1);
//
//    Approach 2:
//    Copy first d element in temp array.
//    Shift remaning (n-d) element by d.
//    paste first d element from temp array
//    TC: theta(n), A.S : theta(d)

//    Approach 3:
//    reverse first d elements
//    reverse remaning n-d elements
//    reverse whole array.

    static int[] leftRotateByD(int arr[], int d)
    {
        // I/p = {1,2,3,4,5}, d=2
        // O/p = {3,4,5,1,2}

        //if d>n, then rotation is (d-n)
        //for eg, d=6, (6-5) = 1
        int n = arr.length;
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);

        return arr;
    }

    static int[] reverse(int[] arr, int low, int high)
    {
        while(low<high)
        {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }

        return arr;
    }
}
