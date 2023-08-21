package strings;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class countfreuesncy {
    public static void main(String[] args) {
        String s=("hehhkdgvuhvjbgsvfv");
        frequency(s);
    }

    public  static void frequency(String s) {
        char[] ch=s.toCharArray();
        Map<Character, Integer> map=new HashMap<>();
        int i=0;
        int count=0;
        while(i<ch.length){
            if(map.containsKey(ch[i])){
                map.put(ch[i],map.getOrDefault(ch[i],0)+1);
            }else
                map.put(ch[i],1);
            i++;
        }
        for (char ch1:map.keySet()) {
            System.out.println("key---"+ch1+"   "+" value----  " + map.get(ch1));
        }

    }
}
