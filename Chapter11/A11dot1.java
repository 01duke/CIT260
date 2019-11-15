
public class A11dot1 {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(1.0 , 1.0 , 1.0);
        System.out.printf("Area = %.2f \n", triangle1.getArea(1.0, 1.0, 1.0));
        System.out.printf("Perimeter = %.2f \n",triangle1.getPerimeter(triangle1));
        System.out.println(triangle1.toString());   
        System.out.println("Filled: " + triangle1.isFilled());     
        System.out.println("Color: " + triangle1.getColor());     
    }
}
