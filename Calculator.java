import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("welcome to complex and rational calculator!");
            System.out.println("To calculate complex equanties press 1 or for rational press 2");
            int type = myObj.nextInt();
            if (type == 1) {
                complex_calc();
            } if (type == 2) {

            } else {
                System.out.println("choose 1 or 2");
            }
        }
    }
    static void complex_calc() {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("enter first number");
                    double num1 = myObj.nextDouble();
                    System.out.println("enter second number");
                    double num2 = myObj.nextDouble();
                    try (Scanner opers = new Scanner(System.in)) {
                        System.out.println("choose arithmetic operation \n1: +\n2: -\n3: /\n4: *");
                        int oper = opers.nextInt();
                        if (oper == 1) {
                            double res = num1 + num2;
                            System.out.println("result = " + res);
                        }
                        if (oper == 2) {
                            double res = num1 - num2;
                            System.out.println("result = " + res);
                        }
                        if (oper == 3) {
                            double res = num1 / num2;
                            System.out.println("result = " + res);
                        }
                        if (oper == 4) {
                            double res = num1 * num2;
                            System.out.println("result = " + res);
                        }
                    }
        }
    }
}












//     static double complex_nums() {
//         try (Scanner nums = new Scanner(System.in)) {
//             System.out.println("enter first number");
//             double num1 = nums.nextDouble();
//             System.out.println("enter second number");
//             double num2 = nums.nextDouble();
//             return num1;
//             return num2;
            
//         }
//     }
    
//     static double complex_calc(double num1, double num2) {
//         Scanner opers = new Scanner(System.in);
//         System.out.println("choose arithmetic operation (+,-,/,*)");
//         String oper = opers.nextLine();
//         if (oper == "+") {
//                 double res = num1 + num2;
//                 System.out.println("result = " + res);
//             }
//             if (oper == "-") {
//                 double res = num1 - num2;
//                 System.out.println("result = " + res);
//             }
//             if (oper == "/") {
//                 double res = num1 / num2;
//                 System.out.println("result = " + res);
//             }
//             if (oper == "*") {
//                 double res = num1 * num2;
//                 System.out.println("result = " + res);
//             }
//         }
// }


// String oper = nums.nextLine();
//             if (oper == "+") {
//                 double res = num1 + num2;
//                 System.out.println("result = " + res);
//             }
//             if (oper == "-") {
//                 double res = num1 - num2;
//                 System.out.println("result = " + res);
//             }
//             if (oper == "/") {
//                 double res = num1 / num2;
//                 System.out.println("result = " + res);
//             }
//             if (oper == "*") {
//                 double res = num1 * num2;
//                 System.out.println("result = " + res);
//             }