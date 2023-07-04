package mathematics;

public class TrailingZeroesInFactorial {

    public static void main(String[] args) {
        System.out.println(findZeroes3(127));
    }

    private static int findZeroes(int n)
    {

        int count10s = 0;
        int count5s = 0;

        while(n>0)
        {
            int temp=n;
            while(temp%10 == 0)
            {
                count10s++;
                temp=temp/10;
            }

            while(temp%5 == 0)
            {
                count5s++;
                temp = temp/5;
            }

            n--;
        }

        return count10s+count5s;
    }

    //Partially correct, for n < 125;
    private static int findZeroes2(int n)
    {
//        25! = 1*2*3*4*5*6*7*8*9*10---*15----*20-----*25   ->
//        every 5th no multiple of
//        evry 10th no is multiple of 10;
//        every 25th no is multiple of 25;

        int count5s = n/5;  // 5,10,15,20,25
        int count25s = n/25; // 25

        return count5s + count25s;
    }

    private static int findZeroes3(int n)
    {
//        TrailingZeroes = n/5 + n/25 + n/125 .....

        int res=0;
        for(int i=5; i<n; i=i*5)
        {
            res = res + n/i;
        }

        return res;

    }
}
