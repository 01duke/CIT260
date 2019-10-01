import java.util.Scanner;
public class A3dot5{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
   
      System.out.print("Enter today's day: ");
         int day = input.nextInt();
      System.out.print("Enter the number of days elapsed since today: ");
         int futureDay= input.nextInt();
      
      switch ((day + futureDay) % 7) {
         case 0: System.out.println("Sunday"); break;
         case 1: System.out.println("Monday"); break;
         case 2: System.out.println("Tuseday"); break;
         case 3: System.out.println("Wendsday"); break;
         case 4: System.out.println("Thursday"); break;
         case 5: System.out.println("Friday"); break;
         case 6: System.out.println("Saturday");
      }
   input.close();
   }
}
