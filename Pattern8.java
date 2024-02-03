import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        pattern(n);
    }

    static void pattern(int n){
        for (int i = 1; i <= (2*n-1); i++) {
            int totalColinRow = i>n ? 2*n-i : i;

            for(int j=1;j<=(n-totalColinRow);j++){
                System.out.print(" ");
            }

            for(int j=totalColinRow;j>=1;j--){
                System.out.print(j);
            }

            for(int j=2;j<=totalColinRow;j++){
                System.out.print(j);
            }
            // when one row is printed we need to add a newline
            System.out.println();
        }
    }
}
