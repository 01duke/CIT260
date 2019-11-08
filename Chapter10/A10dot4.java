/**
 * print point1 x and y print point2 x any y
 * 
 */
public class A10dot4 {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(0, 0);
        System.out.println("Point 1:");
        System.out.printf("X value = %.2f\n", point1.x);
        System.out.printf("Y value = %.2f\n", point1.y);

        MyPoint point2 = new MyPoint(10, 30.5);
        System.out.println("Point 2:");
        System.out.printf("X value = %.2f\n", point2.x);
        System.out.printf("Y value = %.2f\n", point2.y);

        System.out.printf("Distance = %.2f\n", point1.distance(10, 30.5));
        System.out.printf("Distance = %.2f\n", point1.distance(point2));

    }
}