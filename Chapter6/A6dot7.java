/*
ask user for amount invested and interest rate
convert yearly interest rate to montthly interest rate

*/
import java.util.Scanner;
public class A6dot7{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("The amount invested:");
         double investment = input.nextDouble();
         
        System.out.print("Annual interest rate:");
         double yearlyInterestRate = input.nextDouble();
         double monthlyInterestRate =( yearlyInterestRate / 12) / 100 ;
        System.out.println("Years \t \tFuture Value" );

        for (int years = 1; years <= 30; years+=1){
        System.out.printf( "%1d \t \t %8.2f\n" , years , futureInvestmentValue( investment,  monthlyInterestRate,  years ));
        }
        input.close();
    } 
 
        
    public static double futureInvestmentValue(double investment, double monthlyInterestRate, int years ){
        double fv = investment * Math.pow(1 + monthlyInterestRate, years * 12) ;
        return fv;
    }

}
