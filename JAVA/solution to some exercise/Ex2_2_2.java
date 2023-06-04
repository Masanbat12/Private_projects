package EX2;

public class Ex2_2_2 {
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
		public static int CountisPerfect(int p) {
			int count=0;
			
			for(int j=2; j<p; j++) {
			if(isPerfect(j)) {
				count++;
			  }
		  }
			return count;
		}

		public static int[] PerfectNumbers(int n) {
			int t=0;
			int [] array = new int [CountisPerfect( n)];
			for (int k = 2; k < n; k++) {
				if(isPerfect(k)) {
					array [t]=k;
					t++;
				}
			}
			return array;
		}
		public static void printArray(int [] array) {
			for(int i=0;i<array.length;i++) {
				System.out.println(array[i]);
			}
		}

		public static void main(String[] args) {
			int n;
			n=500;
				
			printArray(PerfectNumbers(n));
		    }
		}