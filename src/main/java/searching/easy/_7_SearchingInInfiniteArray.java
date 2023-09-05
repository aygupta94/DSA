package searching.easy;

import org.codehaus.plexus.util.Expand;

public class _7_SearchingInInfiniteArray {
    public static void main(String[] args) {
//        int arr[] = {2,3,5,6,8,9, 10, 13, 15,16,19,20,21,24,25,26,27,29,30,31,34,36,38,39 };
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        System.out.println(findArray(arr,17));

    }

    public static int findArray(int arr[], int ele)
    {
        int mid, high, low;

        if(arr[0] == ele)
            return 0;
        int i=1;
        while(arr[i] < ele)
            i *=2;

        if(arr[i] == ele)
            return i;

        low = (i/2) + 1;
        high = i-1;

        while(low <= high)
        {
            mid = (low + high)/2;
            if(arr[mid] == ele)
                return mid;
            else if(ele > arr[mid])
            {
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return -1;
    }


}
