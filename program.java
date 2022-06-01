// +Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму.
// Пример 1: а = 3, b = 2, ответ: 9
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1
// Пример 4: а = 0, b = 0, ответ: не определено
// Пример 5
// входные данные находятся в файле input.txt в виде
// b 3
// a 10
// Результат нужно сохранить в файле output.txt
// 1000
// import java.io.IOException;
// import java.util.Scanner;
// import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.FileReader;
// import java.util.Scanner;
// import java.io.FileWriter;
// public class program {
//     public static void main(String[] args) {
//         int degreded[] = {3,2,3,0};
//         int by_num[] = {2,-2,0,0};
//         for (int i = 0; i < by_num.length; i++) {
//             if (degreded[i] == 0 & by_num[i] == 0) {
//                 System.out.println("Undefined");
//             } else {
//             System.out.println(Math.pow(degreded[i], by_num[i]));
//             }
//         }
//         }
//     }

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.*;
public class program {
  public static void main(String[] args) {
    try {
      File myObj = new File("C:\\Users\\dani7\\Desktop\\java lessons\\input.txt");
      Scanner myReader = new Scanner(myObj);
      int[] ls = new int[2];
      int i = 0;
      while (myReader.hasNextLine()) {
          String data = myReader.nextLine();
          String datanew = data.replaceAll("([a-z= ])", "");
          int newty = Integer.parseInt(datanew);
          ls[i] = newty;
          i += 1;
        }
        System.out.println(Math.pow(ls[0], ls[1]));
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}