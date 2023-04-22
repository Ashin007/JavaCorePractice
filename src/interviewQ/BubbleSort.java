package interviewQ;

public class BubbleSort {

    public static void main (String[] args){

        int[] array = {23,45,12,34,2,43};
        int temp=0;

        for (int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){

                if(array[i]>array[j]){

                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
                System.out.println("-----Iteration I= "+i+"----J="+j+"--");
                for (int value:array){
                    System.out.println(value);
                }
            }

        }

    }
}
