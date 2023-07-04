package recursion;

public class _5_sumOfDigits {

    public static void main(String[] args) {
        System.out.println(sumOfDigits(1, 0));
    }

    static int sumOfDigits(int n, int sum)
    {
        if(n==0)
            return sum;
        return sumOfDigits(n/10, sum + (n%10));
    }


    //TC = theta(d)
    //AS = theta(d)
}
