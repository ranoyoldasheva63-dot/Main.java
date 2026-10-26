import java.util.Scanner;
public class lesson4 {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);

//        System.out.print("SUmmani kiriting: ");
//        double summa = sc.nextDouble();
//        System.out.print("Balansni kiriting: ");
//        double balance = sc.nextDouble();
//
//
//        sendMessage(summa, balance);
//
//    }
//
//        }
//    }
//
//    public static void main(String[] args) {
//        rectangle(3, 4);


//       Scanner sc = new Scanner(System.in);
//
//
//
//        for (int i = 1; i <= 4; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//
//
//
//
//
//
//    }
//}



//public class lesson4 {
//
//    public static void rectangle(int row, int col) {
//        for (int i = 1; i <= row; i++) {
//            for (int j = 1; j <= col; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        rectangle(3, 4);

        Scanner sc = new Scanner(System.in);

//        int price = sc.nextInt();
//        int amount = sc.nextInt();
//
//        double narx = totalPrice(price, amount);
//
//        if (narx > 1000000) {
//            double chegirma = narx * 0.15;
//            double yakuniyNarx = narx - chegirma;
//
//            System.out.println("Umumiy narx: " + narx);
//            System.out.println("15% chegirma: " + chegirma);
//            System.out.println("Chegirmadan keyingi narx: " + yakuniyNarx);
//        } else {
//            System.out.println("Umumiy narx: " + narx);
//        }
//    }
//
//    static double totalPrice(int price, int amount) {
//        return (double) price * amount;

        int[] expenses = {
                20000, 30000, 15000, 50000,
                25000, 40000, 10000
        };

        double average = calculateAverage(expenses);

        System.out.println("O'rtacha xarajat: " + average);

        countAboveAverage(expenses, average);
    }

    static void countAboveAverage(int[] expenses, double average) {

        System.out.println("O'rtachadan katta xarajatlar:");

        for (int i = 0; i < expenses.length; i++) {

            if (expenses[i] > average) {
                System.out.println(expenses[i]);
            }
        }
    }

    static double calculateAverage(int[] expenses) {

        double total = 0;

        for (int i = 0; i < expenses.length; i++) {
            total += expenses[i];
        }

        return total / expenses.length;



    }
}