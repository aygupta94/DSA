package DSATest;

import java.util.*;
public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int p = scanner.nextInt() - 1;
        int m = scanner.nextInt();
        Set<Integer> forbidden = new HashSet<>();
        for (int i = 0; i < m; i++) {
            int b = scanner.nextInt() - 1;
            forbidden.add(b);
        }
        int[] arr = new int[n];
        Arrays.fill(arr, -1);
        arr[p] = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == -1) {
                continue;
            }
            int left = Math.max(i - k + 1, 0);
            int right = Math.min(i, n - k);
            for (int j = left; j <= right; j++) {
                if (forbidden.contains(j)) {
                    continue;
                }
                if (arr[j + k - 1] == -1 || arr[j + k - 1] > arr[i] + 1) {
                    arr[j + k - 1] = arr[i] + 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i == n - 1) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }
}




