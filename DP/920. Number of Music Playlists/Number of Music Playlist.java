class Solution {
    public int numMusicPlaylists(int N, int L, int K) {
        int MOD = 1_000_000_007;
        int[][] dp = new int[L+1][N+1];
        dp[0][0] = 1;
        for(int i = 0; i < L; i ++)
        {
            for(int j = 0; j < N; j ++)
            {
                long ans = 0;
                ans += dp[i][j]*(long)(N-j);
                ans += dp[i][j+1]*(long)Math.max(0,j-K+1);
                dp[i+1][j+1] = (int)(ans % MOD); 
            }
        }
        return dp[L][N];
    }
}