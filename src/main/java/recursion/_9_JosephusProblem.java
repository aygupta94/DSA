package recursion;

public class _9_JosephusProblem {
    public static void main(String[] args) {
        System.out.println(jose(5,3));
    }

    static int jose(int n, int k)
    {
        if(n==1)
            return 0;

        return (jose(n-1,k) + k) % n;
    }
}
