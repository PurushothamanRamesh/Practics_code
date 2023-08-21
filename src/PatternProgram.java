
public class PatternProgram {

    public static void main(String[] args) {
        int n=-7;

        if(n==0) {
            System.out.print(n);
        }
        else if(n<0) {
            int space=1;
            for(int i=n;i<=-1;i++) {

                for(int k=0;k<space;k++) {
                    System.out.print("*");
                }
                space++;
                for(int j=i;j<=-1;j++) {
                    System.out.print(j+" ");
                }
                System.out.println();
            }
            for(int i=-2;i>=n;i--) {
                space--;

                for(int k=space;k>1;k--) {
                    System.out.print(" ");
                }
                for(int j=i;j<=-1;j++) {
                    System.out.print(j+" ");
                }
                System.out.println();
            }

        }else
        {
            for(int i=1;i<=n;i++) {

                for(int k=0;k<i;k++) {
                    System.out.print(" ");
                }
                for(int j=i;j<=n;j++) {
                    System.out.print(j+" ");
                }
                System.out.println();
            }


            for(int i=n-1;i>=1;i--) {
                for(int k=0;k<i;k++) {
                    System.out.print(" ");
                }

                for(int j=i;j<=n;j++) {
                    System.out.print(j+" ");
                }
                System.out.println();
            }

        }

    }

}
