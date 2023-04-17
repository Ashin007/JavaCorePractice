package interviewQ;

public class ReverseNumber {

	public static void main(String[] args) {
	
		int input = 123;
		int remainder=0,result=0;
		while(input>0) {
			remainder = input%10;//3
			result = result*10+remainder;
			input = input/10;
			 
		}
		System.out.println(result);

	}

}
