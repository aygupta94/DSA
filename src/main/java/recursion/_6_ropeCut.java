package recursion;

public class _6_ropeCut {
    public static void main(String[] args) {
        System.out.println(cuts(5, 2, 5, 1));
    }

    static int cuts(int n, int a, int b, int c)
    {
        if(n<0)
            return -1;

        if(n==0)
            return 0;

        int res = Math.max(Math.max(cuts(n-a, a,b,c), cuts(n-b, a,b,c)) ,  cuts(n-c, a,b,c)) ;

        return res == -1? -1 : res +1;
    }
}

//TC = Omega(3^n)
