package arrays.easy;

public class _2_findLargest {
    public static void main(String[] args) {
        int arr[] = {60, 30,12, 45, 32, 45};
        System.out.println("Max element: " + findLargest(arr));

    }

    static int findLargest(int []arr)
    {
        int n = arr.length;
        int max = 0; // storing the index of max element

        for(int i=0; i<n; i++)
        {
            if(arr[i] > arr[max])
                max = i;
        }

        return arr[max];
    }
}
