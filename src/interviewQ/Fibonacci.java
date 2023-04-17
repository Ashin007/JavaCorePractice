package interviewQ;

public class Fibonacci {

    public static void main(String[] args){

        int firstNumber = 0;
        int secondNumber = 1;
        int limit = 10;
        int nextFib = 0;

        System.out.println(firstNumber);
        System.out.println(secondNumber);

        for(int i=0;i<limit;i++){

            nextFib = firstNumber + secondNumber;
            System.out.println(nextFib);
            firstNumber = secondNumber;
            secondNumber = nextFib;

        }
    }
}
