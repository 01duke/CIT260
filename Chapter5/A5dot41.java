import java.util.Scanner;

public class A5dot41{
public static void main(String[] args) {
    Scanner input = new Scanner(system.in) ;
    System.out.println( "Enter int fallowed by 0:");
    int number = input.nextInt();
    int max = number;
    int count = 1;
    while (number !=0){
        number = input.nextInt();
        if(number > max) {
            max = number;
            count = 1;
        }else if (number == max){
            count++;
        }

    }
    System.out.println("largest number is " + max + " and it occurs " + count + " times.");
    }
}
