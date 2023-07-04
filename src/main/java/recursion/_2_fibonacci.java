package recursion;

public class _2_fibonacci {
    public static void main(String[] args) {
//        System.out.println(fibonacciTerm(5));
        printFib(6);
    }

//    0 1 1 2 3 5 8
    static int fibonacciTerm(int n)
    {
        if(n<=1)
            return n;

        return fibonacciTerm(n-1) + fibonacciTerm(n-2);
    }

    //    0 1 1 2 3 5 8
    static void printFib(int n)
    {
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacciTerm(i) + " ");
        }
    }
}
