package searching.easy;

public class _4_IndexOfLastOccurrenceInSorted {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,4,4,5};
        System.out.println(findlast(arr, 0, arr.length-1, 4));
    }

//    TC: logn
    public static int findlast(int[] arr, int low, int high, int ele) {
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (ele < arr[mid]) {
                high = mid - 1;
            } else if (ele > arr[mid]) {
                low = mid + 1;
            } else {
                if (mid == arr.length - 1 || arr[mid] != arr[mid + 1]) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
}
