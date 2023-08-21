package pattern;
//        9 9 9 9 9 9 9 9 9
//         8 8 8 8 8 8 8 8
//          7 7 7 7 7 7 7
//           6 6 6 6 6 6
//            5 5 5 5 5
//             4 4 4 4
//              3 3 3
//                2 2
//                1
public class zo3 {

    public static void main(String[] args) {
        int n=9;
        pattern(n);

    }
    private static void pattern(int n) {
        for (int i=n;i>0;i--){
            for (int j=i;j<n;j++){
                System.out.print(" ");
            }
            for (int j=i;j>0;j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
