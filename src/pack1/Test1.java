package pack1;

import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		String[] str = { "one", "two", "three", "four" };
		int key=0;
		List<String> l=new ArrayList<String>();
		for (String string : str) {
			l.add(key, string);
			key++;
		}
		Iterator<String> sItr = l.iterator();
				
		while (sItr.hasNext()) {
			System.out.println(sItr.next());
		}
	}

}
