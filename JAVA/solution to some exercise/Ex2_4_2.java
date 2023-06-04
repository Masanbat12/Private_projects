package EX2;

public class Ex2_4_2 {
	public static String dec2Hex(int num) 
	{
		String result = "";
if (num<0) {
	result +="-1";
	return  result;
}
		while(num>0) 
		{
			int temp = num%16;
			if(temp==10) 
			{
				result +='A';
			}else if(temp==11) 
			{
				result +='B';
			}
			else if(temp==12) 
			{
				result +='C';
			}
			else if(temp==13) 
			{
				result +='D';
			}else if(temp==14) 
			{
				result +='E';
			}else if(temp==15)
			{
				result +='F';
			}
			
			else  {
				result += Integer.toString(temp);
			}
			num = num/16;
		}
		return reversString(result);
	}
	
	public static String reversString(String str) 
	{
		String result = "";
		for(int i=str.length()-1; i>=0; i--) 
		{
			result +=str.charAt(i);
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(dec2Hex(-14));
	}
}
