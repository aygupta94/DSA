package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Using Duplicates of array to print all subset whose sum is equal to given sum
 *
 * I/p = {1,2,3}
 * sum =5;
 *
 * O/p= [ {1,1,1,1,1}, {1,1,1,2}, {1,1,3}, {1,2,2}, {2,3} ]
 *
 *                                                                                                       {1,2,3}
 *                                                  {1} i=0                                                                                                           {} i=1
 *                              {1,1}i=0                                                     {1}i=1                                                           {2}i=2               {}i=3
 *                {1,1,1}i=0                   {1,1}i=1                      {1,2}i=1                           {1}i=2                                     {2,3}i=2        {2}i=3         NT
 *           {1,1,1,1}i=0                    {1,1,1}i=1              {1,1,2}i=1   {1,1}i=2                {1,3}i=2      {1}i=3
 *  {1,1,1,1,1}i=0  {1,1,1,1}i=1     {1,1,1,2}i=1  {1,1,1}i=2
 */

public class _12_SumSubsetsUsingDuplicates {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,5,2,3,6);
        int sum = 8;
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

        if(index == nums.size() || currSum > sum )
        {
            return ans;
        }


        curr.add(nums.get(index));
        currSum += nums.get(index);
        subsets(nums, index,sum, currSum, curr, ans);
        curr.remove(nums.get(index));
        currSum -= nums.get(index);
        subsets(nums, index+1,sum, currSum, curr, ans);


        return ans;
    }
}
