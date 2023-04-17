
public class SortingOfArray {

	public static void main(String[] args) {
		//Array Sorting
		
		int[] arraySample = {5,6,4,44,67,3};
		int temp = 0;
		for(int i=0;i<arraySample.length;i++) {
			for(int j=0;j<arraySample.length;j++) {
				if(arraySample[i]<arraySample[j]) {
					System.out.println(i+""+j+"true");
					temp=arraySample[i];
					arraySample[i]=arraySample[j];
					arraySample[j]=temp;
					System.out.println(arraySample[i]+""+arraySample[j]);
				}
			}
			System.out.println("-----------");
			for(int k:arraySample) {
				System.out.println(k);
			}
		}
		
			System.out.println(arraySample.toString());
		
	}

}
