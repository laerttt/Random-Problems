import java.util.HashMap;

public class longestSubString {
    public static void main(String args[]){
        // Example 1: Input string "abcabcbb"
        String a = "abcabcbb";
        System.out.println(solution(a));  // Expected output: 3 (substring "abc")
        // Example 2: Input string "bbbbb"
        String b = "bbbbb";
        System.out.println(solution(b));  // Expected output: 1 (substring "b")
        // Example 3: Input string "pwwkew"
        String c = "pwwkew";
        System.out.println(solution(c));  // Expected output: 3 (substring "wke")
    }
    /**
     * This function calculates the length of the longest substring without repeating characters.
     *
     * @param s The input string.
     * @return The length of the longest substring without repeating characters.
     */
    public static int solution(String s) {
        // If the string is of length 1, the longest substring is the string itself (length 1)
        if (s.length() == 1){
            return 1;
        }
        // Create a HashMap to store characters and their last index positions
        HashMap<Character, Integer> map = new HashMap<>();
        int size = 0;  // Variable to track the size of the longest substring
        // Iterate through the string character by character
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            // If the character is not in the map, add it with an initial value (0)
            if (map.get(c) == null){
                map.put(c, 0);
            }
            // Iterate through the string starting from the next character after 'i'
            for (int j = i + 1; j < s.length(); j++){
                char x = s.charAt(j);
                // If the character is not in the map, add it
                if (map.get(x) == null){
                    map.put(x, 0);
                    // If the map size is greater than the previous maximum size, update the size
                    if (map.size() > size){
                        size = map.size();
                    }
                }
                else {  // If the character is found again in the map, break the loop
                    // If the map size is greater than the previous maximum size, update the size
                    if (map.size() > size){
                        size = map.size();
                    }
                    // Clear the map and break the inner loop to check for the next starting point
                    map.clear();
                    break;
                }
            }
        }

        // Return the maximum size found, which represents the length of the longest substring
        return size;
    }
}