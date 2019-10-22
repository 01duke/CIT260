import java.util.Scanner;

public class A7dot8 {
  public static void main(String[] args) {
    double[] list = getList();
    average(list);
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

  public static int average(int[] list) {
    arrayA = new int[10];

  }

  public static double average(double[] list) {
    arrayB = new double[10];
  }

  private static void printList(double[] list) {
    for (double val : list) {
      System.err.println(val + " ");
    }
  }
}