import java.util.Scanner;

public class questao14lista05 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int num = 1;
        while (num <= 100) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
            num++;
        } 
      }
}
