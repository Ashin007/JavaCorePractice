package collectionDemo;

import java.util.HashMap;
import java.util.Map;

public class MapSample {
	public static void main(String[] args) {
		
		String name = "Ashin vijayan cheeral wayanad";
		StringBuilder builder = new StringBuilder();
		StringBuilder outPut = new StringBuilder();
		
		for(int i=0;i>=0;i--) {
			builder.append(name.charAt(i));
			if(String.valueOf(name.charAt(i)).equalsIgnoreCase(" ")) {
				outPut.append(builder);
				builder = new StringBuilder();
			}
		}
		System.out.println(outPut);
	}

}
