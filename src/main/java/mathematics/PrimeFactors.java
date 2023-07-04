package mathematics;

public class PrimeFactors {
    public static void main(String[] args) {
        printPrimeFactors(450);
    }

    private static void printPrimeFactors(int n)
    {
        for(int i=2; i<=n; i++)
        {
            if(isPrime(i))
            {
                int x =i;
                while(n%x == 0)
                {
                    System.out.print(i + " ");
                    n = n/x;
                }
            }
        }
    }

    private static boolean isPrime(int n)
    {
        if(n==1)
            return false;

        for(int i=2; i<= Math.sqrt(n); i++)
        {
            if(n%i == 0)
                return false;
        }

        return true;
    }
}
