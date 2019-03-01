class Solution {
    public String convert(String s, int numRows) {
        String ans = "";
        if(numRows == 1) return s;
        for(int i = 0; i < numRows; i ++)
        {
            int dis = numRows * 2 - 2;
            for(int j = 0; j < s.length(); j+=dis)
            {
                if(i == 0 && j < s.length()) 
                    ans += s.charAt(j);
                else if(i == numRows-1 && j + i < s.length())
                    ans += s.charAt(j+ i);
                else
                {
                    int lo = j + i, hi = j + dis - i;
                    if(lo < s.length())
                        ans += s.charAt(lo);
                    if(hi < s.length())
                        ans += s.charAt(hi);
                }
            }
        }
        return ans;
    }
}