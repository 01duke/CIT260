public class A5dot3{
	public static void main(String[] args){
        System.out.println("Kilograms \tPounds" );
        
        for (int kg = 1; kg < 200; kg++){
            kg += 3;
        
            for (double lb = 2.2; lb < 200; lb++){
             lb += 2.2;
             System.out.printf(" (%.0%) \t \t (%.2%)", kg, lb );
            }
        }
    }
}