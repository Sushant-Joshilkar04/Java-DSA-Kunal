
import java.util.Scanner;


public class Input {
    public static void main(String[] args) {
      System.out.println("Hey how are you?\n");
      Scanner input = new Scanner(System.in);
      System.out.println(input.nextInt());   //For integer
      System.out.println(input.next());    //  for string of one word
      System.out.print(input.nextLine());    //  for entire string

    }
}
