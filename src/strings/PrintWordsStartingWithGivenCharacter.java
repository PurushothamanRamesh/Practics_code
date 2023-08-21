package strings;

public class PrintWordsStartingWithGivenCharacter {
    public static void main(String[] args) {
        String str1 = "The quick brown fox jumps over the lazy dog.";
        char ch = 't';
        printWordsStartingWithGivenCharacter(str1, ch);
    }

    public  static void printWordsStartingWithGivenCharacter(String str1, char ch) {
        String[]  str=str1.split(" ");
        for (String s: str) {
            if (s.charAt(0)==ch){
                System.out.print(s+" ");
            }

        }
    }
}
