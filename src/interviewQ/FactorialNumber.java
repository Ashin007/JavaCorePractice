package interviewQ;

public class FactorialNumber {

    public static void main(String[] args){

        int factorialInput = 5;

        int result = 1;
        int value;

        for (int i=2;i<=factorialInput;i++){

            result = result * i;
        }
        System.out.println(result);
    }
}
