package searching.easy;

public class _9_FindPeakElement {

  public static void main(String[] args) {
    int arr[] = {10, 20, 40, 30, 50, 70, 80, 60}; // 40 or 80
    int arr2[] = {2, 4, 3};
    int arr3[] = {14,10, 5, 13,13, 8 , 6};
    System.out.println(peakElement(arr3));
  }

  private static int peakElement(int arr[]) {
    int low = 0;
    int n = arr.length;
    int high = n - 1;
    int mid;
    if (n == 0) {
      return arr[0];
    }
    while (low <= high) {
      mid = (low + high) / 2;

      if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid])) {
        return arr[mid];
      }

      if (mid > 0 && arr[mid - 1] > arr[mid]) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }

    }
    return -1;
  }
}
