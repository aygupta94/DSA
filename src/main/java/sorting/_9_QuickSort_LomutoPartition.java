package sorting;

import java.util.Arrays;

/**
 * Lomuto partition always always consider last element as the pivot.
 * 2 variables:
 *  i : keep track of the window size.
 *  j : keep track of the index of array
 * We traverse through the array, and check if the ith element is less the pivot.
 * If yes:
 *      we increase the size of window of left side (ele less than pivot)
 *      we swap the ith element with the jth element.
 * If No:
 *      we increase the jth element.
 *
 * After the loop is done we swap the last element with jth element.
 */
public class _9_QuickSort_LomutoPartition {

    public static void main(String[] args) {
        int arr[] = {2,6,4,8,7,3,9,5};
        partition(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    /**
     *          arr           i     j
     *  {2,6,4,8,7,3,9,5}     0     1
     *  {2,6,4,8,7,3,9,5}     0     2
     *  {2,6,4,8,7,3,9,5}     1     3
     *  {2,4,6,8,7,3,9,5}     1     4
     *  {2,4,6,8,7,3,9,5}     1     5
     *  {2,4,3,8,7,6,9,5}     2     6
     *  {2,4,3,8,7,6,9,5}     2     7
     */
    private static void partition(int arr[], int l, int h)
    {
        int pivot = arr[h];
        int i=l-1;
        for(int j=l; j<h-1; j++)
        {
            if(arr[j] < pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, h);
    }

    private static void swap(int arr[], int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
