package mathematics;

public class _9_exact3Divisors {

    public static void main(String[] args) {
        System.out.println(exactly3Divisors(10));
    }

    static int exactly3Divisors(int N) {
        //Your code here
        if (N == 1 || N == 2 || N == 3) {
            return 0;
        }

        int divisors = 0;

        for (int i = 9; i < N; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            System.out.print("count: " + count);
            if (count == 3) {
                System.out.print(i + " ");
                divisors++;
            }
        }

        return divisors;
    }
}
