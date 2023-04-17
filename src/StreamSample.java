import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamSample {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<20;i++) {
			list.add(i+1);
		}
		
		Stream<Integer> str = list.stream();
		str.forEach(l-> System.out.println(l));
	}

}
