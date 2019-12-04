// import java.text.SimpleDateFormat;
// import java.util.*;

// public class A13dot4 {
//     public static void main(String[] args) {
//         int month = 0;
//         int year = 0;
//         GregorianCalendar cal;
//         if (args.length == 2) {
//             month = Integer.parseInt(args[0]) - 1;
//             year = Integer.parseInt(args[1]);
//         } else {
//             cal = new GregorianCalendar();
//         }
//             if (args.length == 1) {
//                 month = Integer.parseInt(args[0]) - 1;
//             } else {
//                  month= cal.get(Calendar.MONTH);
//                 }
//                  year = cal.get(Calendar.YEAR);
//                 }
//     }
//     cal=new GregorianCalendar(year,month,1);
//     int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
//     int daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
//     String monthName = new SimpleDateFormat("MMMM").format(cal.getTime());

//     System.out.println("          " + month + ", " + year);
//     system.out.println("--------------------");
//     system.out.println("  Sun mon Tue Wed Thu Fri Sat");
//     for(int i = 1; i <= dayOfWeek; i++ ){
//         System.out.println("     ");
//     }
        

//     for (int i = 1; i <= daysInMonth; i++ ){
//         System.out.println("%4d" , i);
//         if ((dayOfWeek + i) % 7 == 0){
//             System.out.println();
//         }
//     }    
// }
// }