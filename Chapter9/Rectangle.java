/**
 * set hight and width 
 * create rectangle return
 * area return perimeter 
 * set new hight and width
 */
class Rectangle {
  double hight ;
  double width ;

  Rectangle() {
    hight = 1;
    width = 1;
  }

  Rectangle(double newHight, double newWidth) {
    hight = newHight;
    width = newWidth;
  }
  public double getWidth(){
    return width;
  }

  public double getArea() {
    double area = hight * width;
    return area;
  }

  public double getPerimeter() {
    double perimeter = (hight * 2) + (width * 2);
    return perimeter;
  }

  public void setHight(double newHight) {
    hight = newHight;
  }

  public void setWidth(double newWidth) {
    width = newWidth;
  }
}