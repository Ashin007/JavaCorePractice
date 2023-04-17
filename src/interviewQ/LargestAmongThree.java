package interviewQ;

import java.lang.reflect.Array;
import java.util.Scanner;

public class LargestAmongThree {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        int[] inputArray = new int[3];

        for (int i=1;i<=3;i++){
            System.out.println("Enter "+i+"th Value\n");
            inputArray[i-1] = scanner.nextInt();

        }
//        if(inputArray[0]>inputArray[1]){
//            if(inputArray[0]>inputArray[2]){
//                System.out.println("Highest is 1");
//            }
//            else{
//                System.out.println("Highest is 3");
//            }
//        }else if(inputArray[1]>inputArray[2]){
//            System.out.println("Highest is 2");
//        }
//        else{
//            System.out.println("Highest is 3");
//        }

        // Using ternary operator

        int largestOne = inputArray[0]>inputArray[1]?inputArray[0]:inputArray[1];
        int largestFinal = largestOne>inputArray[2]?largestOne:inputArray[2];
        System.out.println(largestOne);
        System.out.println(largestFinal);
    }
}
