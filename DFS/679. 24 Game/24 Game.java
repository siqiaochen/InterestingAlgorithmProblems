class Solution {
    public boolean judgePoint24(int[] nums) {
        List<Double> nums1 = new LinkedList<Double>();
		for(int i : nums) {
			nums1.add((double)i);
		}
        return calculate(nums1);
    }
	char[] ops = {'+','-','*','/'};
	private boolean calculate(List<Double> nums)
	{
        if(nums.size() == 0) return false;
		if(nums.size() == 1) { 
            double ans = Math.abs(nums.get(0) - 24); 
            //if(ans < 1)
            //System.out.println(ans);
            return ans < 1e-10;
        }
		for(int i = 0;i < nums.size(); i ++)
		{
			for(int j = 0; j < nums.size(); j++)
			{
				if(i == j) continue;
                List<Double> list = new LinkedList<Double>();
				for(int k = 0; k < nums.size(); k ++)
					if(k != i && k != j) list.add(nums.get(k));
				for(char op : ops)
				{
					if(op == '+')		list.add(nums.get(i) + nums.get(j));
					else if (op == '-')	list.add(nums.get(i) - nums.get(j));
					else if (op == '*') list.add(nums.get(i) * nums.get(j));
					else if (nums.get(j) != 0) list.add(nums.get(i) / nums.get(j));
                    else continue;
                    if(calculate(list)) return true;		
                    list.remove(list.size()-1);				    
                }
			}
		}
		return false;		
	}
}