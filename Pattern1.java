import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        pattern(n);
    }

    static void pattern(int n){
        for (int i = 1; i <= n; i++) {
           // for every row,run the column
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            // when one row is printed we need to add a newline
            System.out.println();
        }
    }
}
