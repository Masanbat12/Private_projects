package EX2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2_1 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);

	System.out.println( "enter a number:");
	int n = s.nextInt();


	int [] intArray=primeDividers(n);
	System.out.println(Arrays.toString(intArray));
	s.close();
}
	
 public static int []  primeDividers(int n)
 {
	
	int[] res = new int[primeDividersCount(n)];
	
	int count=0,c=n;
	for (int i = 2; i <= n; i++) 
	{
		if(isPrime(i))
		{
			while(n%i==0) 
			{
				res[count]=i;
				count++;
				n/=i;
			}		
		}
	}
		
	   
    
  	
	return res;
 }
 
public static int primeDividersCount(int n) {

	int count=0,c=n;
	for (int i = 2; i <= n; i++) 
	{
		if(isPrime(i))
		{
			while(n%i==0) 
			{
				count++;
				n/=i;
			}		
		}
	}
	return count;
   }

public static  boolean isPrime(int n) {
	int count2=0;
	for(int i=2; i<n; i++) {
		if(n%i==0){
			count2++;
		}
	}
	if(count2!=0) 
	{
		return false;
	}
	else 
	{
		return true;
	}
}
}
