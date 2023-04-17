
public class MaxDifferenceBetweenAdjacentArray {

	public static void main(String[] args) {
		// Find maximum difference between adjacent array element
		//{2,4,7,9,20,42} output-->42-20=22
		
		int[] array = {2,4,23,99,20,42};
		System.out.println(maxAdjacentDifference(array));

	}
	
	public static int maxAdjacentDifference(int[] array) {
		
		int difference = 0;
		for(int i=0;i<array.length-1;i++) {
			
			if(array[i+1] - array[i] > difference)
				difference = array[i+1] - array[i];
		}
		
		return difference;
	}

}
