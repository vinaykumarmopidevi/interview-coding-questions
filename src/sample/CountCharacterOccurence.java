package sample;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterOccurence {
	public static void main(String[] args) {
		String s = "Java is java again java again";
		Map<Character,Integer> map=new HashMap<>();
		char[] charArray=s.toCharArray();

		for(int i=0;i<charArray.length;i++){
			map.put(charArray[i], map.getOrDefault(charArray[i], 0)+1);
		}

		for (Map.Entry<Character,Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}
}
