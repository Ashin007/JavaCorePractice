package javaCodingPractice;

public class MajorityElement {
	
	public static void main(String[] args) {
		
		//{4,5,67,3,5,6,3,2,3,3} print majority of element from the array
		
		int [] array = {4,5,4,4,4,4,67,3,5,6,3,2,3,3};
		
		mySolution(array);
	}

	private static void mySolution(int[] array) {
		
		int majorityElement = array[0];
		int counter;
		int stableCounter =0;
		
		for(int i=0;i<array.length;i++) {
			counter=0;
			
			for(int j=0;j<array.length;j++) {
				
				if(array[i]==array[j]) {
					counter++;
					System.out.println(counter+" i "+i+" j "+j);
				}
			}
			if(counter>stableCounter) {
				majorityElement = array[i];
			}
			
			
		}
		System.out.println(majorityElement);
		
	}

}
