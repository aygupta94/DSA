package arrays.medium;


/*
returns index of the majority element
 */
public class _5_MajorityElement {
    public static void main(String[] args) {
        int arr[] = {8, 3, 4, 8, 8};
        int arr2[] = {1,3,3,3,2};
        System.out.println(majorityElement(arr2));

    }

    /*
    Popularly known as Mores voting algorithm
     */
    static int majorityElement(int arr[]) {
        int n = arr.length;
        int count = 1;
        int res = 0;

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
