/*
ask user for amount invested and interest rate
convert yearly interest rate to montthly interest rate

*/
import java.util.Scanner;
public class A6dot7{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("The amount invested:");
         double investmentAmount = input.nextDouble();
         
        System.out.print("Annual interest rate:");
         double yearlyInterestRate = input.nextDouble();
        System.out.println("Years \tFuture Value" );

        for (int years = 1; years <= 30; years+=1){
        System.out.printf( "%1d \t \t %8.2f\n" , years, fv);
        }
        input.close();
    } 
 
        
    public static futureInvestmentValue(double investmentAmount, double yearlyInterestRate, double monthlyInterestRate, int years ){
        monthlyInterestRate = yearlyInterestRate * 12;
        double fv = monthlyInterestRate * Math.pow(monthlyInterestRate, years) ;
        return fv;
    }

}
