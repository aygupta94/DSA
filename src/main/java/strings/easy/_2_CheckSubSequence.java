package strings.easy;

/*
Subsequence of String "ABC" can be any string with removing one or more character,
such that remaining characters are still in order.
subsequences:
""
A
B
C
AB  // Note BA is not subsequence as order of chars are changed;
BC
AC
ABC

Total subsequence = 2^n = 2^3 = 8
 */
public class _2_CheckSubSequence {

  public static void main(String[] args) {
    String s = "ABCD";
    String s2 = "ADB";

    System.out.println(isSubsequence(s,s2));
    System.out.println(isSubsequenceRecursive(s,s2,s.length()-1,s2.length()-1));
  }

  static boolean isSubsequence(String s, String s2) {

    if(s.length() < s2.length())
      return false;

    int i = 0;

    for (int j = 0; j < s.length(); j++) {
      if (s2.charAt(i) == s.charAt(j)) {
        i++;
        if( i == s2.length())
        {
          return true;
        }
      }
    }

    return i == s2.length();

  }

  static boolean isSubsequenceRecursive(String s, String s2, int n, int m) {

    if(m==0)
      return true;
    if(n==0)
      return false;

    if(s2.charAt(m) == s.charAt(n))
        return isSubsequenceRecursive(s,s2,n-1, m-1);
    else
        return isSubsequenceRecursive(s,s2,n-1, m);
  }

}
