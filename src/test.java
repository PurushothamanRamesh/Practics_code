import java.io.PrintStream;

public class test {
    PrintStream s;
    public static void main(String[] args) {
//        boolean condition = (System.out.printf("%s", "school") == null);
//        PrintStream s=System.out.printf("%s", "school");
//        System.out.println(s.toString());
        if (System.out.printf("%s", "school")==null)
        {
            System.out.print("school");
        } else {
            System.out.print("bus");
        }
    }
}
