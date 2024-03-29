// finding the days in a month
import java.util.Scanner;

public class A3dot11{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

    System.out.print("Enter month: ");
      int month = input.nextInt(); 

   System.out.print("Enter year: ");
      int year= input.nextInt();

   int days = 0;
   if (month == 1 || month == 3 || month == 5|| month == 7 || month == 8 || month == 10 || month == 12)
      days = 31;
   else if(month == 4 || month == 6 || month ==9|| month == 11)
      days = 30;
      // Check to see if the year is a leap year
   else if( month == 2 && (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
      days = 29;
   else
      days =28;
      switch (month) {
         case 1: System.out.print("January "); break;
         case 2: System.out.print("February "); break;
         case 3: System.out.print("March "); break;
         case 4: System.out.print("April "); break;
         case 5: System.out.print("May "); break;
         case 6: System.out.print("June "); break;
         case 7: System.out.print("July "); break;
         case 8: System.out.print("August "); break;
         case 9: System.out.print("September "); break;
         case 10: System.out.print("October "); break;
         case 11: System.out.print("November "); break;
         case 12: System.out.print("December ");
      }
      input.close();   
      System.out.print(year + " had " + days + " days." );
   }
} 