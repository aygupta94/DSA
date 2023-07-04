package arrays.easy;

public class _4_checkSortedArray {
    public static void main(String[] args) {
        int arr[] = {4,2};
        System.out.println(isSorted(arr));
    }

    static boolean isSorted(int[] arr)
    {

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1] >= arr[i])
                continue;
            else
                return false;
        }

        return true;
    }
}
