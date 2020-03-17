package FizzBuzz;

public class FizzBuzz {
	public static String fizzBuzz(int number) {
		String returnString = "";
		if ((number%5 == 0) && (number%3 == 0)) {
			returnString = "FizzBuzz";
		}
		else if (number%3 == 0) {
			returnString = "Fizz";
		}
		else if (number%5 == 0) {
			returnString = "Buzz";
		}
		else {
			returnString = ("" + number);
		}
		return returnString;	
	}
}
