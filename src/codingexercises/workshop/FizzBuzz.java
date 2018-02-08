package codingexercises.workshop;

public class FizzBuzz {

	public static void main(String[] args) {
		System.out.println(fizzbuzz(7));

	}
	
	static String fizzbuzz(int a) {
		if(((a % 3) == 0) && ((a % 5) == 0)) {
			return "fizzbuzz";
		} else if ((a % 3) == 0) {
			return "fizz";
		} else if ((a % 5) == 0) {
			return "buzz";
		} else {
		return ""+a;
		}
	}

}
