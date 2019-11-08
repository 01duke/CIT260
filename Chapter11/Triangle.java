class Triangle {
    double side1;
    double side2;
    double side3;

    Triangle() {
        side1 = 1;
        side2 = 1;
        side3 = 1;
    }

    Triangle(double newSide1, double newSide2, double newSide3) {
        side1 = newSide1;
        side2 = newSide2;
        side3 = newSide3;
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
    public void setSide1(double newSide1) {
        x = side1;
    }
    public void setSide2(double newSide2) {
        x = side2;
    }
    public void setSide3(double newSide3) {
        x = side2;
    }

}