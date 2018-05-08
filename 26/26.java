class Solution {
    public int removeDuplicates(int[] nums) {
        int i;
        int j;
        for(i=0,j=i+1;j<nums.length;)
        {
            if(nums[i]!=nums[j])
            {
                nums[++i]=nums[j];
            }
            j++;
            
        }
        return i+1;
    }
}