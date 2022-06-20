public class TASK4 {
    public static void tower(int n, int pos1, int pos2, int pos3) {
      if (n == 1) {
          System.out.printf("%d -> %d\n", pos1, pos3);
      } else {
        tower(n - 1, pos1, pos3, pos2);
          System.out.printf("%d -> %d\n", pos1, pos3);
      
          tower(n - 1, pos2, pos1, pos3);
      }
    }
    
    public static void main(String[] args) {
        tower(3,1,2,3);
    }
  }
  