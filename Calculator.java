import java.util.Scanner;

public class Calculator {
    // Class that allows us do simple such a rational calculations,
    // and more complicated such as complex calculations
    public static void main(String[] args) {

        int type;

        Scanner myObj = new Scanner(System.in);
        System.out.println("welcome to complex and rational calculator!");
        System.out.println("To calculate complex equanties press 1 or for rational press 2");
        // try-catch to catch errors
        try {
            type = myObj.nextInt();
            if (type == 1) {
                rational_calc();
            }
            if (type == 2) {
                complex_calc();
            } else {
                System.out.println("Choose only 1 or 2!");
            }
        } catch (Exception e) {
            System.out.println("Invalid operator!\nTry again!");
        }
        myObj.close();
    }

    static void rational_calc() {

        char operator;
        double num1, num2, result;

        Scanner myObj = new Scanner(System.in);

        System.out.println("enter first number");
        num1 = myObj.nextDouble();

        System.out.println("choose arithmetic operation \n+\n-\n/\n*");
        operator = myObj.next().charAt(0);

        System.out.println("enter second number");
        num2 = myObj.nextDouble();

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;

            case '/':
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
        }
        myObj.close();
    }

    static void complex_calc() {
        //whole elements we using
        char operator;
        double num1, num2, num3, num4, result1, result2;

        Scanner myObj = new Scanner(System.in);
        System.out.println("enter first number of first equation:");
        num1 = myObj.nextDouble();

        System.out.println("enter second number of first equation:");
        num2 = myObj.nextDouble();

        System.out.println("choose arithmetic operation \n+\n-\n/\n*");
        operator = myObj.next().charAt(0);

        System.out.println("enter first number of second equation:");
        num3 = myObj.nextDouble();

        System.out.println("enter second number of second equation:");
        num4 = myObj.nextDouble();

        switch (operator) {
            case '+':
                result1 = num1 + num2;
                result2 = num3 + num4;
                System.out.println("First complex number:" + num1 + " + " + "i" + num2);
                System.out.println("Second complex number:" + num3 + " + " + "i" + num4);
                System.out.println("Addition is:" + result1 + "+" + result2 + "i");
                break;

            case '-':
                result1 = num1 + num2;
                result2 = num3 + num4;
                System.out.println("First complex number:" + num1 + " + " + "i" + num2);
                System.out.println("Second complex number:" + num3 + " + " + "i" + num4);
                System.out.println("Ыubtraction is:" + result1 + "-" + result2 + "i");
                break;

            case '/':
                result1 = num1 + num2;
                result2 = num3 + num4;
                System.out.println("First complex number:" + num1 + " + " + "i" + num2);
                System.out.println("Second complex number:" + num3 + " + " + "i" + num4);
                System.out.println("Division is:" + result1 + "/" + result2 + "i");
                break;

            case '*':
                result1 = num1 + num2;
                result2 = num3 + num4;
                System.out.println("First complex number:" + num1 + " + " + "i" + num2);
                System.out.println("Second complex number:" + num3 + " + " + "i" + num4);
                System.out.println("Multiplying is:" + result1 + "*"  + result2 + "i");
                break;

            default:
                System.out.println("Invalid operator!");

                myObj.close();
        }
    }
}
