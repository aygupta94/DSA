package arrays.medium;

public class _1_maximumConsecutive1s {
    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1};
        int arr2[] = {0, 1, 1, 0, 1, 0};
        int arr3[] = {1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1};
        System.out.println(max1s(arr3));
    }

    static int max1s(int arr[]) {
        int n = arr.length;
        int currCount = 0;
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                currCount++;
            } else {
                res = Math.max(currCount, res);
                currCount = 0;
            }
        }

        return res;
    }
}
