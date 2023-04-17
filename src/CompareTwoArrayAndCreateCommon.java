import java.util.ArrayList;

public class CompareTwoArrayAndCreateCommon {

	public static void main(String[] args) {
		// Compare two array and common index value should place it in different array
		
		
		int a =5;
		int b = 7;
		
		a=b+a;//5+7 = 12
		b=a-b;//12-7 = 5
		a=a-b;//12-5=7;
		
		System.out.println(a);
		System.out.println(b);
		
		int[] array1 = {2,5,7,6,9,12};
		int[] array2 = {1,5,6,6,12,12}; //-->{5,9}
		
		System.out.println(compareTwoArrayAndGetCommon(array1,array2));

	}
	
	public static ArrayList<Integer> compareTwoArrayAndGetCommon(int[] arrayOne,int[] arrayTwo) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		for(int i=0;i<arrayOne.length;i++) {
			if(arrayOne[i]==arrayTwo[i])
				arrayList.add(arrayOne[i]);	
		}
		
		return arrayList;
		
	}

}
