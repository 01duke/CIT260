import java.util.Scanner;

public class A7dot18 {
  public static void main(String[] args) {
    double[] list = getList();
    long start = System.nanoTime();
    sortList(list);
    printList(list);
    long end = System.nanoTime();
    System.out.println("\nElapsed time = " + (end - start));
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

  private static void sortList(double[] list) {
    for (int i = 0; i < list.length - 1; i++) {
      for (int j = 0; j < list.length - 1; j++) {
        if (list[j] > list[j + 1]) {
          double t = list[j];
          list[j] = list[j + 1];
          list[j + 1] = t;
        }
      }
    }
  }

  private static void printList(double[] list) {
    for (double val : list) {
      System.err.println(val + " ");
    }
  }
}
