package interviewQ;

public class SearchInteger {
    public static void main(String[] args){

        int[] array = {34,56,2,578,45};

        int searchElement = 2;

        for(int value: array){
            if(value == searchElement){
                System.out.println("Element found");
                break;
            }
        }
    }
}
