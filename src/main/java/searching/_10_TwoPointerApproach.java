package searching;

/**
 * We have this pair we need to find any pair, whose sum is equal to given input
 */
public class _10_TwoPointerApproach {

    public static void main(String[] args) {
        int []arr = {2,4,8,9,11,12,20,30};
        int x = 51;
        System.out.println(pairExists(arr, x));

    }

    private static boolean pairExists(int []arr, int x)
    {
        int low = 0, n = arr.length;
        int high = n-1;

        while(low <= high)
        {
            if(arr[low] + arr[high] == x)
                return true;
            else if (arr[low] + arr[high] > x) {
                high--;
            } else
                low++;
        }

        return false;
    }

}
