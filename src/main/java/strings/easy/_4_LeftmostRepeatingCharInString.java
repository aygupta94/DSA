package strings.easy;

public class _4_LeftmostRepeatingCharInString {

  public static void main(String[] args) {
    String s= "abcbc"; // b is the char the is leftmost reoccurring
    System.out.println(leftmostReoccurring(s));
    System.out.println(efficientLeftmostReoccurring(s));
  }

//  TC: O(n2)
  public static int leftmostReoccurring(String s) {

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      for (int j = i+1; j < s.length(); j++) {
        if(c == s.charAt(j))
          return i;
      }
    }

    return -1;
  }

  public static int efficientLeftmostReoccurring(String s) {
    char[] arr = new char[256];
    for (int i = 0; i < s.length(); i++) {
      arr[s.charAt(i)]++;
    }

    for (int i = 0; i < s.length(); i++) {
      if(arr[s.charAt(i)] > 1)
        return i;
    }

    return -1;
  }


}
