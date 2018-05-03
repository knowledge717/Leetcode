class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length=nums.length;
        int[] result=new int[2];
        boolean flag=false;
        for(int i=0;i<length-1;i++)
        {
            for(int j=i+1;j<length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    result[0]=i;
                    result[1]=j;
                    flag=true;
                    break;
                }
                
            }
            if(flag) break;
        }
        return result;
    }
}
