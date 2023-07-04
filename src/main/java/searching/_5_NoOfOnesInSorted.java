package searching;

public class _5_NoOfOnesInSorted {
    public static void main(String[] args) {
        int arr[] = {0,0,0,1,1,1,1};
        System.out.println(findOnes(arr, 0, arr.length-1));
    }

    public static int findOnes(int []arr, int low, int high)
    {
        int firstOccurence = _3_indeOfFirstOcurrenceInSorted.findFirst(arr, 0, arr.length-1, 1);
        if(firstOccurence == -1)
            return 0;
        else
            return arr.length - firstOccurence;
    }
}
