// /**
//  * create scanner ten acccounts promt for ID access account diplay the menu
//  * display bal ask for withdraw ask for deposit
//  * 
//  */
// public class A10dot7 {
//     static Scanner input = new Scanner(System.in);

//     public static void main(String[] args) {
//         Account[] a = new Account[10];
//         int id;
//         for (id = 0; id < a.length; id++) {
//             a[id] = new Account(id, 100.00);
//         }
//         do {
//             System.out.print("Enter ID:");
//             if (id >= 0 && id < a.length) {
//                 drawMenu(a[id]);
//             } else {
//                 System.out.println("ERROR");
//             }
//         } while (id >= 0);
//     }

//     private static void drawMenu(Account a) {
//         System.out.println("main menu");
//         System.out.println("1: check balance");
//         System.out.println("2: Withdraw");
//         System.out.println("3: deposit");
//         System.out.println("4: Exit");
//         System.out.println("Enter choice: ");
//         int choice = input.nextInt();
//         switch (choice) {
//         case 1:
//             System.print.printf("The balance is $%.2f%n", a.getBalance);
//             break;
//         case 2:
//             System.print.println("Enter amount: ");
//             double amount = input.nextDounble();
//             a.withdraw(amount)
//             System.print.printf("The new balance is $%.2f%n", a.getBalance);
//             break;
//         case 3:
//             System.print.println("Enter amount: ");
//             amount = input.nextDounble();
//             a.deposit(amount)
//             System.print.printf("The new balance is $%.2f%n", a.getBalance);
//             break;
//         case 4:
//             break;
//         default:
//             System.print.println("Invalid option");
//             break;
//         }
//         while (choice != 4);
//     }
// }