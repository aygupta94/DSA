package sorting;

import java.util.Arrays;

public class _7_InversionInArray {

    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5};
        System.out.println(countInversion_Naive(arr));
        int res = countInversion_EfficientSolution(arr, 0, arr.length-1);
        System.out.println(res);
        System.out.println(Arrays.toString(arr));
    }

    private static int countInversion_Naive(int arr[]) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }

        return count;
    }

    /**
     * The Idea is based on merge sort.
     * We divide the array into 2 halves.
     * We sort this 2 halves recursively. And then we merge this 2 halves.
     * But while sorting we also count inversion.
     * We count inversion in left half.
     * We count inversions in right half.
     * We count inversion when one element in left half and another in right half.
     * <p>
     * Every inversion occurrence of (x,y) such that x>y.
     * 3 cases:
     * I. Both x & y lie in left half.
     * ii. Both lie in right half
     * iii. x is in left half and y in right.
     */
    private static int countInversion_EfficientSolution(int arr[], int left, int right) {
        int mid = left + (right - left) / 2;
        int res = 0;
        if (left < right) {
            res += countInversion_EfficientSolution(arr, left, mid); //count in left half
            res += countInversion_EfficientSolution(arr, mid + 1, right); //count in right half
            res += mergeAndCount(arr, left, mid, right);
        }

        return res;
    }

    private static int mergeAndCount(int arr[], int l, int m, int r) // {2,4,1,3,5};
    {
        //       0,1,2,3,4
        //arr = {2,4,1,3,5}
        //left half = {2,4,1}
        //right half = {3,5}

        int n1 = m - l + 1;
        int n2 = r - m;
        int left[] = new int[n1];
        int right[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[l+i];
        }

        for (int j = 0; j < n2; j++) {
            right[j] = arr[m + 1 + j];
        }

        int i = 0, j = 0, index = l, countInv = 0;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[index] = left[i];
                i++;
            } else { //if (left[i] > right[j]) {
                arr[index] = right[j];
                j++;
                countInv = countInv + (n1 - i);  // IMP : this tell the total count of inversion with this element
            }
            index++;
        }

        while (i < n1) {
            arr[index] = left[i];
            i++;
            index++;
        }

        while (j < n2) {
            arr[index] = right[j];
            j++;
            index++;
        }

        return countInv;

    }


}
