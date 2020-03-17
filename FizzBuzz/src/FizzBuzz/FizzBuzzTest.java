package FizzBuzz;

public class FizzBuzzTest extends FizzBuzz{

	public static void main(String[] args) {
		for (int i = 1; i <+ 100; i++) {
			String temp = fizzBuzz(i);
			System.out.println(temp);
		}
	}

}
