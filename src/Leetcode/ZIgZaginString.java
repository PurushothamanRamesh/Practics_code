package Leetcode;
/**
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 *
 * Example no 2
 *
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 *
 *Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 *
 */
public class ZIgZaginString {
    public static void main(String[] args) {
        String s="PAYPALISHIRING";
        int rows=4;
        zigzag(s,rows);
    }
   // PAHNAPLSIIGYIR
    private static String  zigzag(String s, int numRows) {
       if (s.length()<numRows || numRows==0) return s;
       StringBuilder[] row=new StringBuilder[numRows];
       // insert a string builder in every row  of an array
       for (int i=0;i<numRows;i++){
           row[i]=new StringBuilder();
       }
       // filling the element
        int currRow=0;
       boolean flag=false;
       for (char c:s.toCharArray()){
           row[currRow].append(c);
           if(currRow==0 || currRow==numRows-1){
               flag=!flag;
           }
           currRow+=flag?1:-1;
       }
       StringBuilder newstring=new StringBuilder();
       for (StringBuilder s1:row){
           newstring.append(s1);
       }
       return newstring.toString();



    }
}
