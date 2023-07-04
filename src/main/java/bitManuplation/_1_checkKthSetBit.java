package bitManuplation;

public class _1_checkKthSetBit {

    public static void main(String[] args) {
        System.out.println(isSet(0,3));
    }

    static boolean isSet(int n, int k)
    {
        int bitMask =0;
        if(k==0)
            bitMask = k;
        else if( k>0)
            bitMask = (int) Math.pow(2d, k-1);

        if((n & bitMask) == 1)
            return true;
        return false;

    }
}
