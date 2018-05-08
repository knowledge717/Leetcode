class Solution {
    public int romanToInt(String s) {
        char []chr = s.toCharArray();
		int res=0;
		for(int i=0;i<chr.length;i++) {
			switch (chr[i]) {
			case 'C':
				if(i+1<chr.length) {
					if(chr[i+1]=='D'||chr[i+1]=='M') {
						res-=100;
						break;
					}
						
				}
				res+=100;
				break;
			case 'X':
				if(i+1<chr.length) {
					if(chr[i+1]=='L'||chr[i+1]=='C') {
						res-=10;
						break;
					}
					
				}
				res+=10;
				break;
			case 'I':
				if(i+1<chr.length) {
					if(chr[i+1]=='V'||chr[i+1]=='X') {
						res-=1;
						break;
					}
				}
				res+=1;
				break;
			case 'M':
				res+=1000;
				break;
			case 'D':
				res+=500;
				break;
			case 'L':
				res+=50;
				break;
			case 'V':
				res+=5;
				break;
			default:
				break;
			}
		}
		
		return res;  
    }
}
//优化算法思路清晰，直接通过比较两个字符决定是加还是减；如果是非法罗马字符直接break