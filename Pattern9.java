import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        pattern(n);
//        System.out.println();
//        pattern2(n);
        System.out.println();
        pattern3(n);

    }

//    static void pattern(int n){
//        int originalN = n;
//        n = 2 * n;
//        for (int row = 0; row <= n; row++) {
//            for (int col = 0; col <= n; col++) {
//                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
//                System.out.print(atEveryIndex + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    static void pattern2(int n){
//        int originalN = n;
//        n = 2 * n;
//        for (int row = 0; row <= n; row++) {
//            for (int col = 0; col <= n; col++) {
//                int atEveryIndex = Math.min(Math.min(row, col), Math.min(n - row, n - col));
//                System.out.print(atEveryIndex + " ");
//            }
//            System.out.println();
//        }
//    }

    static void pattern3(int n){
        int originalN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

}



//distance: (Minimun from below this is ans)
//left=col    up=row  right=n-col   down=m-row