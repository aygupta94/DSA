package searching.problems;

/*
Given an integer array representing the heights of N buildings, the task is to delete N-2 buildings such that the
water that can be trapped between the remaining two building is maximum.
Note: The total water trapped between two buildings is gap between them (number of buildings removed)
multiplied by height of the smaller building.

Input:
N = 6
height[] = {2,1,3,4,6,5}
Output: 8
Explanation: The heights are 2 1 3 4 6 5.
So we choose the following buildings
2,5  and remove others. Now gap between
two buildings is equal to 4, and the
height of smaller one is 2. So answer is
2 * gap = 2*4 = 8. There is
no answer greater than this.

 */
public class _5_MaxWaterBetweenTwoBuilding {

    public static void main(String[] args) {
        int arr[] = {2,1,3,4,6,5};
        System.out.println(maxWater(arr, arr.length));
    }

    static int maxWater(int arr[], int n)
    {
        //Your code here

        if(n < 3)
            return 0;

        int low=0, high=n-1, res=0;
        int ans= Math.min(arr[0],arr[n-1])*(n-2);

        while(low<high)
        {

            if(arr[low]<=arr[high])
            {
                low++;
            } else {
                high--;
            }

            res = Math.min(arr[low],arr[high])*(high-low-1);
            res = Math.max(ans,res);
            ans = res;
        }

        return res;
    }

}
