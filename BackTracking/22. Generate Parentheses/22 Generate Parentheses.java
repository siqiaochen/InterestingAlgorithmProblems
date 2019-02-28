class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> alist = new ArrayList<>();
        gP(n,0,0,"",alist);
        return alist;
    }
    void gP(int n, int ind, int bal, String str, List<String> ans)
    {
        if(ind == n) ans.add(str);
        if(bal + ind < n)        
            gP(n, ind, bal+1, str+"(",ans);   
        if(bal > 0)
            gP(n, ind+1, bal-1, str+")",ans);    
        
    }
}