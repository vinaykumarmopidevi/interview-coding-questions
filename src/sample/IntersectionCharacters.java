package sample;

import java.util.HashSet;
import java.util.Set;

public class IntersectionCharacters {
    public static void main(String[] args) {
        String str1 = "characters";
        String str2 = "alphabets";

        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        // Add characters from str1 to set1
        for (char c : str1.toCharArray()) {
            set1.add(c);
        }

        // Add characters from str2 to set2
        for (char c : str2.toCharArray()) {
            set2.add(c);
        }

        // Find intersection of characters
        set1.retainAll(set2);

        System.out.println("Intersection of characters: " + set1);

    }
}
