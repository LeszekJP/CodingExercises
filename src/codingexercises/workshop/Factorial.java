package codingexercises.workshop;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(recursiveFactorial(4));
		System.out.println(iterationFactorial(4));

	}
	
	static int recursiveFactorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * recursiveFactorial(n-1);
		}
	}
	
	static int iterationFactorial(int n) {
		int result = 1;
		
		for(int i = 1; i <= n; i++) {
			result = result  * i;
		}
		return result;
	}

}
