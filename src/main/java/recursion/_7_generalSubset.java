package recursion;

import java.util.List;

public class _7_generalSubset {
    public static void main(String[] args) {
        String s = "ABC";
        subsets(s, "" , 0);
    }

    static void subsets(String s, String curr, int index)   // ABC => "", "A", "B" "C", "AB", "AC", "BC", "ABC"
    {

        if(index == s.length())
        {
            System.out.println(curr);
            return;
        }

        subsets(s, curr, index +1 );
        subsets(s, curr + s.charAt(index), index +1);
    }
}
