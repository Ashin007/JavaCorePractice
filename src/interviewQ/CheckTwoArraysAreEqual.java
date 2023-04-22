package interviewQ;

public class CheckTwoArraysAreEqual {

    public static void main(String[] args){

        int[] array1 = {22,45,26,81};
        int[] array2 = {26,45,22,81};
        boolean check = true;
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array2.length;j++){

                if(array1[i]==array2[j]){
                    break;
                }
                else{
                    if(j==array2.length-1) {
                        check = false;
                    }
                }
            }
        }
        System.out.println(check);
    }
}
