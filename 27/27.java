class Solution {
    public int removeElement(int[] nums, int val) {
       int i;
        int j=nums.length;
        for(i=0;i<j;)
        {
           
            if(nums[i]==val)
            {
                nums[i]=nums[--j];
            }
            else i++;
        }
        return i;
    }
}