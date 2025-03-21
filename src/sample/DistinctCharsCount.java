package sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctCharsCount {

	public static void main(String[] args) {

		//printDistinctCharsWithCount("Java program to count frequencies");
		Set<String> set=new HashSet<>();
		for (String str : "Java program to count frequencies".split("")) {
			set.add(str);
		}
		Iterator<String> itr=set.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next());
		}
	}

	private static void printDistinctCharsWithCount(String input) {
		Map<Character, Integer> charsWithCountMap = new HashMap<>();

		// using Map merge method from Java 8
//		for (char c : input.toCharArray())
//			charsWithCountMap.merge(c, 1, Integer::sum);
//		System.out.println(charsWithCountMap);

		// another way using latest Java enhancements and no for loop, a bit complex
		// though
		//List<Character> list = input.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

		//list.stream().forEach(c -> charsWithCountMap.merge(c, 1, Integer::sum));

		//System.out.println(charsWithCountMap);
		char[] cr=input.toCharArray();
		
		for(int i=0;i<cr.length;i++) {
			char key=cr[i];
			if(charsWithCountMap.containsKey(key)) {
				charsWithCountMap.put(key, charsWithCountMap.get(key)+1);
			}else {
				charsWithCountMap.put(key, 1);
			}
		}
		
		
		
		for(Map.Entry<Character, Integer> map:charsWithCountMap.entrySet() ) {
			
				System.out.println(map.getKey()+" "+map.getValue());
			
			
		}
	}

}