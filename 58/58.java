class Solution {
    public int lengthOfLastWord(String s) {
        String[] array=s.split(" ");
        if(array.length==0) return 0;
        else return array[array.length-1].length();
    }
}

//ֱ�Ӽ������һ���ո񵽴�β�ĳ���
class Solution {
    public int lengthOfLastWord(String s) {
         s = s.trim();  
        if (s == null) {  
            return 0;  
        }  
        if (s.lastIndexOf(" ") == -1) {  
            return s.length();  
        }  
        return s.length() - s.lastIndexOf(" ") - 1;         
     }  
}