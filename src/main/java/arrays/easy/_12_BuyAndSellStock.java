package arrays.easy;


/**
 * THe problem statement is, we know the price of stock in advance, we have to by and sell stock,
 * so that we can maximize the profit.
 *
 * eg= { 1, 5, 3, 8, 12}
 *       B, S, B,  , S
 *         4      9 = 13
 * 13 is the maximum profit we can get.
 *
 */

public class _12_BuyAndSellStock {
    public static void main(String[] args) {
        int arr[] = {1,5,3,8,12};
        int arr2[] ={1,5,8,3,8,4,5}; // = 7+5+1 = 13 => 4+3
        System.out.println(maxProfit(arr2));
    }

    static int maxProfit(int price[])
    {
        int n =price.length;
        int maxProfit =0;
        for(int i=1; i<n; i++)
        {
            if(price[i] > price[i-1])
                maxProfit += price[i] - price[i-1]; // 4 + 5+ 4
        }

        return maxProfit;
    }
}
