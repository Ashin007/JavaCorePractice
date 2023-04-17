package interviewQ;

public class NumberOfEvenAndOddNumbers {
    public static void main(String[] args){

        int input = 1234567892;
        int odd = 0;
        int even = 0;
        int remainder=0;

        while(input>0){
            remainder = input%10;
            if(remainder%2==0){
                even++;
            }
            else{
                odd++;
            }
            input = input/10;
        }

        System.out.println("Odd Count: "+odd);
        System.out.println("Even Count: "+even);

    }
}
