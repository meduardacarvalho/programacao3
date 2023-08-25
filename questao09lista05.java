import java.util.Scanner;

public class questao09lista05 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int produto = 1;
        int i = 1;

        while (i <= 5) {
            produto *= i;
            i++;
        }

        System.out.println("Produto: " + produto);
    }
     }

