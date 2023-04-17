package interviewQ;

public class CountNumberOfDigit {
    public static void main(String[] args){

        int inputNumber = 12356;
        int digit=0;

        while (inputNumber>0){
            digit++;
            inputNumber = inputNumber/10;
        }
        System.out.println(digit);
    }
}
