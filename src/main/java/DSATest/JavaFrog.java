package DSATest;
import java.util.Scanner;

public class JavaFrog {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        int jumps = 0;
        int currentPosition = 0;
        int lastJump = -1;
        int lastJumpValue = -1;

        if (A[0] == 2 && A[1] == 1) {
            currentPosition = 2;
            lastJump = 2;
            jumps = 1;
        }

        while (currentPosition < n - 1) {
            int maxJump = -1;
            int nextPosition = currentPosition;

            for (int j = 1; j <= A[currentPosition]; j++) {
                if (currentPosition + j < n && (j != lastJump || lastJumpValue == 1 || j != lastJumpValue)) {
                    if (A[currentPosition + j] > maxJump) {
                        maxJump = A[currentPosition + j];
                        nextPosition = currentPosition + j;
                    }
                }
            }

            if (maxJump == -1) {
                System.out.println("It is not possible to reach the end");
                return;
            }

            lastJumpValue = A[currentPosition];
            lastJump = (nextPosition - currentPosition == 1) ? A[currentPosition] : nextPosition - currentPosition;
            currentPosition = nextPosition;
            jumps++;
        }

        System.out.println(jumps);
    }
}


