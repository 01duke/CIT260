import java.util.Scanner;
public class A4dot23{
	public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String nameString = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.print("Enter pay rate: ");
        double payRate = input.nextDouble();
        System.out.print("Enter federal withholding rate: ");
        double fed = input.nextDouble();
        System.out.print("Enter state tax witholding rate: ");
        double state = input.nextDouble();
        
        System.out.println("Employee Name: " + nameString);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Pay Rate: $" + payRate);
        System.out.println("Gross Pay: $" + payRate * hours);
        System.out.println("Deductions:");
        System.out.printf("\t Federal Withholding (%.1f%%): $%.2f\n"
        , fed * 100, fed * payRate * hours);
        System.out.printf("\t State Withholding (%.1f%%): $%.2f\n"
        , state * 100, state * payRate * hours);
         System.out.printf("\t Total Deduction: $%.2f\n"
         , (state + fed) * payRate* hours);
         System.out.printf("\t Net Pay: $%.2f\n"
         , (1 - state - fed) * payRate * hours);

    }
}