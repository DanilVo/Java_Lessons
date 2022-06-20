// +Написать программу вычисления n-ого треугольного числа.
public class TASK3 {
    public static void n(int n) {
        // int n = 10;  //Num of steps
      for (int i = 1; i < n; i++) {
        double d = (i*(i+1)*0.5);
        System.out.println((int)d);
      }
    }

    public static void main(String[] args) {
      n(10);
    }
}
