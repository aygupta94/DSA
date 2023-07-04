package searching;

public class _5_OccurenceOfX {
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 20, 30, 30};
        System.out.println(findOccurenceOfX(arr, 0, arr.length - 1, 20));
    }

    public static int findOccurenceOfX(int arr[], int low, int high, int ele) {

        int firstOccurence = _3_indeOfFirstOcurrenceInSorted.findFirst(arr,0,arr.length -1,ele);

        if(firstOccurence == -1)
            return 0;
        else {
            return (_4_IndexOfLastOccurrenceInSorted.findlast(arr,0, arr.length-1, ele) - firstOccurence + 1);
        }
    }

}
