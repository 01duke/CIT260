/*

*/

public class A6dot8{
    public static void main(String[] args){
        System.out.print("Celsius \t Fahrenheit \t | \t Fahrenheit \t Celsius");
        System.out.println("\n------------------------------------------------------------------");
        double countFahrenheit = 120;

         for (double countCelsius = 40; countCelsius >= 31; countCelsius -= 1){

        System.out.printf("%3.1f  \t \t %3.1f \t \t | \t %3.1f \t \t %3.2f\n",countCelsius, findFahrenhiet(countCelsius), countFahrenheit, findCelsius(countFahrenheit));
        countFahrenheit -= 10;}

    }
    public static double findFahrenhiet(double countCelsius){
        double fahrenheit = (9.0 / 5) * (countCelsius + 32);
        return fahrenheit;
    }
    public static double findCelsius(double countFahrenheit){
        double celsius = (5.0 / 9) * (countFahrenheit - 32);
        return celsius;
    }


    
}