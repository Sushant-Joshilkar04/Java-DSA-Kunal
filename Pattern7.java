import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        pattern(n);
    }

    static void pattern(int n){
        for (int i = 1; i <= (n); i++) {

            for(int space=1;space<=(n-i);space++){
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            // when one row is printed we need to add a newline
            System.out.println();
        }
    }
}
