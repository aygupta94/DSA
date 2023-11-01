package sorting.easy;


import java.util.Arrays;

/**
 * Theta(n^2) --> in all cases;
 * Does less memory writes in comparison to inserstion sort, merge sort, quick sort, bubble sort.
 * It is important in case of EEP ROM -> where ROM memory ages with each write operation
 * More optimal sort in terms of write is cycle sort.
 * It is the basic idea of Heap sort. In heap sort we use heap DS.
 * It is not stable.
 * It is in place sort, no extra space required.
 */
public class _2_SelectionSort {

    public static void main(String[] args) {
        int arr[] = {5,3,8,1};
        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int arr[])
    {
        int n = arr.length, i, j,index_min, pass=0;
        for (i = 0; i < n-1; i++) {
            index_min  = i;
            for(j=i+1; j<n; j++) //  n + n-1 + n-2 .. 2+ 1 => 4 + 3 + 2 + 1
            {
                pass++;
                if(arr[j] <  arr[index_min])
                    index_min = j;
            }

            swap(arr,i,index_min);
        }
        System.out.println("Total Pass: " + pass);
    }

    private static void swap(int arr[], int i, int index_min) {
        int temp = arr[i];
        arr[i] = arr[index_min];
        arr[index_min] = temp;
    }


}
