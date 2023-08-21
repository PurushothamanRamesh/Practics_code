package strings;
//Write a Program to replace a substring with another string
public class replace_substring {
    public static void main(String[] args) {
        String mainstring=("Hello world");
        String old=("wor");
        String newst=("vill");
        replacestring(mainstring,old,newst);
    }

    public static void replacestring(String mainstring, String old, String newst) {
        System.out.println("The replacing stirng is "+ mainstring.replaceAll(old,newst));
    }
}
