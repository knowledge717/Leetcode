class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0)
            return;
        if(m==0 && n!=0){
            for(int i=0;i<n;i++)
                nums1[m+i]=nums2[i];
            return;
        }
        if(nums1[m-1]<nums2[0]){
            for(int i=0;i<n;i++)
                nums1[m+i]=nums2[i];
            return;
        }
        if(nums1[0]>nums2[n-1]){
            for(int i=0;i<m;i++)
                nums1[n+i]=nums1[i];
            for(int i=0;i<n;i++)
                nums1[i]=nums2[i];
            return;
        }
        int i,j;
        for(j=0,i=m-1+j;j<n;j=j+1){
            i=m-1+j;
            if(nums2[j]==nums1[i]){
                nums1[i+1]=nums2[j];
            }                
            while(i>=0 && nums2[j]<nums1[i]){
                nums1[i+1]=nums1[i];
                nums1[i]=nums2[j];
                i=i-1;
            }
            while(i>=0 && nums2[j]>nums1[i]){
                nums1[i+1]=nums2[j];
                i=i+1;
            }
        }
        return;
}
}



//聪明的做法是考虑到两个数组已经从小到大排序，且数组1的后边都空着。
//令两个指针指向两个数据的末尾进行比较大小，大的则直接放在数组1的末尾。
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=m+n-1;
        int i = m-1;
            int j = n-1;
            while(i>=0 && j>=0){
                if(nums1[i]>=nums2[j]){
                    nums1[k--] = nums1[i--];
                }else{
                    nums1[k--] = nums2[j--];
                }
            }
            //可能存在数组1比2遍历的快，这时，直接将数组2填充到数组1的剩余部分
            if(i<0 && j>=0){
                for(int t=j;t>=0;t--){
                    nums1[k--] = nums2[t];
                }
            }
           
    }
}
