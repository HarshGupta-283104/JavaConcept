import java.util.HashMap;
import java.util.Map;

public class CharTracker {

    public static void countChars(String str) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            System.out.println("Character '" + entry.getKey() + "' appears " + entry.getValue() + " times.");
        }
    }

    public static void main(String[] args) {
        String testString = "hello world";
        System.out.println("Counting characters in: \"" + testString + "\"");
        countChars(testString);
    }
}