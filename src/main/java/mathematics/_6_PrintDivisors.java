package mathematics;

public class _6_PrintDivisors {

    public static void main(String[] args) {
        printDivisors3(30);
    }

    static void printDivisors(int n) {
        int temp = n;
        if (n < 1) {
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    //unsorted print: O(sqrt(n))
    static void printDivisors2(int n)
    {
        if(n<1)
            return;

        for (int i = 1; i*i <= n; i++) {

            if (n % i == 0) {
                System.out.print(i + " ");

                if (i != (n / i)) {
                    System.out.print( n/i + " ");
                }
            }

        }
    }

    //sorted print: O(sqrt(n))
    static void printDivisors3(int n)
    {
        if(n<1)
            return;

        int i;
        for (i = 1; i*i < n; i++) {   //1 , 2, 3, 4, 5
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }

        for( ; i>0; i--) {    //5, 4, 3, 2, 1
            if (n%i==0) {
                System.out.print(n / i + " ");
            }
        }
    }
}
