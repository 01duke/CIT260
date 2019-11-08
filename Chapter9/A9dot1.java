public class A9dot1 {
  public static void main(String[] args) {
    Rectangle rectangle1 = new Rectangle(40, 4);
    System.out.printf("Width = %.2f\n", rectangle1.getWidth());
    System.out.printf("Hight = %.2f\n", rectangle1.hight);
    System.out.printf("Perimeter = %.2f\n", rectangle1.getPerimeter());
    System.out.printf("Area = %.2f\n", rectangle1.getArea());

    Rectangle rectangle2 = new Rectangle(35.9, 3.5);
    System.out.printf("Width = %.2f\n", rectangle2.width);
    System.out.printf("Hight = %.2f\n", rectangle2.hight);
    System.out.printf("Perimeter = %.2f\n", rectangle2.getPerimeter());
    System.out.printf("Area = %.2f\n", rectangle2.getArea());
  }
}
