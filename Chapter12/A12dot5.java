import java.util.Scanner;
import java.util.InputMismatchException;

public class A12dot5 {
  public static void main(String[] args) {
    boolean done = false;
    while (!done) {
      try {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter 3 sides: ");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();
        MyTriangle t = new MyTriangle(s1, s2, s3);
        done = true;
        System.out.println(t);
      } catch (IllegalTriangleException e) {
        System.out.println("That is not a vaild Triangle");
      } catch (InputMismatchException e) {
        System.out.println("That is not a vaild Triangle");
      }
    }
  }
}

class MyTriangle {
  double s1, s2, s3;

  MyTriangle(double s1, double s2, double s3) {
    if (s1 + s2 <= s3 || s1 + s3 <= s2 || s3 + s2 <= s1) {
      throw new IllegalTriangleException();
    }
    this.s1 = s1;
    this.s2 = s2;
    this.s3 = s3;

  }

  public String toString() {
    return "Triangle With sides: " + s1 + " " + s2 + " " + s3;
  }
}

class IllegalTriangleException extends Exception {
  public IllegalTriangleException() {
    super(" invalid triangle!");
  }
}
