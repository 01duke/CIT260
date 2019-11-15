// import java.io.FileNotFoundException;
// import java.io.PrintWriter;
// import java.io.file;
// import java.util.Arrays;
// import java.util.Scanner;

// public class A12dot15 {

//     public static void main(String[] args) {
//         try {
//             File f = new File("Data.txt");
//             writeData(f);
//             int myList = readData(f);
//             Arrays.sort(myList);
//             printData(myList);
//         } catch (FileNotFoundException e) {
//             e.printStackTrace();
//         }
//     }

//     private static void writeData(File f) {
//         try (PrintWriter output = new PrintWriter(f)) {
//             for (int i = 0; i < 100; i++) {
//                 output.print((int) (Math.random() * 100) + " ");
//             }
//         }
//     }

//     private static int[] readData(File f) throws FileNotFoundException {
//         int[] myList = int[100];
//         try(Scanner input = new Scanner(f)){
//             for (int i = 0; i < 100; i++){
//                 myList[i] = input.nextInt();
//             }
//         }
//         return myList;
//     }

//     private static void printData(int[] myList) {
//         for (int i = 0; i < 100; i++) {
//             System.out.println(myList[i] + " ");
//             if (i % 10 == 9)
//                 System.out.println();
//         }
//     }

// }