class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null) {
            return 0;
        } 
        int curSum = 0;
        int max = nums[0];
        
        for (int i = 0; i < nums.length; i++) {
            curSum += nums[i];
            max = Math.max(curSum, max);
            if (curSum < 0) {
                curSum = 0;
            }
        }
        
        return max;
    }
}


/*
分治法，由于子序列连续，它必然属于上述划分中的某一种情况：

    1.完全属于 left 部分
    2.完全属于 right 部分
    3.属于 crossing 部分（即跨越中点）
*/
class Solution {
	int max(int a,int b,int c)
	{
		return Math.max(Math.max(a,b),c);
	}
	int maxCrossing(int[] nums,int low,int mid,int high)
	{
		int leftMax=Integer.MIN_VALUE,rightMax=Integer.MIN_VALUE;
		int sum=0;
		for(int i=mid;i>=low;i--)
		{
			sum+=nums[i];
			if(sum>leftMax) leftMax=sum;
		}
		sum=0;
		for(int i=mid+1;i<=high;i++)
		{
			sum+=nums[i];
			if(sum>rightMax) rightMax=sum;
		}
		return leftMax+rightMax;
	}
	int maxSubArray(int[] nums,int low,int high)
	{
        if(low==high) return nums[low];//迭代终止条件
		int mid=(low+high)/2;
		return max(maxSubArray(nums,low,mid),maxSubArray(nums,mid+1,high),maxCrossing(nums,low,mid,high));
		
	}
    public int maxSubArray(int[] nums) {
		return maxSubArray(nums,0,nums.length-1);
    }
}

/*
最大子序列，任何a[i]为负时，均不可能作为最大子序列前缀；
任何负的子序列不可能是最优子序列的前缀
*/
class Solution {
	public int maxSubArray(int[] nums) {
		int max=nums[0];
		int sum=0;
		for(int i=0;i<nums.length;i++)
		{
			//if(a[i]<0) continue;
			sum+=nums[i];
			max=Math.max(max,sum);
			if(nums[i]<0) sum=0;//以非负数为起始点，和不可能小于0
		}
		return sum;
    }
}