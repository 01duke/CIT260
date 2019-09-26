import java.util.Scanner;
public class A2dot2 {
   public static void main(String[] args){
      final double PI = 3.14159;    // Declaring PI
      Scanner input = new Scanner(System.in);

      //Asking for Radius from user
      System.out.print("Enter a radius: ");
      double radius= input.nextDouble();

      //Radius to Area compute         
      double area= radius * radius * PI;
      //Display results
      System.out.print(" Area is " + area);
      //Asking for Length from user
      System.out.print(" Enter a length: ");
      double length= input.nextDouble();

      //Compute volume         
      double volume= area * length;
      //Display results
      System.out.print(" Volume is " + volume);
   }
}