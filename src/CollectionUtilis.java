import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionUtilis {
	
	public static void main(String[] args) {
		
		//creating list
		List<String> myList = new ArrayList<>();
		//adding data to list
		Collections.addAll(myList, "USA","IND","CAN");
		System.out.println(myList);
		//sorting array elements
		Collections.sort(myList);
		System.out.println(myList);
		
		List<String> myDays = new ArrayList<>();
		Collections.addAll(myDays, "SUN","MON","WED","SAT");
		System.out.println(myDays);
		Collections.copy(myDays, myList);
		System.out.println(myDays);
		System.out.println(myList);
		Collections.reverse(myList);
		System.out.println(myList);
		Collections.shuffle(myList);
		System.out.println(myList);
		
//		System.out.println(myDays);
//		Collections.fill(myDays, "No Data");
//		System.out.println(myDays);
//		//myDays = Collections.emptyList();
//		//System.out.println(myDays);
//		Collections.max(myDays);
		System.out.println("---Max");
		System.out.println(Collections.max(myDays));
		System.out.println("---Min");
		System.out.println(Collections.min(myDays));
		Collections.sort(myList);
		System.out.println(myList);
		System.out.println(Collections.binarySearch(myList, "IND"));
	}

}
