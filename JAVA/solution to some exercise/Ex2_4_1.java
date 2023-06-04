package EX2;

public class Ex2_4_1 {
	public static int hex2Dec(String hex) {
	int sum=0 ;
	int j=0;
		for (int i = hex.length()-1; i >=0; i--) {
		sum +=charToInt(hex.charAt(i))*Math.pow(16, j++) ;
				
		}
		return sum;
	}

	private static double charToInt(char c) {
		if(c=='A') 
		{
			return 10;
		}else if(c=='B') 
		{
			return 11;
		}
		else if(c=='C') 
		{
			return 12;
		}
		else if(c=='D') 
		{
			return 13;
		}else if(c=='E') 
		{
			return 14;
		}else if(c=='F')
		{
			return 15;	
		}
		else {
			return c-'0';
		}
		
	}
	public static void main(String[] args) {
		System.out.println(hex2Dec("42F1B8"));
	}

}


