package mathematics;

public class PrimeNo {
    public static void main(String[] args) {
        System.out.println(checkPrime(2));
    }

    private static boolean checkPrime(int n)
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
