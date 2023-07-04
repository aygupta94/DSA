package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _10_PrintSubsets {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        ans = subsets(nums, 0,  curr, ans);

        ans.stream().forEach(l -> {
            l.stream().forEach(e ->System.out.print(" " +e));
            System.out.println();
        });
    }

    static List<List<Integer>> subsets(List<Integer> nums,int index, List<Integer> curr, List<List<Integer>> ans)
    {


        if(index == nums.size() )
        {
            ans.add(new ArrayList<>(curr));
            return ans;
        }


        curr.add(nums.get(index));
        subsets(nums, index+1, curr, ans);
        curr.remove(nums.get(index));
        subsets(nums, index+1, curr, ans);


        return ans;
    }
}
