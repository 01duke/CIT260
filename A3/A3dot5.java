import java.util.Scanner;

public class A3dot5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int todaysDay = input.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed = input.nextInt();

        int futureDay = (todaysDay + elapsed) % 7;
        String today = "";

        switch (todaysDay) {
            case 0: today = "Sunday"; break;
            case 1: today = "Monday"; break;
            case 2: today = "Tuesday"; break;
            case 3: today = "Wednesday"; break;
            case 4: today = "Thursday"; break;
            case 5: today = "Friday"; break;
            case 6: today = "Saturday";
        }
      String future ="";
       switch (futureDay) {
         case 0: future = "Sunday"; break;
         case 1: future = "Monday"; break;
         case 2: future = "Tuesday"; break;
         case 3: future = "Wednesday"; break;
         case 4: future = "Thursday"; break;
         case 5: future = "Friday"; break;
         case 6: future = "Saturday";
        }
      System.out.println("Today is " + today + " and the future day is " + future + ".");
input.close();
    }
}   