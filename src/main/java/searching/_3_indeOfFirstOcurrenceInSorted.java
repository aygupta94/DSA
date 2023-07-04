package searching;

public class _3_indeOfFirstOcurrenceInSorted {

    public static void main(String[] args) {
        int arr[] = {5, 10, 10, 20, 20};
        System.out.println(findFirstIterative(arr, 0, arr.length - 1, 10));
    }

//    tc: Logn
//    AS : logn
    public static int findFirst(int arr[], int low, int high, int ele) {
        int mid = (low + high) / 2;

        if (low > high) {
            return -1;
        }
        if (ele < arr[mid]) {
            return findFirst(arr, low, mid - 1, ele);
        } else if (ele > arr[mid]) {
            return findFirst(arr, mid + 1, high, ele);
        } else {
            //we have to find the first occurrence in group of elements
            if (mid == 0 || arr[mid] != arr[mid - 1]) {
                return mid;
            } else {
                return findFirst(arr, low, mid - 1, ele);
            }

        }
    }

//    tc: logn
    public static int findFirstIterative(int arr[], int low, int high, int ele) {

        int mid;

        while(low <= high)
        {
            mid = (low + high)/2;
            if(ele < arr[mid])
                high = mid -1;
            else if( ele > arr[mid])
                low = mid + 1;
            else{
                if (mid == 0 || arr[mid] != arr[mid - 1]) {
                    return mid;
                } else {
                    high = mid-1;
                }
            }
        }

        return -1;
    }
}
