
//Create a method which accepts array and returns sum of all the elements in array 

public class SumOfElements {

	public static void main(String[] args) {

		int[] array = {1,4,3,6,7,9};
		System.out.println(getSumOfArray(array));

	}

	public static int getSumOfArray(int[] array) {
		int sumOfArray=0;
		for(int i=0;i<array.length;i++) {
			sumOfArray +=array[i];
		}
		
		return sumOfArray;
		
	}
}
