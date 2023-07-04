package arrays.medium;

import java.util.ArrayList;

public class _16_SegmentsBuyAndSellStock {

    public static void main(String[] args) {
        int[] A={100,180,260,310,40,535,695};
//        int A[] = {822, 754, 1689, 305, 214, 782, 1463, 1432, 1382, 1734, 948, 231, 210, 1676, 877, 670, 1384,
//            725, 1370, 412, 724, 371, 928, 358, 533, 1031, 850, 1555, 1064, 845, 1692, 514, 630, 1333, 1640, 315,
//                1639, 1792, 1779, 1325, 1619, 1400, 378, 145, 913, 901, 1652, 530, 1259, 880, 303, 685, 1586};
//        int A[] = {565, 278, 1254, 1300, 713, 593, 786, 1133, 369, 894, 159, 598, 1517, 1581, 1032, 379, 534,
//                1154, 710, 1706, 1238, 1532, 670, 800, 743, 417, 1005, 1670, 1442, 367, 472, 1010, 610,
//                828, 1771, 174, 933, 1712, 1557, 104, 353, 276, 1443, 1797, 1474, 286, 580, 1136, 1001, 1800,
//                262, 217, 1315, 516, 1386, 703, 554, 1670, 493, 1368, 247, 1570, 492};
        int n = A.length;
        int p = 0;
        for(int i=0; i<n-1; i++)
            p += Math.max(0,A[i+1]-A[i]);

        ArrayList<ArrayList<Integer> > ans = stockBuySell3(A, A.length);
        if(ans.size()==0)
            System.out.print("No Profit");
        else{
            int c=0;
            for(int i=0; i<ans.size(); i++)
                c += A[ans.get(i).get(1)]-A[ans.get(i).get(0)];

            System.out.println("C: "+ c + " P: "+p);
            if(c==p)
                System.out.print(1);
            else
                System.out.print(0);
        }System.out.println();
    }
    //        int[] A={100,180,260,310,40,535,695};
    static  ArrayList<ArrayList<Integer> > stockBuySell(int price[], int n)
    {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        int i=0;
        while(i<n-1)
        {
            //finding local minima or buying price
            while(i<n-1 && price[i+1]<=price[i])
            {
                i++;
            }
            if(i==n-1)
            {
                break;
            }
            ArrayList<Integer> temp=new ArrayList<>();
            temp.add(i++);//buying price
            //finding local maxima or selling price
            while(i<n-1 && price[i+1]>=price[i])
            {
                i++;
            }
            temp.add(i++);
            ans.add(temp);
        }
        return ans;
    }

    static ArrayList<ArrayList<Integer>> stockBuySell2(int arr[], int n) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> segments = new ArrayList<Integer>();

        int profit = 0;
        for (int i = 0; i < n - 1; i++)
            profit += Math.max(0, arr[i + 1] - arr[i]);
        System.out.println("profit" + profit);

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1] && segments.isEmpty()) {
                segments.add(i);
                //                segments.add(arr[i+1]);
            }

            if (!segments.isEmpty() && arr[segments.get(segments.size() - 1)] < arr[i + 1]) {
                if (segments.size() == 1)
                    segments.add(i + 1);
                else
                    segments.set(segments.size() - 1, i + 1);
            } else if (!segments.isEmpty()) {
                ans.add(segments);
                segments = new ArrayList();
            }

        }

        if(!segments.isEmpty())
            ans.add(segments);
        return ans;
    }

    static ArrayList<ArrayList<Integer>> stockBuySell3(int A[], int n) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> segments = new ArrayList<Integer>();
        int lastBuy=0;
        int profit =-A[0];

        for(int i=1; i<n; i++)
        {
            if(A[i]<= A[lastBuy])
            {
                profit += A[lastBuy];
                profit -= A[i];
                lastBuy =i;
            } else {
                segments.add(lastBuy);
                segments.add(i);
                ans.add(segments);
                segments = new ArrayList<>();
                lastBuy =i;
            }
        }

        profit +=A[n-1];
        return ans;

    }
}
