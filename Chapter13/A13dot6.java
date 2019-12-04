
public class A13dot6 {
    public static void main(String[] args) {
        ComparableCircle[] circles = {
           new ComparableCircle(100),
           new ComparableCircle(20) };
        java.util.Arrays.sort(circles);
        for (Circle circle: circles){ 
         System.out.print(circle.getRadius() + " ");
         System.out.println();
        }
    }
}