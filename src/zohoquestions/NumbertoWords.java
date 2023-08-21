package zohoquestions;

public class NumbertoWords {
    public static void main(String[] args) {
        int n=63;
        System.out.println(numtowords(n));

    }

    private static String numtowords(int num) {
         String[] belowTen = new String[] {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
         String[] belowTwenty = new String[] {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
         String[] belowHundred = new String[] {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
         if (num==0)
             return "Zero";
         else
             return helper(num);
    }

    private static String helper(int num) {
        String[] belowTen = new String[] {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] belowTwenty = new String[] {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] belowHundred = new String[] {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String result="";
        if (num<10) result= belowTen[num];
        else if (num<20) result= belowTwenty[num-10];
        else if (num<100) result= belowHundred[num/10]+" "+helper(num%10);
        else if (num<1000) result= belowTen[num/100]+"Hundrad"+helper(num%100);
        return result;
    }
    }
