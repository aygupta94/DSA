package searching;

public class _11_TripletInSortedArray {

    public static void main(String[] args) {
        int []arr = {2,3,4,8,9,20,40};
        int x = 32;
        System.out.println(isTripletpresent(arr, x));
    }

    private static boolean isTripletpresent(int []arr, int x)
    {
        int low, high, n = arr.length;
        int index =0;

        while(index < n) {
            int z = x-arr[index];
            low = index+1;
            high = n-1;
            while (low <= high) {
                if (arr[low] + arr[high] == z)
                    return true;
                else if (arr[low] + arr[high] > z)
                    high--;
                else
                    low++;
            }

            index++;
        }

        return false;

    }


}
