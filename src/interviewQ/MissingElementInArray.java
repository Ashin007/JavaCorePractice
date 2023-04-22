package interviewQ;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MissingElementInArray {

    public static void main(String[] args){

        //array should be in proper starting and ending range
        //no need to be in sorted
        //should not contain duplicate elements

        int[] array = {3,24,67,34,55,23,6,9,4,8,88};

        int[] myNewArray = fillWithMissingArray(array);
    }

    private static int[] fillWithMissingArray(int[] array){

        ArrayList<Integer> finalArray = new ArrayList<>();

        int value = array[0];
        for (int i=1;i<array.length;i++){

            while(value<array[i]){

                finalArray.add(value);
                value++;
            }
            if(!(finalArray.contains(array[i]))) {
                finalArray.add(array[i]);//6
                value++;
            }
        }
        System.out.println(finalArray);



        return null;
    }
}
