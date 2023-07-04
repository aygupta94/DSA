package arrays.easy;

public class _14_P_LargestFraction {

    public static void main(String[] args) {
        int []arr = LargestFraction(2, 53);
        System.out.printf("%d, %d", arr[0], arr[1]);
    }

    /*
    We have to find p/q >= n/d,
    such that gcd(p,q) =1;

    p*d >= n*q;
     */
    public static int[]  LargestFraction(int n, int d)
    {
        int MAX_NUMBER = 10000;
        int maxNumerator = -1;
        int maxDenominator = 1;

        for (int denominator = MAX_NUMBER; denominator > 1; denominator--)
        {
            int numerator = (n * denominator - 1) / d;
            if ((FindGCD(numerator, denominator) == 1) &&
                    (numerator * maxDenominator >= denominator * maxNumerator))
            {
                maxNumerator = numerator;
                maxDenominator = denominator;
            }
        }

        return new int[] { maxNumerator, maxDenominator };
    }

    private static int FindGCD(int n1, int n2)
    {
        if(n2 == 0)
            return n1;

        return FindGCD(n2, n1 % n2);
    }


}
