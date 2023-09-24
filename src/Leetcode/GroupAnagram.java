package Leetcode;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
       String[] strs = {"eat","tea","tan","ate","nat","bat"};
            checkAnagram(strs);
    }


    private static void checkAnagram( String[] strs) {
        HashMap<String, List<String>> map=new HashMap<>();
        for (String str:strs) {
           char[] ch=str.toCharArray();// converting a string into array
            Arrays.sort(ch); // sorting a array for a anagram checking purpose
            String keyString=String.valueOf(ch); // converting a array to string for a accesing a key  purpose inside a map
            if (!map.containsKey(keyString))
                map.put(keyString,new ArrayList<>());
            map.get(keyString).add(str);
        }
        for (List<String > list: map.values()){
            for (String strlist:list){
                System.out.print(strlist+" ");
            }
            System.out.println();
        }
    }
}
