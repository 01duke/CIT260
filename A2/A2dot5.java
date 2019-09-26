import java.util.Scanner;
public class A2dot5 {
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      //Asking for Subtotal from user
      System.out.print("Enter Subtotal: ");
      double subtotal = input.nextDouble();

      //Asking for Gratuity rate from user
      System.out.print("Enter Gratuity rate: ");
      double rate = input.nextDouble();
 
      //compute tip         
      double gratuity = (rate / 100) * subtotal;
      double total = gratuity + subtotal;
      //Display results
      System.out.print("$" + gratuity + " gratuity, and the total is $" + total);
   }
}