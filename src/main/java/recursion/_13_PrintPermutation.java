package recursion;

import java.util.ArrayList;
import java.util.List;
import static recursion.Utlity.swap;


public class _13_PrintPermutation {
    public static void main(String[] args) {
        String s = "ABC";
            List<String> ans = permute(s, 0, s.length(), new ArrayList<String>());
            ans.stream().forEach(System.out::println);
    }

    static List<String> permute(String s, int index, int r, List<String> ans)
    {

        if(index == r)
        {
            ans.add(s);
            return ans;
        }

        for (int i = index; i < r; i++) {
            s= swap(s, index, i);
            permute(s,index+1, r, ans);
            s= swap(s, index, i);
        }

        return ans;
    }
}
