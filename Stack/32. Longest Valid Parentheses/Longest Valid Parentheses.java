class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int max = 0;
        for(int i = 0; i < s.length(); i ++)
        {
            char c = s.charAt(i);
            if(c == '(')
            {
                stack.add(i);
            }
            else
            {
                if(stack.size() == 1)
                {
                    stack.add(i);
                }
                else if(s.charAt(stack.peek()) == '(')
                {
                    stack.pop();
                    max = Math.max(i - stack.peek(),max);
                }
                else
                {
                    stack.add(i);
                }
            }
        }
        return max;
    }
}