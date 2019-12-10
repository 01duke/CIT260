/**
 * start count 100 to 1000
 * if number is mod 5 and mod 6 print
 * format
*/
public class A5dot10{
    
    public static void main(String[] args) {

        int numCount = 1;
        for (int i = 100; i <= 1000; i++) {

            if (i % 5 == 0 && i % 6 == 0)
                System.out.print((numCount++ % 10 != 0) ? i + " " : i + "\n");
        }
    }
}