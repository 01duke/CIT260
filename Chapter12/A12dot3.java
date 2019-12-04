
/**
 * import Scanner
 * create array
 * ask for an index of the array
 * 	try if the number given fits in the array size
 * 	catch display out of bounds
 */
import java.util.Scanner;

public class A12dot3 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] array = getArray();

		System.out.print("Enter the index of the array: ");
		try {
			System.out.println("The corresponding element value is " + array[input.nextInt()]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds.");
		}
	}

	public static int[] getArray() {
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100) + 1;
		}
		return array;
	}
}