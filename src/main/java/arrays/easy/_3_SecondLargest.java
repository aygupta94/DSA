package arrays.easy;

public class _3_SecondLargest {
    public static void main(String[] args) {
//        int arr[] = {10, 30, 12, 45, 32, 45};
//        int arr[] = {10,10,20,8,15,40};
        int arr[] = {};
        System.out.println("SecondMax element: " + findSecondLargest(arr));

    }

    static int findSecondLargest(int[] arr) {
        int n = arr.length;
        int max = 0; // storing the index of max element
        int secondMax = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] != arr[max]) {
                if (arr[i] > arr[max]) {
                    secondMax = max;
                    max = i;
                } else if (arr[i] > secondMax) {
                    secondMax = i;
                }
            }
        }

        return secondMax==-1? -1: arr[secondMax];
    }
}
