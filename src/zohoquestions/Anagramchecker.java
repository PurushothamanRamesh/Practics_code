package zohoquestions;

import javax.swing.*;
import java.util.HashSet;
import java.util.Scanner;

public class Anagramchecker {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER THE HOW MANY ELEMNTS YOU WANT ");
        int sizeofarry= scan.nextInt();
        String[]  arr=new String[sizeofarry];
        for (int i=0;i<sizeofarry;i++){
            System.out.println("Enter the "+i +" th Element");
            arr[i]=scan.next();
        }
        System.out.println(" Enter the words to find ");
        String s2=scan.next();
        for (String s:arr){
            metod(s,s2);
        }
    }
    public static void metod(String s1, String s2){
        HashSet<Character> ans1=new HashSet<>();
        boolean flag=true;
        for (char c:s1.toCharArray()){
            ans1.add(c);
        }
        for (int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            if (ans1.contains(ch)){}
            else
                flag=false;
        }
        if (flag==true){
            System.out.println(s1);
        }
    }



}
