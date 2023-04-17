package interviewQ;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PalindromeNumber{

    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number\n");

        int input = scanner.nextInt();
        int originalNumber = input;

        if(originalNumber==reverseNumber(input)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }

    private static int reverseNumber(int input){

        int remainder,result=0;
        while(input>0) {
            remainder = input % 10;
            result = result * 10 + remainder;
            input=input/10;
        }
        return result;
    }
}
