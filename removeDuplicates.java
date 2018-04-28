class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        int j=0;
        for(int i=0;i<nums.length;i=j)
        {
            for(j=i+1 ;j<nums.length;j++ )
            {
            	if (nums[j]!=nums[i]) {
					list.add(j);
					break;
				}
            }
            
        }
        for(int i=0;i<list.size();i++)
        {
          nums[i+1]=nums[list.get(i)];
            
        }
        return list.size()+1;
    }
}
