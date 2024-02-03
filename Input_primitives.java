import java.util.Scanner;

public class Input_primitives {   //Input_primitives this as an identifier
  public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    System.out.print("Enter input: ");
    int roll_no =input.nextInt();
    System.out.println("Your roll no is: "  + roll_no);

    // int a= 10; a is known a identifier and 10 is known as literal
    int a=234_00_000;  // we can use underscore instead of comma and if we used dash it's work as terminator
    System.out.println(a);

    // String name = input.next();
    // System.out.println(name);

    float marks = input.nextFloat();
    System.out.println(marks);


  }  
}
