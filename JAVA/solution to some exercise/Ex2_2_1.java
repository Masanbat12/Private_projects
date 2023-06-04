package EX2;

public class Ex2_2_1 {

public static boolean isPerfect (int n) {
int sum=0;
for (int i = 1; i < n; i++) {
	if(n%i==0) {
		sum+=i;
	}
}
	if(sum==n) {
		return true;
	
}
return false;
}


public static void main(String[] args) {
	int n;
	n=500;
		
	System.out.println(isPerfect(n));
    }
}
