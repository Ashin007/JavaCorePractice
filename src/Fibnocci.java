
public class Fibnocci {

	public static void main(String[] args) {
		// 1 2 3 5 8 13
		int first = 0;
		int second =1;
		int sum =0;
		for(int i=0;i<20;i++) {
			
			sum=first+second;
			System.out.println(sum);
			first = second;
			second = sum;
			
		}

	}

}
