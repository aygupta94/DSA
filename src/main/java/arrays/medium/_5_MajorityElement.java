package arrays.medium;

public class _5_MajorityElement {
    public static void main(String[] args) {
        int arr[] = {8, 3, 4, 8, 8};
        System.out.println(majorityElement(arr));

    }

    static int majorityElement(int arr[]) {
        int n = arr.length;
        int count = 1;
        int res = 0;
        int currElement = arr[0];
        int index = 0;

        //find a candidate
        for (int i = 1; i < n; i++) {
            if (arr[res] == arr[i]) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                res = i;
                count = 1;
            }
        }

        //check for majority
        count =0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == arr[res])
                count++;

        }

        if(count > n/2)
            return res;

        return -1;
    }
}
