package searching.problems;

public class _4_CountOnlyRepeated {

    static class Pair{
        long x;
        long y;

        Pair(long x, long y){
            this.x = x;
            this.y = y;
        }


        @Override
        public String toString() {
            return x+" "+y;


        }
    }

    public static void main(String[] args) {
        Long arr[] = {1l,2l,3l,3l,4l};
        System.out.println(findRepeating(arr, arr.length));
    }

    //Function to find repeated element and its frequency.

    /*
    Idea: if there is no repeating element in sorted array
    1. lowest element is arr[0]
    2. largest element is arr[n-1]
    3. arr[n-1] - arr[0] == n-1
    4. if there is repeating element arr[n-1] - arr[0] > n-1
    5. no of times element repeated is =sizeOfArray - size_nonRepeatingElement
                                        n -(arr[n-1] - arr[0])
     */
    public static Pair findRepeating(Long arr[],int n)
    {
        //Your code here
        int low=0, high=n-1;

        // if no repeating element
        if(arr[n-1]-arr[0] == n-1 || n==1)
            return new Pair(-1, -1);

        while(low<high)
        {
            int m=(low+high)/2;

            //if element is at right side
            if(arr[m] >= m + arr[0])  // 3 >= 3 + 1 =>  3>=4
            {
                low = m+1;          // 3
            } else
            {
                high = m;
            }

        }

        return new Pair(arr[low], n -(arr[n-1] - arr[0]));
    }

}
