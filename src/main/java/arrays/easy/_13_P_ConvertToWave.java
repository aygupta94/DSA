package arrays.easy;

import java.util.Arrays;

public class _13_P_ConvertToWave {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,};
        convertToWave(arr.length, arr);
        Arrays.stream(arr).forEach(e -> System.out.print(e+" "));
    }

    public static void convertToWave(int n, int[] arr) {
        // code here
        for(int i=0; i<n-1; i++)
        {
            if(i%2==0 && arr[i] < arr[i+1]) //local maxima
            {
                swap(arr, i, i+1);  // 2 1 4 3 5
            }
        }
    }

    static void swap(int arr[], int left, int right)
    {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
