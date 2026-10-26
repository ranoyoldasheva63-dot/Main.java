import java.util.*;
import java.util.Scanner;
import java.util.HashMap;

public class lesson6 {
    public static void main(String[] args) {


//        List<String> music = new ArrayList<>();

//        Set<String> unqiue = new HashSet<>();
//        Set<String> duplicate = new HashSet<>();

//        music.add("let me down");
//        music.add("belive");
//        music.add("sun");
//        music.add("another friend");
//        music.add("sun");
//
//        for (String i : music) {
//            boolean isduplicate = unqiue.add(i);
//            if(!isduplicate){
//
//            }
//        }
//        System.out.println(unqiue);
//        System.out.println(duplicate);


//        List<String> game = new ArrayList<>();




//        HashMap<String, Integer> studentScores = new HashMap<>();

//        studentScores.put("Aziz",90);
//        studentScores.put("Gulnoza",67);
//        studentScores.put("Bahrom",80);
//        studentScores.put("Aziz",88);
//
//        System.out.println(studentScores.get("Aziz"));



//1
//     HashMap<String, Integer> shoppingScores = new HashMap<>();
//
//      2. Mahsulotlarni qo'shamiz
//     shoppingScores.put("pepsi", 15000);
//     shoppingScores.put("non", 5000);
//     shoppingScores.put("banana", 10000);
//     shoppingScores.put("guruch", 20000);
//     shoppingScores.put("choy", 18000);
//     shoppingScores.put("gel", 22000);
//     shoppingScores.put("shakar", 16000);
//
//     Scanner scanner = new Scanner(System.in);
//
//      3. Barcha mahsulotlarni chiqaramiz
//     System.out.println("Barcha mahsulotlar:");
//     System.out.println(shoppingScores);
//
//     // 4. Mahsulotni qidiramiz
//     System.out.print("Mahsulot nomini kiriting: ");
//     String product = scanner.nextLine();
//
//     if (shoppingScores.containsKey(product)) {
//      System.out.println("Narxi: " + shoppingScores.get(product));
//     } else {
//      System.out.println("Product not found");
//     }
//
//     // 5. Mahsulot narxini yangilaymiz
//     System.out.print("Narxini o'zgartirmoqchi bo'lgan mahsulot: ");
//     String updateProduct = scanner.nextLine();
//
//     if (shoppingScores.containsKey(updateProduct)) {
//      System.out.print("Yangi narxni kiriting: ");
//      int newPrice = scanner.nextInt();
//      scanner.nextLine();
//
//      shoppingScores.put(updateProduct, newPrice);
//      System.out.println("Narx yangilandi!");
//     } else {
//      System.out.println("Product not found");
//     }
//
//     // 6. Mahsulotni o'chiramiz
//     System.out.print("O'chirmoqchi bo'lgan mahsulot: ");
//     String deleteProduct = scanner.nextLine();
//
//     if (shoppingScores.containsKey(deleteProduct)) {
//      shoppingScores.remove(deleteProduct);
//      System.out.println("Mahsulot o'chirildi!");
//     } else {
//      System.out.println("Product not found");
//     }
//
//     // 7. Mahsulotlar sonini chiqaramiz
//     System.out.println("Mahsulotlar soni: " + shoppingScores.size());
//
//     // Yangilangan mahsulotlarni chiqaramiz
//     System.out.println("Yakuniy mahsulotlar:");
//     System.out.println(shoppingScores);
//
//     // 8. Challenge: 100000 so'mdan qimmat mahsulotlar
//     System.out.println("100000 so'mdan qimmat mahsulotlar:");
//
//     for (Map.Entry<String, Integer> entry : shoppingScores.entrySet()) {
//      if (entry.getValue() > 100000) {
//       System.out.println(entry.getKey() + " - " + entry.getValue());
//      }
//     }
//
//     scanner.close();


//2
     HashMap<String, Integer>  phoneScanners = new HashMap<>();

     phoneScanners.put("lola", 905430323);
     phoneScanners.put("Sardor", 933539987);
     phoneScanners.put("Rayhon", 553220923);
     phoneScanners.put("Bobur", 915431234);
     phoneScanners.put("Barchin", 943563828);
     phoneScanners.put("Jahona",937657676);

     Scanner Scanner = new Scanner(System.in);

     System.out.println("Barcha Raqamlar");
     System.out.println(phoneScanners);

     System.out.println("Telefon raqam");
     String product = scanner.nextLine();

     



















 }
}
