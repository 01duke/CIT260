public class A5dot3{
	public static void main(String[] args){
        System.out.println("Kilograms \tPounds" );
        
        for (int kg = 1; kg <= 199; kg+=2){
        System.out.printf( "%s \t \t%1d \n" , kg, kg * 2.2);
        }
    }
}