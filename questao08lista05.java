import java.util.Scanner;

public class questao08lista05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0, ini = 1;
         while (ini <= 100) {
            soma = soma + ini;
            ini++;
         }
  System.out.println("soma é de: " + soma);
         
    }
}
