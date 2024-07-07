package practics_Checking;

public class incrementAndDecrement {
    public static void main(String[] args) {
        increment1();
        increment2();
    }

    private static void increment1() {
        int i =5 ;
        int j=10 ;
        i++;
        j++;
        int c=i++ +j--;
        System.out.println("the value of c is "+--c);
    }

    private static void increment2() {
        int i =5 ;
        int j=10 ;
        int v=i++;
        j++;
        int c=i++ +j--;
        System.out.println("the value of v is "+v );

    }

}
