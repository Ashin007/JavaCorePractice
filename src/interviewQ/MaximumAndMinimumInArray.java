package interviewQ;

public class MaximumAndMinimumInArray {

    public static void main(String[] args){

        int[] array = {123,45,6,134,12};

        int max = array[0];
        int min =array[array.length-1];

        for(int value: array){
            if(value>max){
                max = value;
            }
            if(value<min){
                min = value;
            }
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }
}
