package sorting;

import java.util.Arrays;

public class _8_QuickSort_NaivePartition {

    public static void main(String[] args) {
        int arr[] = {2,3,4,8,7,6,9,1};
        partition(arr, 4);
        System.out.println(Arrays.toString(arr));
    }

    private static void partition(int arr[], int pivot)
    {
        int n = arr.length;
        int temp[] = new int[n];
        int index=0;

        for(int i=0; i<n; i++)
        {
            if(arr[i] < pivot)
            {
                temp[index] = arr[i];
                index++;
            }
        }


        for(int i=0; i<n; i++)
        {
            if(arr[i] >= pivot)
            {
                temp[index] = arr[i];
                index++;
            }
        }

        for(int i=0; i<n; i++)
        {
            arr[i] = temp[i];
        }

    }
}
