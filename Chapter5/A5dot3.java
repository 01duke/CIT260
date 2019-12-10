/**
 * start count from 1 to 200 kg
 * kg * 2.2
 */
public class A5dot3 {
    public static void main(String[] args) {

        System.out.printf("%-12s%8s\n", "Kilograms", "Pounds");

        for (int i = 1; i < 200; i += 2) {
            System.out.printf("%-12d%8.1f\n", i, i * 2.2);
        }
    }
}