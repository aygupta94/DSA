package recursion;

public class Utlity {

    public static String swap(String s, int source, int dest)
    {
        char[] arr = s.toCharArray();
        char temp = s.charAt(source);
        arr[source] = arr[dest];
        arr[dest] = temp;

        return String.valueOf(arr);


    }
}
