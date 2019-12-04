
/**
 *  import InputMismatchException, Scanner
 *  prompt for two integers from user
 * create a loop
 * create a try catch
 *    try num 1, 2 are int if true isVaild is true
 *    catch will display invaild and renter two int
 * print the sum
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class A12dot2 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter two integers: ");
    int num1 = 0;
    int num2 = 0;
    boolean isValid = false;
    while (!isValid) {
      try {
        num1 = input.nextInt();
        num2 = input.nextInt();
        isValid = true;
      } catch (InputMismatchException ex) {

        input.nextLine();
        System.out.println("Invalid input...");
        System.out.print("Enter two integers: ");
      }
    }
    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
  }
}