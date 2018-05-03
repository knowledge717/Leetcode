class Solution {
    int[] add(int[] digits,int i)
    {
        digits[i]++;
        if(digits[i]==10) 
        {
            digits[i]=0;
            if(i==0) 
            {
                int[] digit=new int[digits.length+1];
                digit[0]=1;
                for(int j=1;j<digit.length;j++)
                {
                    digit[j]=digits[j-1];
                }
                return digit;
            }
            else{
                return add(digits,i-1);
            }
            
        }
        else
        {
            return digits;
        }
    }
    public int[] plusOne(int[] digits) {
        return add(digits,digits.length-1);
    }
}
