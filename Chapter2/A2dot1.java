import java.util.Scanner;

public class A2dot1 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // Asking for Celsius from user
      System.out.print("Enter a degree in Celsius: ");
      double celsius = input.nextDouble();

      // Celsius to Fahrenheiet compute
      double fahren = (9.0 / 5) * celsius + 32;
      // Display results
      System.out.print(celsius + " Celsius is " + fahren + " Fahrenheit");
      scanner.close();
   }
}