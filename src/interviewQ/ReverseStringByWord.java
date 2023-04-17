package interviewQ;

public class ReverseStringByWord {

	public static void main(String[] args) {
		
		String input = "Hey this is ashin from kerala ";
		StringBuilder output = new StringBuilder();
		StringBuilder sample;
		int space = 0;
		
		
		for(int i=0;i<input.length();i++) {
			
			if((int) input.charAt(i) ==32) {
				sample = new StringBuilder();
				for(int j=i-1;j>=space;j--) {
					sample.append(input.charAt(j));
				}
				output.append(sample);
				space = i;
			}
			
		}
		System.out.println(output);

	}

}
