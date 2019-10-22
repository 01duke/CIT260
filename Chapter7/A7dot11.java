import java.util.Scanner;

public class A7dot11 {
  public static void main(String[] args) {
    double[] list = getList();
    meanCal(list);
    printList(list);

  }

  private static double[] getList() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 10 numbers: ");
    double[] list = new double[10];
    for (int i = 0; i < list.length; i++) {
      list[i] = input.nextDouble();
    }
    return list;
    scanner.close();

  }

  // public static double deviation(double[] list) {
  // Math.sqrt(sum * Math.pow((list - mean), 2) / (list.length - 1));
  // }

  public static double mean(double[] list) {
    double sum = 0;
    for (int i = 0; i < list.length; i++) {
      sum += list[i];
    }
    double mean = sum / list.length;
    return mean;
  }

  private static void printList(double[] list) {
    System.out.printf("The mean is: %.2d", mean(x));
    // System.out.printf("The standard deviation is: %.5d", deviation(x));
  }
}