### 920. Number of Music Playlists

You have to read this problem very throughly. Then you will find out that K means that, after broadcasting K songs (not including current song), you can freely broadcast current song.

So, we can list a two-D arrary DP[L+1][N+1]. We can know that for lth element & n song were played, the total numbers of ways equals to 2 parts:

1. If nth song is not played at all, we would have: dp[l][n] = dp[l-1][n-1]*(N-n+1) ways
2. If nth song is already played, we would have: dp[l][n] = dp[l-1][n]*(n-k) ways

Then, we can output D[L][N] as total number of playlist for N songs played L times.