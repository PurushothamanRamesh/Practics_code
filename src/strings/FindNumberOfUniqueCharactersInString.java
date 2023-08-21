package strings;

import java.util.HashSet;
import java.util.Set;

public class FindNumberOfUniqueCharactersInString {
    public static void main(String[] args) {
        String str1 = "The quick brown fox jumps over the lazy dog.";
        System.out.println("Original string: " + str1);
        System.out.println("Number of unique characters: " + findNumberOfUniqueCharactersInString(str1));
    }
    private static int findNumberOfUniqueCharactersInString(String str1) {
        Set<Character> characters = new HashSet<>();
        for (char c : str1.toCharArray()) {
            characters.add(c);
        }
        return characters.size();
    }
}

