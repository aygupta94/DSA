package DSATest;

import java.util.*;
import java.util.*;
import java.io.*;

import java.util.*;
public class AmazingGraph{
    static long mod = 998244353;
    static long[][][][] dp = new long[5005][5][5][5];

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Initializing all values of dp[][][][] to -1
        for(int i=0;i<=a+b+c;i++){
            for(int j=0;j<5;j++){
                for(int k=0;k<5;k++){
                    Arrays.fill(dp[i][j][k],-1);
                }
            }
        }

        // Calling the recursive function with starting values
        long ans = rec(a,b,c,0,0,0);
        System.out.println(ans%mod);
    }

    public static long rec(int a, int b, int c, int aPrev, int bPrev, int cPrev){
        if(a<0 || b<0 || c<0) return 0;
        if(dp[a][aPrev][bPrev][cPrev]!=-1) return dp[a][aPrev][bPrev][cPrev];
        if(a==0 && b==0 && c==0) return 1;
        long res=0;
        if(aPrev==0){
            res += rec(a-1,b,c,1,bPrev==1?0:2,cPrev==1?0:2);
            res %= mod;
        }
        if(bPrev==0){
            res += rec(a,b-1,c,aPrev==2?0:1,1,cPrev==2?0:2);
            res %= mod;
        }
        if(cPrev==0){
            res += rec(a,b,c-1,aPrev==2?0:1,bPrev==2?0:1,3);
            res %= mod;
        }
        dp[a][aPrev][bPrev][cPrev] = res%mod;
        return dp[a][aPrev][bPrev][cPrev];
    }
}










