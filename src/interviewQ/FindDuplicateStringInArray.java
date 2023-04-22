package interviewQ;

import java.util.HashSet;

public class FindDuplicateStringInArray {

    public static void main(String[] args){

        String[] myStrings = {"Java","C#","Python","C#","Python"};

        for(int i=0;i<myStrings.length;i++){
            for(int j=i+1;j<myStrings.length;j++){
                if(myStrings[i].equalsIgnoreCase(myStrings[j])){
                    System.out.println(myStrings[i]+" is the duplicate value");
                    break;
                }
            }

        }

        //using hashset

        System.out.println("----Hash Set Logic----");

        boolean isDuplicate = false;
        HashSet<String> mySet = new HashSet<>();

        for(String value: myStrings){
                if(!(mySet.add(value))){
                    isDuplicate = true;
                    System.out.println("Duplicate value is "+value);
                    //break;
                }

        }

        if(!isDuplicate)
            System.out.println("No duplicate elements");
    }
}
