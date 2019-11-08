import java.util.Scanner;
/**
 * get input from user to enter 16 numbers
 * display matrix
 * compute major diagonal
 * display sum
 */
public class A8dot2 {

  public static void main(String[] args) {
    double[][] a = getMatrix();
    printMatrices(a);
    getSumMajor(a);
  }

  public static double[][] getMatrix() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter sixteen numbers: ");
    double[][] t = new double[4][4];
    for (int row = 0; row < t.length; row++) {
      for (int col = 0; col < t[row].length; col++) {
        t[row][col] = input.nextDouble();
      }
    }
    return t;
  }

  public static void printMatrices(double[][] a) {
    for (int row = 0; row < a.length; row++) {
      for (int col = 0; col < a[row].length; col++) {
        System.out.printf("%7.1f", a[row][col]);
      }
      System.out.println();
    }
  }

  public static void getSumMajor(double[][] a) {
    double sumMajor = 0;
    for (int i = 0; i < a.length; i++) {
      sumMajor += a[i][i];

    }

    System.out.printf("Sum of elements in the major diagonal: %2.1f", sumMajor);
  }
}