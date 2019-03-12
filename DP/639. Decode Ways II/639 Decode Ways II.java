class Solution {
    int M = 1000000007;
    public int numDecodings(String s) {
        long[] dp = new long[s.length() + 1];
        dp[0] = 1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)== '*') {
                dp[i+1] = dp[i]*9;
                if(i>0) {
                    if(s.charAt(i-1) == '1')
                        dp[i+1] += dp[i-1]*9;
                    else if(s.charAt(i-1) == '2')
                        dp[i+1] += dp[i-1]*6;
                    if(s.charAt(i-1) == '*')
                       dp[i+1] += dp[i-1]*9 + dp[i-1]*6;  
                }
            }
            else {
                if(s.charAt(i) == '0') {
                    if(i>0) {
                        if(s.charAt(i-1) == '*')
                            dp[i+1] = 2*dp[i-1];
                        else if(s.charAt(i-1) >'0' && s.charAt(i-1) < '3')
                            dp[i+1] = dp[i-1];
                    }
                }
                else {
                    dp[i+1] = dp[i];
                    if(i>0) {
                        if(s.charAt(i-1) == '*') {
                            if(s.charAt(i) <= '6')
                                dp[i+1] += 2*dp[i-1];  
                            else 
                                dp[i+1] += dp[i-1];
                        }
                        else if(s.charAt(i) <= '6' && s.charAt(i-1) > '0' && s.charAt(i-1) < '3')
                            dp[i+1] += dp[i-1];  
                        else if(s.charAt(i) <= '9' && s.charAt(i-1) > '0' && s.charAt(i-1) < '2')
                            dp[i+1] += dp[i-1];                
                    }
                }
            }
            dp[i+1] %= M;
        }
        return (int) (dp[s.length()]);
    }
}