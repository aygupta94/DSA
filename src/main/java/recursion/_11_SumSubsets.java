package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _11_SumSubsets {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,5,2,3,6);
        int sum = 0;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        ans = subsets(nums, 0, sum, 0, curr, ans);

        ans.stream().forEach(l -> {
            l.stream().forEach(e ->System.out.print(" " +e));
            System.out.println();
        });
    }

    static List<List<Integer>> subsets(List<Integer> nums,int index, int sum, int currSum, List<Integer> curr, List<List<Integer>> ans)
    {

        if(currSum == sum)
        {
            ans.add(new ArrayList<>(curr));
            return ans;
        }

        if(index == nums.size() )
        {
            return ans;
        }


        curr.add(nums.get(index));
        currSum += nums.get(index);
        subsets(nums, index+1,sum, currSum, curr, ans);
        curr.remove(nums.get(index));
        currSum -= nums.get(index);
        subsets(nums, index+1,sum, currSum, curr, ans);


        return ans;
    }
}
