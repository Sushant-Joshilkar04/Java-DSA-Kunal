import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        pattern(n);
    }


//     for (int i = 0; i < n; i++) {
//        // for every row,run the column
//        for(int j=1;j<=(n-i);j++){
//            System.out.print("* ");
//        }
//        It also works
    static void pattern(int n){
        for (int i = 1; i <= n; i++) {
            // for every row,run the column
            for(int j=1;j<=(n-i+1);j++){
                System.out.print("* ");
            }


            // when one row is printed we need to add a newline
            System.out.println();
        }
    }
}
