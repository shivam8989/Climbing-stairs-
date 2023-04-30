package Dynamic_Programming;

public class Climbing_Stairs {
    public static int Countways(int n, int dp[]){
        if(n==0 || n==1){
            return 1;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n] = Countways(n-1,dp)+Countways(n-2,dp);
        return dp[n];

    }
    public static int tabulation(int n){
        int dp [] = new int [n+1];
        dp[0] = 1;
        dp[1] = 1;
        int ans = 0;
        for(int i =2; i<=n; i++){
            dp[i]= dp[i-1]+dp[i-2];
            ans = dp[i];
        }
        return ans;
    }
    public static void main(String args []){
        int n = 3;
        int dp[] = new int[n+1];
        System.out.println(Countways(n,dp));
        System.out.println(tabulation(n));

    }
}
