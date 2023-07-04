package arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;

public class _15_P_frequenciesOfElement {

    public static void main(String[] args) {
        int arr[] = {2, 3, 2, 3, 5};
        int arr2[] ={2, 4, 5, 6, 8};   // 0 1 0 1 1
        frequencyCount(arr2, arr2.length, 10);
        Arrays.stream(arr2).forEach(e -> System.out.print(e + " "));
    }

    public static void frequencyCount(int arr[], int n, int P)
    {
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] - 1;
        }
        Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
        System.out.println();
        // code here
        for (int i = 0; i < n; i++) {
            int index = arr[i] % n;
            arr[index] = arr[index] + n;
        }
        Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
        System.out.println();
        for (int i = 0; i < n; i++) {
            arr[i] /= n;
        }


    }



}
