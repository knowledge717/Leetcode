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
//�Ż��㷨˼·������ֱ��ͨ���Ƚ������ַ������Ǽӻ��Ǽ�������ǷǷ������ַ�ֱ��break