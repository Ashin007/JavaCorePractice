package interviewQ;

import java.util.Random;

public class GenerateRandomNumbersAndString {

    public static void main(String[] args){

        Random random = new Random();

        int myRandomInt = random.nextInt(100);
        System.out.println("Using Random Class: "+myRandomInt);

        System.out.println("Using Math Static object: "+Math.random());

    }
}
