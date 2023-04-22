package interviewQ;

import java.util.ArrayList;

public class PrintEvenAndOdd {

    public static void main(String[] args){

        int[] array = {23,56,3,4,789,78,34,556};
        ArrayList<Integer> oddArrayList = new ArrayList<>();
        ArrayList<Integer> evenArrayList = new ArrayList<>();

        for(int value: array){
            if(value%2==0){
                evenArrayList.add(value);
            }
            else{
                oddArrayList.add(value);
            }
        }

        System.out.println("Odd List: "+ oddArrayList);
        System.out.println("Even List: "+ evenArrayList);
    }
}
