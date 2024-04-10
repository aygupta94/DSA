package strings.easy;

public class _1_Palindrome {

  public static void main(String[] args) {

    String s = "ABCDCBA";
    System.out.println(isPalindrome(s));
    System.out.println(efficient(s));
  }

  static boolean isPalindrome(String s) {

    StringBuilder revStr= new StringBuilder(s);
    revStr.reverse();
    return s.contentEquals(revStr);

  }

  static boolean efficient(String s) {


    int l=0;
    int r=s.length()-1;
    while(l<r) {
      if(s.charAt(l) != s.charAt(r))
        return false;
      else {
        l++;
        r--;
      }
    }
    return true;
  }

}
