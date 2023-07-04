package arrays.medium;

public class _6_MinimumConsecutiveFlips {
    public static void main(String[] args) {
        int arr[] = {1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1}; // 1   {0,0,0,}   {1}   {0,0}   {1,1,1,1}
        int arr2[] = {1, 1, 0, 1, 0};
        findGroups(arr);
        minFlips(arr);
    }

    static void findGroups(int arr[]) {
        int n = arr.length;
        int group1s = 0;
        int group0s = 0;

        //Step 1: find the groups
        for (int i = 1; i < n; i++) {

            if (i == n - 1) {
                if (arr[i] == 0) {
                    group0s++;
                } else {
                    group1s++;
                }
            }

            if (arr[i] == 0 && arr[i - 1] == 1) {
                group1s++;
            } else if (arr[i] == 1 && arr[i - 1] == 0) {
                group0s++;
            }

        }

        //step 2: do another traversal to print flips

        System.out.println("groups : " + (group0s + group1s));
    }


    //efficient solution
    /**
     * In finding groups there are only 2 possibility
     *  1. either the grous will be same
     *  2. or the difference b/w them can be 1
     * 1001   --> 3 groups, 0s->1, 1s->2, diff->1
     * 10101  --> 5 groups, 0s->2, 1s->3, diff->1
     *
     * Note: second group is always lower
     *
     * 1100   --> 2 groups, 0s->1, 1s ->1, diff->0
     */
    static void minFlips(int arr[])
    {
        int n = arr.length;
        int res =0;
        for(int i=1; i<n; i++)   // 10001,  1101
        {
            if(arr[i] != arr[i-1])
            {
                if (arr[i] != arr[0])
                    System.out.print("flip " + arr[i] + " from " + i + " to ");
                else {
                    System.out.println(i-1);
                }
            }
        }

        if (arr[n - 1] != arr[0]) {
            System.out.println(n-1);
        }
    }
}
