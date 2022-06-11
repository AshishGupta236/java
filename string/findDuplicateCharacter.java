import java.util.*;

class findDuplicateCharacter {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        String s = "geeksforgeeks";
        Map<Character, Integer> map = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

        }
        char key;
        int value;
        for (Map.Entry mapElements : map.entrySet()) {
            key = (char) mapElements.getKey();
            value = (int) mapElements.getValue();
            if (value > 1) {
                System.out.println(key + " " + value);
            }
        }
    }
}