import java.util.Scanner;
/*
* prompt user for 10 numbers
*
 */

public class A7dot8 {
  public static void main(String[] args) {
    double[] list = getList();
    double mean = average(list);
    System.out.println("Sum of double: " + mean);
  }

  private static double[] getList() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 10 numbers: ");
    double[] list = new double[10];
    for (int i = 0; i < list.length; i++) {
      list[i] = input.nextDouble();
    }
    return list;
  }

  public static int average(int[] list) {
    int sum = 0;
    for (int i = 0; i < list.length; i++) {
      sum += list[i];
    }
    int mean = sum / list.length;
    return mean;
  }

  public static double average(double[] list) {
    double sum = 0;
    for (int i = 0; i < list.length; i++) {
      sum += list[i];
    }
    double mean = sum / list.length;
    return mean;
  }
}