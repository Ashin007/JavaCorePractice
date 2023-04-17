import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		//prime or not
		
		//int input = 9;
		//System.out.println(2%2);
		
//	for(int i=2;i<100;i++) {
//		primeOrNot(i);
//	}
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
				primeOrNot(input);
}
	private static void primeOrNot(int input) {
		boolean flag = true;
		for(int i=2;i<input;i++) {
			
			if(input%i==0) {
				
				flag = false;
				break;
			}
			
		}
		
		if(flag)
			System.out.println("Prime"+input);
		
	}
	
}
