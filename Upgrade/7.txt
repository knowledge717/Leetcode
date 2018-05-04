class Solution {
    public int reverse(int x) {
        int ret=0;
        while(x!=0)
        {
            if(ret>Integer.MAX_VALUE/10||ret<Integer.MIN_VALUE/10)
                return 0;
            ret=ret*10+x%10;
            x/=10;
        }
        return ret;
    }
}
/*
如果在return ret之前判断
if(ret>Integer.MAX_VALUE||ret<Integer.MIN_VALUE)
                return 0;
对于溢出的情况无法判断，如
输入：1534236469
输出：1056389759
预期：0
*/



class Solution {
    public int reverse(int x) {
        long  res = 0;
        while(x!=0){
            res = res*10 + x%10;
            x=x/10;
        }
        
        if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE){
            return 0;
        }
        
        return (int)res;
    }
}
//防止溢出可以将数存储在long类型中
