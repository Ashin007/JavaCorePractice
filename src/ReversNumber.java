
public class ReversNumber {

	public static void main(String[] args) {
		//reverse a number
		
		reverseNumber(321);

	}

	private static void reverseNumber(int input) {
		int output = 0;
		int remainder = 0;
		while(input>0) {
			remainder = input%10;//5
			output = 10*output+remainder;
			input = input/10;//34
		}
		System.out.println(output);
	}

}
