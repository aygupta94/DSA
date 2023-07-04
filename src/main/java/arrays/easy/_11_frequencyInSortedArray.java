package arrays.easy;

public class _11_frequencyInSortedArray {
    public static void main(String[] args) {
//        int arr[] = {10, 10, 10, 25, 30, 30};
        int arr[] ={10,20,30};
        printfreq(arr);
    }

    static void printfreq(int[] arr) {
        int n = arr.length;
        int counter = 0;
        int temp = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] != temp) {
                System.out.println(temp + " : " + counter);
                temp = arr[i];
                counter = 1;
            } else {
                counter++;
            }
        }
        System.out.println(temp + " : " + counter);
    }
}
