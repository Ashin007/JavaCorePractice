package interviewQ;

public class SumOfTheDigit {

    public static void main(String[] args){

        int input = 12345;
        int sum = 0;
        int remainder = 0;

        while(input>0){

            remainder = input%10;
            sum = sum + remainder;
            input = input/10;
        }

        System.out.println("Sum: "+ sum);
    }
}
