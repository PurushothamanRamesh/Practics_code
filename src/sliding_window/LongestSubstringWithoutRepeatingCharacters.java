package sliding_window;

import java.util.HashMap;
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(findLongestSubstring(str));
    }
    private static int findLongestSubstring(String str) {
        int n = str.length();
        int i = 0, j = 0, maxLen = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (j < n) {
            char ch = str.charAt(j);
            if (map.containsKey(ch)) {
                i = Math.max(map.get(ch) + 1, i);
            }
            map.put(ch, j);
            maxLen = Math.max(maxLen, j - i + 1);
            j++;
        }
        return maxLen;
    }
}
