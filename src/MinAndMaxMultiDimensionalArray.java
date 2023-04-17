
public class MinAndMaxMultiDimensionalArray {

	public static void main(String[] args) {
		//find minimum and maximum number from multidimensional array
		
		int[][] array = {
							{13,9,5},
							{6,616,2},
							{34,99,5}
		};
		
		int min = array[0][0];
		int max=array[0][0];
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				if(min>array[i][j])
					min=array[i][j];
				if(max<array[i][j])
					max=array[i][j];
			}
		}
		
		System.out.println("Minimum is "+min);
		System.out.println("Maximum is "+max);
				
	}

}
