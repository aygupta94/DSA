package arrays.easy;

import java.util.Arrays;

/**
 *  Find the largest three distinct elements in an array
 *
 * Given an array with all distinct elements, find the largest three elements. Expected time complexity is O(n) and extra space is O(1).
 *<pre>
 * Examples :
 *
 * Input: arr[] = {10, 4, 3, 50, 23, 90}
 * Output: 90, 50, 23
 *</pre>
 * @implNote
 *<pre>
 * {@code
 *  "1) Initialize the largest three elements as minus infinite.
 *     first = second = third = -∞
 *
 * 2) Iterate through all elements of array.
 *    a) Let current array element be x.
 *    b) If (x > first)
 *       {
 *           // This order of assignment is important
 *           third = second
 *           second = first
 *           first = x
 *        }
 *    c)  Else if (x > second and x != first)
 *       {
 *           third = second
 *           second = x
 *       }
 *    d)  Else if (x > third and x != second)
 *       {
 *           third = x
 *       }
 *
 * 3) Print first, second and third.
 * }
 * </pre>
 *
 * @author ayush
 */

public class Largest3DistintElement {

    public static void main(String[] args) {

        int arr[] = new int[]{10,4,3,50,23,90};
        Arrays.stream(findLargest3DistintElement(arr)).limit(3).forEach(System.out::println);

    }

    private static int[] findLargest3DistintElement(int arr[])
    {
        int x, first= Integer.MIN_VALUE,second= Integer.MIN_VALUE,third = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            x = arr[i];

            if(x > first)
            {
                third = second;  // 4 , 10 , 23
                second = first;   // 10 , 23, 50
                first = x;         // 50 , 90
            } else if (x > second )
            {
                third = second;
                second = x;
            }
            else if(  x > third )
            {
                third = x;
            }

        }

        arr[0] = first;
        arr[1] = second;
        arr[2] = third;

        return arr;
    }
}
