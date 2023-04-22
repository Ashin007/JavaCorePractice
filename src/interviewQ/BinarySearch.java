package interviewQ;

public class BinarySearch {
    public static void main(String[] args){

        int[] array = {10,14,17,23,27,29,34,37,39,40};
        int searchValue = 37;
        int lower = 0;
        int higher = array.length-1;
        int mid = 0;
        boolean isFound = false;

        while(lower<higher){

            mid = (lower+higher)/2;
            if(array[mid]==searchValue){
                System.out.println("Element found");
                isFound = true;
                break;
            }
            if(array[mid]<searchValue){
                lower = mid+1;
            }
            else{
                higher = mid-1;
            }
        }

        if(!isFound){
            System.out.println("Not found");
        }
    }
}
