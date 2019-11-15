class Triangle extends GeometricObject {
  private double side1;
  private double side2;
  private double side3;

  public Triangle() {
    side1 = 0;
    side2 = 0;
    side3 = 0;
  }

  public Triangle(double newSide1, double newSide2, double newSide3) {
    this.side1 = newSide1;
    this.side2 = newSide2;
    this.side3 = newSide3;
  }

  public Triangle(double newSide1, double newSide2, double newSide3, String color, boolean filled) {
    this.side1 = newSide1;
    this.side2 = newSide2;
    this.side3 = newSide3;
    setColor(color);
    setFilled(filled);
  }

  public double getSide1() {
    return side1;
  }

  public double getSide2() {
    return side2;
  }

  public double getSide3() {
    return side3;
  }

  public double getArea(double newSide1, double newSide2, double newSide3) {
    double s = (side1 + side2 + side3) / 2;
    double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    return area;
  }

  public double getPerimeter(Triangle ss) {
    double perimeter = ss.getSide1() + ss.getSide2() + ss.getSide3();
    return perimeter;
  }

  public String toString() {
    return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
  }

  public void setSide1(double newSide1) {
    side1 = newSide1;
  }

  public void setSide2(double newSide2) {
    side2 = newSide2;
  }

  public void setSide3(double newSide3) {
    side3 = newSide3;
  }
}