package sample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CountCharacterOccurence {
	public static void main(String[] args) {
		String s = "Java is java again java again";
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < s.length(); i++) {
			String str = String.valueOf(s.charAt(i));
			int count = s.length() - s.replace(str, "").length();
			set.add(str + " " + count);
			
		}
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext() ) {
			System.out.println(itr.next());
		}

	}
}
