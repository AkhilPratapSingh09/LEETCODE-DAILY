public class persum {
    class Solution
{
    public int maxSum(int n) 
    { 
        //code here.
        if(n<=4)return n;
        int[] dp= new int[n+1];
        for(int i=1; i<=4; i++){
            dp[i]=i;
        }
        for(int i=4; i<=n; i++){
            dp[i]=Math.max(dp[i/2]+dp[i/3]+dp[i/4], i);
        }
        return dp[n];
    } 
}

}
