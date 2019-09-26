// finding the days in a month
import java.util.Scanner;

public class A3dot11{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

    System.out.print("Enter month: ");
         int month = input.nextInt();
   switch (month) {
         case 1: month January; break;
         case 2: System.out.println("February"); break;
         case 3: System.out.println("March"); break;
         case 4: System.out.println("April"); break;
         case 5: System.out.println("May"); break;
         case 6: System.out.println("June"); break;
         case 7: System.out.println("July"); break;
         case 8: System.out.println("August"); break;
         case 9: System.out.println("September"); break;
         case 10: System.out.println("October"); break;
         case 11: System.out.println("November"); break;
         case 12: System.out.println("December");
   } 

   System.out.print("Enter year: ");
      int year= input.nextInt();
   
      int days = 0;
   if (month == 1 || month == 3 || month == 5|| month == 7 || month == 8 || month == 10 || month == 12)
      days = 31;
      else if(month == 4 || month == 6 || month ==9|| month == 11)
      days = 30;
      // Check to see if the year is a leap year
   boolean leapYear =
      (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
   if (leapYear = true)
      days = 29;
      else
      days =28;
      input.close();   
      System.out.print("In " + month + " " + year + " had " + days + " days." );
   }
}