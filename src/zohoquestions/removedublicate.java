package zohoquestions;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;

public class removedublicate {
    public static void main(String[] args) {
         String s1="zoho corporation";
      //  String s1="avengersendgame";
        char[]  ch=s1.toCharArray();
        for (int i=0;i<ch.length;i++){
            for (int j=i+2;j<ch.length;j++){
                if (ch[i]==ch[j]){
                    ch[j]='_';
                }
            }
        }
        for (char ch1:ch){
            if (ch1!='_'){
                System.out.print(ch1);
            }
        }
//         HashSet<Character> seen=new HashSet<>();
//       // Queue<Character> seen=new ArrayDeque<>();
//        for (char c:s1.toCharArray()) {
//            seen.add(c);
//        }
//        for (char ch:seen){
//            System.out.print(ch);
//        }
    }
}
