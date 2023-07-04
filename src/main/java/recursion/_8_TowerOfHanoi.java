package recursion;

public class _8_TowerOfHanoi {
    public static void main(String[] args) {
        printMovements(3, "A", "B", "C");
    }

    static void printMovements(int n, String source, String auxillary, String destination)
    {
        if (n == 1) {
            System.out.println("Move Disk 1 from "+ source+" to " + destination);
            return;
        }
        printMovements(n-1, source, destination, auxillary);
        System.out.println("Move Disk "+ n + " from "+ source+" to " + destination);
        printMovements(n-1, auxillary, source, destination);
    }
}
