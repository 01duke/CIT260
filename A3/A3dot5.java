// finds future the day of the week 
import java.util.Scanner;
public class A3dot5{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
   
      System.out.print("Enter today's day: ");
         int day = input.nextInt();
      System.out.print("Enter the number of days elapsed since today: ");
         int future= input.nextInt();
         String day_of_week  = "";
         switch (day_of_week ) {
            case 0: day_of_week = "Sunday"; break;
            case 1: day_of_week = "Monday"; break;
            case 2: day_of_week = "Tuesday"; break;
            case 3: day_of_week = "Wednesday"; break;
            case 4: day_of_week = "Thursday"; break;
            case 5: day_of_week = "Friday"; break;
            case 6: day_of_week = "Saturday";
        }
      
      
      int futureDay = (day + future) % 7;
      String futureDayIs = "";
         switch ( futureDayIs) {
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
