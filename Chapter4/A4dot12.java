/* 
open scanner
take hex input from user
takes letter or number and assigns to the varable binary
defalt error
display binary 
close scanner
*/
import java.util.Scanner;
public class A4dot12{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a Hexadecimal digit: ");
		String hexDigit = input.next();
		String binary = "";
		switch(hexDigit){
		case "0": binary = "0000"; break;
		case "1": binary = "0001"; break;
		case "2": binary = "0010"; break;
		case "3": binary = "0011"; break;
		case "4": binary = "0100"; break;
		case "5": binary = "0101"; break;
		case "6": binary = "0110"; break;
		case "7": binary = "0111"; break;
		case "8": binary = "1000"; break;
		case "9": binary = "1001"; break;
		case "a": 
		case "A": binary ="1010"; break;
		case "b":
		case "B": binary = "1011"; break;
		case "c": 
		case "C": binary = "1011"; break;
		case "d": 
		case "D": binary = "1101"; break;
		case "e": 
		case "E": binary = "1110"; break;
		case "f":
		case "F": binary = "1111"; break;

		default: binary = "Invalid character!"; break;	
		} 
		input.close();   
		System.out.print(binary);
	}
}