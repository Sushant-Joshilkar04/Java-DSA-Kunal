import java.util.Scanner;

public class Armstrong_number {

    static void armstrong(int num){
        int p=num;
        int sum=0;
        while(num!=0){
        int rem=num%10;
        num/=10;
        sum+=Math.pow(rem, 3);
        }
        if(p==sum){
            System.out.println("This is armstrong number");
        }
        else{
            System.out.println("This is not armstrong number");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        int num =in.nextInt();
        armstrong(num);


    }
}
