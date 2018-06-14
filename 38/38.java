class Solution {
    String say(String str)
    {
        int i=1;
	        int count=1;
	        String s=new String();
	        if(str.length()==1) return "11";
	        for(;i<str.length();i++) 
	        {
	            
	            if(str.charAt(i)==str.charAt(i-1) ) 
	            {
	            	count++;
	            }
	            else 
	            {
	                s+=count;
	                s+=str.charAt(i-1);
	                count=1;
	            }
	                
	        }
	        s+=count;
            s+=str.charAt(i-1);
	        return s;
    }
    public String countAndSay(int n) {
        if(n==1)
            return "1";
        else {
            return say(countAndSay(n-1));
        }
    }
}
//数字规律是countAndSay(n)报数countAndSay(n-1)有几个几

/*使用StringBuilder代替String，可以节省时间

*/
class Solution {
    String say(String str)
    {
        int i=1;
	    int count=1;
	    StringBuilder s=new StringBuilder();
	    if(str.length()==1) return "11";
	    for(;i<str.length();i++) 
	    {
	        
	        if(str.charAt(i)==str.charAt(i-1) ) 
	        {
	        	count++;
	        }
	        else 
	        {
	            s.append(count);
	            s.append(str.charAt(i-1));
	            count=1;
	        }
	            
	    }
        s.append(count);
        s.append(str.charAt(i-1));
	    return s.toString();
    }
    public String countAndSay(int n) {
        if(n==1)
            return "1";
        else {
            return say(countAndSay(n-1));
        }
    }
}