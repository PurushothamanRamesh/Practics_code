package zohoquestions;

public class OddNumberBW_Range{
    public static void main(String[] args) {
        int n1=2;
        int n2=15;

       oddnumberfinder(n1,n2);
    }
    private static void oddnumberfinder(int n1, int n2) {
        if (n1%2==0) n1=n1+1;
        for (int i=n1;i<n2;i+=2){
            System.out.print(i+" ");
        }
    }
}
