package interviewQ;

public class PalindromeString {

    public static void main(String[] args){

        String input = "qMalayalamq";
        String original= "";

        for(int i=input.length()-1;i>=0;i--){
            original = original+""+input.charAt(i);
        }
        if(input.equalsIgnoreCase(original.toString())){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
