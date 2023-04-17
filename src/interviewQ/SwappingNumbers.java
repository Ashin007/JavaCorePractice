package interviewQ;

public class SwappingNumbers {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		int c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
		
		 a = 10;
		 b = 20;
		 
		 System.out.println(a);
			System.out.println(b);
		 a=a+b;//30
		 b=a-b;//30-20=10
		 a=a-b;//30-10=20
		 System.out.println(a);
			System.out.println(b);
		
	}
}
