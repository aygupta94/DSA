package searching.easy;

public class _8_SearchInSortedRotatedArray {

    public static void main(String[] args) {
        int arr[] = {100, 200, 300, 400, 1000, 20, 30};
        int arr2[] = {100,200,300,400,500,600,10,20,30,40,50,60,70,80,90};
        int x = 200;
        System.out.println(findElement(arr2, x));
    }

    private static int findElement(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int mid;

        while (low < high) {
             mid = (low + high) / 2;
            if (x == arr[mid]) {
                return mid;
            }

            if (arr[low] < arr[mid]) {
                //left half is sorted
                if (x > arr[low] && x < arr[mid]) { //if ele is in left range
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (arr[high] > arr[mid]) {
                //right half is sorted
                if (x > arr[mid] && x < arr[high]) {//if ele is in right range
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
