class Solution {
    public int searchInsert(int[] nums, int target) {
        int low,high;
        int mid=0;
        low=0;
        high=nums.length-1;
        
        if(nums[0]>target)
            return 0;
        if(nums[high]<target)
            return nums.length;
        while(low<high||low==high)
        {
            mid=(low+high)/2;
            if(target<nums[mid])
                high=mid-1;
            else if(target>nums[mid])
                low=mid+1;
            else {
                low=mid;
                break;
            }
        }
        return low;
    }
}

/*
当low和high相等时，指向的值可能与target相等或不等
*/