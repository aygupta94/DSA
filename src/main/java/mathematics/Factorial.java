package mathematics;

public class Factorial
{
    public static void main(String[] args) {
        System.out.println(factorial(6));
    }

    private static int factorial(int n)
    {
        if(n==0)
            return 1;

        int res =1;
        while(n>0)
        {
            res = res*n;
            n= n-1;
        }

        return res;
    }
}
