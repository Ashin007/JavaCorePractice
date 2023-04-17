 
public class BubbleSort {

	public static void main(String[] args) {
		// Bubble sort
		
		
		int[] array = {3,6,55,33,1,4};
		int temp=0;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					//swap
					temp = array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		for(int i:array) {
			System.out.println(i);
		}
		

	}
	

}