class MyPoint {
    double x;
    double y;

    MyPoint() {
        x = 1;
        y = 1;
    }

    MyPoint(double NewX, double NewY) {
        x = newX;
        y = newY;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getDistance(){
        double distance = Math.sqrt( Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return distance;
    }

    
}