import java.util.ArrayList;

public class CheckCountOfDuplicateArrayElements {

	public static void main(String[] args) {
		// int[] array = {4,5,5,4,6,9,4}
		//4->3,5->2,9-1
		
		int[] array = {4,5,5,4,6,9,4};
		
		int counter;
		ArrayList<Integer> arrayList = new ArrayList<>(); 
		
		for(int i=0;i<array.length;i++) {
			counter=0;
			if(!arrayList.contains(array[i])) {
				
				arrayList.add(array[i]);
				counter++;
				for(int j=i+1;j<array.length;j++) {
					if(array[i]==array[j]) {
						counter++;
					}
				}
				
				System.out.println(array[i]);
				System.out.println(counter);
			}
		}

	}

}
