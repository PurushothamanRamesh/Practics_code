package practics_Checking;

public class shiftOperator {
    public static void main(String[] args) {
        shiftCall1();
        shiftCall2();
        shiftCall3();
    }

    private static void shiftCall1() {
        int a =5;
        System.out.println("left shit of first  method is :: "+(a<<1));
    }
    private static void shiftCall2() {
        int a =10;
        System.out.println("left shit of second method is :: " +(a<<2));
    }
    private static void shiftCall3() {
        int a =4;
        System.out.println("left shit of third method is :: " +(a<<1));
        System.out.println("left shit of third method is :: " +(a<<2));
    }
}
