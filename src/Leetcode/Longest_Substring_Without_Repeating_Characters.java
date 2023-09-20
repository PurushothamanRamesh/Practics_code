package Leetcode;

import java.util.HashMap;

public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println(check(s));
    }

    private static int check(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0;
        int j=0;
        int max=0;
        int n=s.length()-1;
        while (j<n){
            char ch=s.charAt(j);
            if (map.containsKey(ch)){
                i=Math.max(map.get(ch)+1,i);
            }
            map.put(ch,j);
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}
