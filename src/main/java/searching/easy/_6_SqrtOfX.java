package searching.easy;

public class _6_SqrtOfX {
    public static void main(String[] args) {
        int x = 17;
        System.out.println(findSqrt(x));
    }

    public static int findSqrt(int x)
    {
        int low=0, high=x-1, mid, ans = -1;
        while(low <= high)
        {
            mid = (low + high) / 2;
            int msq = mid * mid;
            if(msq == x)
                return mid;

            if(msq > x)
            {
                high = mid -1;
            } else if(msq < x)
            {
                low = mid +1;
                ans = mid;

            }
        }

        return ans;
    }

}
