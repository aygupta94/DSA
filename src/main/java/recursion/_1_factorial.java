package recursion;

public class _1_factorial {
    public static void main(String[] args) {
        System.out.println(factorial2(6 ,1));
    }

    static int factorial(int n)
    {
        if(n==0)
            return 1;

        return n*factorial(n-1);
    }

    //Tail recursive
    static int factorial2(int n, int k)
    {
        if(n==0)
            return k;

        return factorial2(n-1, n*k);
    }
}
