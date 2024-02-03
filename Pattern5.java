import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        pattern(n);
    }

    static void pattern(int n){
        for (int i = 1; i <= (2*n-1); i++) {
           int totalColinRow = i>n ? 2*n-i : i;
            for(int j=1;j<=totalColinRow;j++){
                System.out.print("* ");
            }
            // when one row is printed we need to add a newline
            System.out.println();
        }
    }
}

