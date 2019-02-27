class Solution {
    public int swimInWater(int[][] grid) {
        int N = grid.length;
        int lo = 0, hi = N*N;
        while(lo < hi)
        {
            int mid = lo + (hi-lo)/2;
            int[][] memory = new int[N][N];
            if(dfs(grid,memory,mid,0,0))
                hi = mid;
            else
                lo = mid + 1;
        }
        return lo;
    }
    int[][] dirs = {{-1,0},{1,0},{0,1},{0,-1}};
    boolean dfs(int[][] grid, int[][] memory, int n, int x, int y)
    {
        if(memory[x][y] != 0) return false;        
        if(grid[x][y] > n) return false;
        if(x == grid.length-1 && y == grid.length-1) return true;
        memory[x][y] = 1;
        for(int[] dir : dirs)
        {
            int newx = x + dir[0], newy = y + dir[1];
            if(newx >= 0 && newy >= 0 && newx < grid.length && newy < grid.length)
            {
                
                if(dfs(grid,memory, n, newx,newy))
                    return true;
            }
        }
        return false;
    }
}