package strings.easy;

import java.util.Arrays;

public class _3_Anagram {

  static final int CHAR = 256;

  public static void main(String[] args) {
    String s = "aabc";
    String s2 = "cbab";
    System.out.println(isAnagram(s, s2));
    System.out.println(efficientIsAnagram(s, s2));
  }

  // TC: nlogn
  public static boolean isAnagram(String s1, String s2) {

    if (s1.length() != s2.length()) {
      return false;
    }

    char[] str1 = s1.toCharArray();
    Arrays.sort(str1);
    s1 = new String(str1);

    char[] str2 = s2.toCharArray();
    Arrays.sort(str2);
    s2 = new String(str2);

    return s1.equals(s2);
  }

  public static boolean efficientIsAnagram(String s1, String s2) {

    char[] charArray = new char[CHAR];

    if (s1.length() != s2.length()) {
      return false;
    }

    for (int i = 0; i < s1.length(); i++) {
      charArray[s1.charAt(i)]++;
      charArray[s2.charAt(i)]--;
    }

    for (int i = 0; i < CHAR; i++) {
      if (charArray[i] != 0) {
        return false;
      }
    }

    return true;


  }


}
