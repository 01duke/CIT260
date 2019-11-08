import java.util.Scanner;
/*
* get list from user
* compute mean 
* compute standard deviation
* diplay mean and deviation
*/

import jdk.internal.util.xml.impl.Input;

public class A7dot11 {
  public static void main(String[] args) {
    double[] list = getList();
    double mean = meanCal(list);
    double deviation = deviationCal(list, mean);
    System.out.printf("The mean is: %.2f \n", mean);
    System.out.printf("The  deviation is: %.5f  ", deviation);

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

  public static double meanCal(double[] list) {
    double sum = 0;
    for (int i = 0; i < list.length; i++) {
      sum += list[i];
    }
    double mean = sum / list.length;
    return mean;
  }

  public static double deviationCal(double[] list, double mean) {
    double sumSquare = 0;
    double deviation = 0;
    for (int i = 0; i < list.length; i++) {
      sumSquare += Math.pow((list[i] - mean), 2);
    }
    deviation = Math.sqrt(sumSquare / (list.length - 1));
    return deviation;
  }
}