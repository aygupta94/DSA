package recursion;

public class _4_Palindrome {
    public static void main(String[] args) {
        String s = "aba";
        System.out.println(checkPalindrome(s.toCharArray(), 0, s.length()-1) );
    }

    static boolean checkPalindrome(char[] s, int l, int r)
    {
        if(l>=r)
            return true;


        return  (s[l] == s[r]) && checkPalindrome(s, l+1, r-1);
    }
}
