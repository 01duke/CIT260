/*
* promt three citys put in alfabetical order
*/
import java.util.Scanner;
public class A4dot24{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);

System.out.print("Enter the first city: ");
  String c1 = input.nextLine();
System.out.print("Enter the secound city: ");
  String c2  = input.nextLine();
System.out.print("Enter the third city: ");
  String c3  = input.nextLine();
  
  if (c1.compareToIgnoreCase(c2) > 0){
    String t = c2;
    c2 = c1;
    c2= t;
  }
  if (c2.compareToIgnoreCase(c3) > 0){
    String t = c3;
    c3 = c2;
    c2= t;
  }
  if (c1.compareToIgnoreCase(c2) > 0){
    String t = c2;
    c2 = c1;
    c1= t;
  }
  System.out.println("Three cities are: " + c1 + " " + c2 + " " + c3);
input.close();
  }
}