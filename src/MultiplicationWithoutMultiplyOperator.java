
public class MultiplicationWithoutMultiplyOperator {

	public static void main(String[] args) {
		
		System.out.println(doMultiply(7,7));

	}
	
	public static int doMultiply(int firstNumber,int secondNumber) {
		
		int output = 0;
		for(int i=0;i<secondNumber;i++) {
			output +=firstNumber;
		}
		return output;
	}

}
