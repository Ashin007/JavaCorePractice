
public class NoOfOccurance {

	public static void main(String[] args) {
		// find no of occurance in a string
		//noOfOccurance("ajdaajdla","a");-->4
		
		noOfOccurance("jjdl",'j');

	}

	private static void noOfOccurance(String inputString, char occuranceInput) {
		
		int counter = 0;
		for(int i=0;i<inputString.length();i++) {
			
			if(inputString.charAt(i)==occuranceInput) {
				counter++;
			}
			
			
		}
		System.out.println(counter);
	}

}
