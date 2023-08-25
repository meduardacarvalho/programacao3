import java.util.Scanner;

public class questao06lista05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int num, soma = 0, digito;
        System.out.println("digite um numero inteiro: ");
        num = sc.nextInt();
        while (num != 0) {
             digito = num % 10;
            if (digito % 2 == 0) {
                soma += digito;
            }
            num /= 10;
        }
        
        System.out.println("A soma dos dígitos pares é: " + soma);
    }
}
          
