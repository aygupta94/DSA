package searching.problems;

public class _3_MinNumInSortedRotatedArray {

    public static void main(String[] args) {
        int arr[] = {7,1,2,3,4,5,6};
        System.out.println(minNumber(arr,0,arr.length-1));
    }

    /*
    In a rotated sorted array, the smallest element will always be after largest element
    arr[mid-1] > arr[mid]
    Works for unrotated sorted array as well
     */
    static int minNumber(int arr[], int low, int high)
    {
        int n = arr.length -1;
        // Your code here
        while(low <= high)
        {
            int mid = (low+high)/2;

            if(mid==0 || arr[mid-1] > arr[mid])
                return arr[mid];

            if(arr[high]>arr[mid])
                return minNumber(arr,low,mid-1);
            else
                return minNumber(arr,mid+1,high);

        }

        return -1;
    }
}
