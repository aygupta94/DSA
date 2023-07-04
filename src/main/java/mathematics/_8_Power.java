package mathematics;

public class _8_Power {
    public static void main(String[] args) {
        System.out.println(power3(4,5));
    }

    static int power(int x, int n)
    {
        if(n==0)
            return 1;

        int res = 1;
        for(int i=1; i<=n; i++)
        {
            res = res * x;
        }

        return res;
    }

    static int power2(int x, int n)
    {
        if(n==0)
            return 1;
//                                      1*3*3       1*3         1
        int temp = power2(x,n/2);  //pow(3,2), pow(3,1), pow(3,0)
        if(n%2==0)
            return temp*temp;
        else
            return temp*temp*x;
    }

    static int power3(int x, int n)  // 4,5 => 4, 101
    {
        int res =1;
        while(n>0)  //  4, 2, 1
        {
            if(n%2!=0)
            {
                //Bit is 1    // 0*2^2
                res = res *x;           //4
            }
            else {
                //bit is 0   => 0*2^0 + 0*2^1
                x= x*x;   //3*3 , 9*9
            }

            n=n/2;
        }

        return res;
    }
}
