class Solution {
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
	        boolean left=false;
	        boolean right=false;
	        int sub=0;
	        while(i<j)
	        {
	            //是否为数字字母
	           left=(Character.isDigit(s.charAt(i))||Character.isLetter(s.charAt(i)) );
	           right=(Character.isDigit(s.charAt(j))||Character.isLetter(s.charAt(j)));
	           if(!left) i++;
	            if(!right) j--;
	            if(left&&right) {
                    //相等或者不为大小写
	                if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j)))
	                return false;
	            else {
	                i++;
	                j--;
	            }
	            }   
	            
	        }
	        return true;
    }
}
//直接使用s.charAt()方法确定字符