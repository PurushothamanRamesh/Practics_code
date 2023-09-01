package Map;

import java.util.HashMap;

public class validAnagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println( anagramcheck(s,t));

    }

    private static boolean anagramcheck(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> seen=new HashMap<>();
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            seen.put(ch,seen.getOrDefault(ch,0)+1);
        }
        for (int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(seen.get(ch)!=null){
                if(seen.get(ch)==1)
                    seen.remove(ch);
                else
                    seen.put(ch,seen.get(ch)-1);
            }else
                return false;
        }
        return seen.isEmpty();
    }
}
