/**
 * set x and y create point return distance set new x and y
 */
class MyPoint {
    double x;
    double y;

    MyPoint() {
        x = 1;
        y = 1;
    }

    MyPoint(double newX, double newY) {
        x = newX;
        y = newY;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(double x1, double y1) {
        double distance = Math.sqrt(Math.pow((x - x1), 2) + Math.pow((y - y1), 2));
        return distance;
    }

    public double distance(MyPoint p) {
        double distance = Math.sqrt(Math.pow((x - p.getX()), 2) + Math.pow((y - p.getY()), 2));
        return distance;
    }

    public void setX(double newX) {
        x = newX;
    }

    public void setY(double newY) {
        y = newY;
    }

}