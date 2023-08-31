import java.util.Scanner;

public class questao15lista05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while (num <=50) {
            if (num % 3 != 0) {
                System.out.println(num);
            }
            num++;
        }
    }
}
