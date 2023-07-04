package mathematics;

public class _10_NthTermOFGP {

    public static void main(String[] args) {

        System.out.println(termOfGP(84,87,3));
    }

    public static double termOfGP(int A, int B, int N) {
        //Your code here
        double ratio = (double) B / A;
        double nthTerm = (double) A * power(ratio, N - 1);
        return nthTerm;
    }

    static double power(double x, double n) {
        double res = 1;
        while (n > 0) {
            if (n % 2 != 0) {
                // bit is 1
                res = (double) res * x;
            }

            x = (double) x * x;
            n = (int) n / 2;
        }

        return res;

    }
}
