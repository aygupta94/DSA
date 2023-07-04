package arrays.medium;

import java.util.Arrays;

public class _11_P_MaximumIndex {

    public static void main(String[] args) {
        int arr[] = {34,8,10, 3, 2, 80, 30, 33, 1};
        System.out.println(maxIndexDiff(arr, arr.length));

    }

    static int maximumIndex(int arr[], int n)
    {

        int res =0;
        for(int i=0; i<n; i++)
        {
            for(int j=n-1; j>i+1; j--)
            {
                if (arr[i] < arr[j]) {
                    System.out.println("i:"+i+" j:"+j);
                    res = Math.max(res, j-1);
                }
            }
        }

        return res;

    }

    //efficient solution
    static int maxIndexDiff(int A[], int N) {

        // Your code here
        int[] leftMin = new int[N];
        int[] rightMax = new int[N];
        leftMin[0] = A[0];
        for (int i = 1; i < N; i++) {
            leftMin[i] = Math.min(A[i], leftMin[i-1]);
        }
        printArr(leftMin);
        // Pre compute the maximum likewise
        rightMax[N-1] = A[N-1];
        for (int i = N - 2; i >= 0; i--) {
            rightMax[i] = Math.max(A[i], rightMax[i+1]);
        }
        System.out.println();
        printArr(rightMax);
        System.out.println();

        int maxDiff = 0;
        int i = 0;
        int j = 0;
        while (i < N && j < N) {
            if (leftMin[i] <= rightMax[j]) {
                System.out.println("i:"+i+" j:"+j + " leftMin[i]:"+leftMin[i]+" rightMax[j]:"+rightMax[j]);
                maxDiff = Math.max(maxDiff, j-i);
                System.out.println("maxDiff:"+maxDiff + " i-j::"+(j-i));
                System.out.println();
                j++;
            } else {
                i++;
            }
        }
        return maxDiff;


    }

    static void printArr(int[] arr)
    {
        Arrays.stream(arr).forEach(e -> System.out.print(e+","));
        Arrays.stream(arr).sum();
    }
}
