class Solution {
    public int removeElement(int[] nums, int val) {
        int j=nums.length-1;
        int i=0;
        for(i=0;i<j;)
        {
            if(nums[i]==val)
            {
                if(nums[j]!=val)
                {
                    nums[i]=nums[j];
                    i++;
                }
                j--;
            }
            else{
                i++;
            }
        }
        if(i==j)
        {
            return (nums[i]==val?i:i+1);
        }
        else return i;
    }
}
