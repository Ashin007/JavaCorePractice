package interviewQ;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Ashin";
		String output = "";
		for(int i = str.length()-1;i>=0;i--) {
			output = output+str.charAt(i);
		}
		System.out.println(output);
		
		String str1 = "Vijayan";
		char[] a = str.toCharArray();
		
		output = "";
		for(int i=a.length-1;i>=0;i--) {
			output = output+a[i];
		}
		System.out.println(output);
		
		StringBuilder str3 = new StringBuilder("Ashin");
		System.out.println(str3.reverse());
	}
	
	
}
