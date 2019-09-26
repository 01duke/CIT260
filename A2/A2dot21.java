//read 3 varabels display fv
import java.util.Scanner;
  public class A2dot21{
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      System.out.print("Enter investment amount: ");
      double investmentAmount = input.nextDouble();
      
      System.out.print("Enter annual intestrast rate in percentages: ");
      double annualInterestRate = input.nextDouble();

      double monthlyInterestRate = annualInterestRate / 1200;

      System.out.print("Enter number of years: "); 
      int numOfYears = input.nextInt();

      double futureValue = investmentAmount * Math.pow(1+monthlyInterestRate, numOfYears*12);
      scanner.close();

      System.out.print("Here is your future value: $" + (int)(futureValue*100)/100.0);
    }
}