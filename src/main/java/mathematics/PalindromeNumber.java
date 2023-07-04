package mathematics;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome2(989));
    }

    private static boolean isPalindrome(int x)
    {
        String xs = String.valueOf(x);
                char s[]=xs.toCharArray();
        String rev = "";
        for (int i=s.length-1; i>=0; i--) {
            rev = rev + s[i];
        }
        System.out.println(rev);
        return xs.equals(rev);
    }

    private static boolean isPalindrome2(int x)
    {
        int temp = x;
        int rev =0;

        while(x>0)
        {
            rev = rev*10 + x%10;
            x = x/10;
        }
        System.out.println(rev);
        return temp==rev;
    }

}
