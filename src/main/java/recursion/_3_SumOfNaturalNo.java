package recursion;

public class _3_SumOfNaturalNo {
    public static void main(String[] args) {
        System.out.println(sumn(3));
    }

    static int sumn(int n)
    {
        if(n==0)
            return 0;
        return n + sumn(n-1);
    }
}
