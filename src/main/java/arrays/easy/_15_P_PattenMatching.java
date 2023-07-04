package arrays.easy;

public class _15_P_PattenMatching {

    public static void main(String[] args) {
//        boolean flag = searchPattern("abcdefh", "bcd");
        boolean flag = searchPattern("hq", "q");
        if (flag) {
            System.out.println("Present");
        }
        else {
            System.out.println("Not Present");
        }

    }

    public static boolean searchPattern(String str, String pat) {
        // code here

        int m = str.length();
        int n = pat.length();

        for(int i=0;i<= m-n;i++)
        {
            int j=0;
            for(;j<n;j++)
            {
                if(str.charAt(j+i)!=pat.charAt(j))
                    break;
            }

            if(j == n)
                return true;
        }

        return false;



    }
}
