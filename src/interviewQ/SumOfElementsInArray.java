package interviewQ;

public class SumOfElementsInArray {

    public static void main (String[] args){

        int[] myArray = {1,23,4,55,64};

        int sum = getArraySum(myArray);
        System.out.println(sum);
    }

    private static int getArraySum(int[] array){
        int sum =0;
        for(int i=0;i<array.length;i++){
           sum = sum+array[i];
        }

        return sum;
    }
}
