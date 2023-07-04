package mathematics;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _7_SeveOfEratosthenes {

    public static void main(String[] args) {
        boolean[] foo = fillPrimeNo(23);
        for(int i =2; i < foo.length; i++)
        {
            if(foo[i] == true)
            {
                System.out.print(i + " ");
            }
        }
    }

    static boolean[] fillPrimeNo(int n)
    {
        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr, true);

        for(int i=2; i*i<=n; i++)
        {
            for(int j=i*i; j<=n; j=j+i)
            {
                arr[j] = false;
            }
        }

        return arr;
    }
}
