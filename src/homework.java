import java.awt.*;
import java.util.Scanner;


public class homework {
    public static void main(String[] args) {

//        Kalkulyator

//        int a = 20;
//        int b = 5;
//        String operator = "*";
//
//        switch (operator) {
//            case "+":
//                System.out.println("Natija: " + (a + b));
//                break;
//
//            case "-":
//                System.out.println("Natija: " + (a - b));
//                break;
//
//            case "*":
//                System.out.println("Natija: " + (a * b));
//                break;
//
//            case "/":
//                if (b != 0) {
//                    System.out.println("Natija: " + (a / b));
//                } else {
//                    System.out.println("Xato: Nolga bo'lish mumkin emas!");
//                }
//                break;
//
//            default:
//                System.out.println("Xato: Noto'g'ri operator!");
//        }
//1ci misol
//        int a = 10;
//
//        for (int i = 1; i <= a; i++) {
//            System.out.println(i);
//        }

//2ci misol
//        for (int i = 1; i <= 10; i++) {
//            if (i == 5) {
//                continue;
//            }
//            System.out.println(i);
//        }

//3ci misol

//        for (int i = 1; i <= 20; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
//4ci misol

//        for (int i = 1; i <= 15; i++){
//            if (i % 3 == 0) {
//                System.out.println(i);
//            }
//        }

//5ci misol

//        int sum = 0;
//
//        for (int i = 1; i <= 10; i++){
//            sum = sum + i;
//              System.out.println(sum);
//        }


//6ci misol

//        int karra = 5;
//
//        for(int i = 1; i <= 10; i ++){
//            System.out.println(karra + " * " + i + " = " + (karra * i));
//        }

// 7 ci misol
//       int a = 5;
//       int b = 4;
//       int c = 3;
//       int d = 2;
//       int e = 5;
//  
//       String name = "students";
//       for(int i = 1; i <= 5; i ++){
//           System.out.println("a","b","c","d","e");
//       }

//        ARRAY
//        1ci misol
//
//        int[] scores = {12,15,24,37,63};
//
//        for (int i = 0; i < scores.length; i ++){
//            if (scores[i] >=10 && scores [i] <= 99 && scores[i] % 3 == 0 ){
//                System.out.println(scores[i]);
//            }
//        }

//        2ci misol
//
//        int[] scores = {14, 24, 10, 14, 28};
//
//        for (int i = 0; i < scores.length; i++) {
//            for (int j = i + 1; j < scores.length; j++) {
//                if (scores[i] == scores[j]) {
//                    System.out.println("SONLAR ORASIDA TAKRORLANISH MAVJUD");
//                    return;
//                }
//            }
//        }

//        3ci misol
//        int[] scores = {23, 42, -12, -5};
//        int sum = 0;
//
//        for (int i = 0; i < scores.length; i++) {
//            if (scores[i] < 0) {
//                sum = sum + scores[i];
//            }
//        }
//
//        System.out.println(sum);
//       4ci misol

//        int[] scores = {-14, -6, 30 , 18};
//        int manfiy = -14;
//        int musbat = 30;
//
//        for (int i = 0; i < scores.length; i ++){
//            if (scores[i] <0 && scores[i] > manfiy) {
//                manfiy = scores[i];
//            }
//            if (scores[i] > 0 && scores [i] < musbat){
//                musbat = scores[i];
//            }
//        }
//        System.out.println("Eng kotta manfiy son: " + manfiy);
//        System.out.println("Eng kichik musbat son: " + musbat);

//        5ci misol

//        int[] scores = {23, 0, 28, 0, 43};
//
//        int num = 0;
//        int son = 0;
//        boolean boshlash = false;
//
//        for (int i = 0; i < scores.length; i++) {
//            if (scores[i] == 0) {
//                son++;
//
//                if (son == 2) {
//                    break;
//                }
//
//                boshlash = true;
//            } else if (boshlash) {
//                num = num + scores[i];
//            }
//        }
//
//        System.out.println(num);

//        6ci msiol
//    int[] sonlar = {10,20,30,40,50};
//    int sum = 0;
//
//    for (int i = 0; i < sonlar.length; i ++){
//        if (i % 2 == 0){
//            sum = sum +sonlar[i];
//        }
//    }
//    System.out.println(sum);

//        7ci misol

//        int[] sonlar = {10,20,30,40,50};
//        int sum = 0;
//
//        for(int i = 0; i < sonlar.length; i ++){
//            if(i % 2 == 1){
//                sum = sum + sonlar [i];
//            }
//        }
//        System.out.println(sum);

//        8ci misol

//        int[] number = {12, 20, 35, 40, 53, 60};
//
//        for (int i = 0; i < number.length; i++) {
//            if (number[i] % 10 == 0) {
//                System.out.println(number[i]);
//            }
//        }
//
//       9ci misol
//        int[] numbers = {14, -7, 24, -9, 20};
//        int[] manafiy = new int[numbers.length];
//        int j = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] < 0) {
//                manafiy[j] = numbers[i];
//                j++;
//            }
//        }
//
//        for (int i = 0; i < j; i++) {
//            System.out.println(manafiy[i]);
//        }

//        10ci misol
//
//        int [] sonlar = {9,2,7,1,5};
//        for (int i = 0; i < sonlar.length; i ++){
//
//           }
//        for(int j = 0; j < sonlar.length - 1; j++){
//
//            j ++;
//            System.out.println(sonlar[j]);
//        }

//        11ci misol
//        int[] n = {1,7,4,37,2};
//
//        for(int j = 0; j < n.length ; j ++){
//          if(n [j] == 7)
//            System.out.println(n[j]);
//        }

//    12ci misol
//        int [] sonlar = {-24,16,-39,42,-25,30};
//        int [] z = new int [6];
//
//        for(int i = 0; i < 0; i ++){
//            if(sonlar[i] > 0){
//                z[i] = sonlar[i];
//                i ++;
//            }
//            for(int i = 0; i < z ; i ++){
//                System.out.println(z[i] +"");
//            }
//        }


           }
        }


