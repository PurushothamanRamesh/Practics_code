package zohoquestions;

public class a1b10 {
    public static void main(String[] args) {
        String s = "a2b3";
        solution(s);
    }

    private static void solution(String s) {
        StringBuilder str=new StringBuilder();
        char letter = ' ';
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (ch>='a'&& ch<='z'){
                letter=ch;
            }else if (ch>=48&& ch<=57){
                int value=ch-48;
                int index=i+1;
                while (index<s.length() && s.charAt(index)>=48 &&  s.charAt(index)<=57){
                    value=value*10+((int)s.charAt(index)-48);
                    index++;
                    i++;
                }
                // printing
                for (int j=0;j<value;j++){
                    str.append(letter);
                }
            }
        }
        System.out.println(str.toString());
    }
}