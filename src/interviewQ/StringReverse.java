package interviewQ;

public class StringReverse {

	public static void main(String[] args) {
		String input = "Hey this is ashin from kerala";
		StringBuilder output = new StringBuilder();
		
		String[] myData = input.split("\\s");
		StringBuilder stringB;
		for(String str:myData) {
			stringB = new StringBuilder(str);
			output.append(stringB.reverse()+" ");		
		}
		System.out.println(new String(output).trim());

	}

}
