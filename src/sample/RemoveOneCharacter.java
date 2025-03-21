package sample;

public class RemoveOneCharacter {
    public static void main(String[] args) {
        String str = "ABCD";
        generateSubstrings(str);
    }

    public static void generateSubstrings(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.substring(0, i) + str.substring(i + 1));
        }
    }
}
