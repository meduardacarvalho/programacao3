import java.util.Scanner;

public class questao02lista05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, soma = 0;
        System.out.println("digite um numero inteiro: ");
        numero = sc.nextInt();

        while (numero != 0) {
            soma = soma + numero % 10;
            numero /= 10;
        }

        System.out.println("A soma dos digitos é: " + soma);
        }

    }

